package view;

import entity.User;
import interface_adapters.creating_editing_task.CreateTaskController;
import interface_adapters.creating_editing_task.CreateTaskState;
import interface_adapters.creating_editing_task.CreateTaskViewModel;
import interface_adapters.creating_editing_task.CreateTaskViewModelListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class CreateTaskView extends JPanel implements ActionListener, CreateTaskViewModelListener {

    private final String viewName = "create task";
    private final CreateTaskViewModel createTaskViewModel;
    private CreateTaskController createTaskController;

    private final JTextField nameField = new JTextField(20);
    private final JTextArea descriptionField = new JTextArea(5, 20);
    private final JComboBox<String> statusBox =
            new JComboBox<>(new String[]{
                    "Not Started",
                    "In Progress",
                    "Completed"
            });
    private final JTextField deadlineField = new JTextField(20);
    private final JTextField locationField = new JTextField(20);
    private final JList<User> assignedMembersList = new JList<>();
    private final JLabel errorLabel = new JLabel();

    private final JButton createButton = new JButton("Create Task");
    private final JButton cancelButton = new JButton("Cancel");

    public CreateTaskView(CreateTaskViewModel createTaskViewModel) {

        this.createTaskViewModel = createTaskViewModel;
        this.createTaskViewModel.addListener(this);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(new JLabel("Create New Task"));

        add(new JLabel("Task Name"));
        add(nameField);

        add(new JLabel("Description"));
        add(new JScrollPane(descriptionField));

        this.add(new JLabel("Status"));
        this.add(statusBox);

        add(new JLabel("Deadline (YYYY-MM-DD)"));
        add(deadlineField);

        add(new JLabel("Location"));
        add(locationField);

        add(new JLabel("Assigned Members"));
        add(new JScrollPane(assignedMembersList));

        add(errorLabel);

        JPanel buttons = new JPanel();

        buttons.add(cancelButton);
        buttons.add(createButton);


        createButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (evt.getSource().equals(createButton)) {

                    final CreateTaskState currentState =
                            createTaskViewModel.getState();

                    createTaskController.execute(
                            currentState.getGroupId(),
                            currentState.getTaskName(),
                            currentState.getDescription(),
                            currentState.getStatus(),
                            currentState.getDeadline(),
                            currentState.getLocation(),
                            currentState.getAssignedMembers()
                    );
                }
            }
        });
        cancelButton.addActionListener(this);

        nameField.getDocument().addDocumentListener(new DocumentListener() {

            private void documentListenerHelper() {
                final CreateTaskState currentState = createTaskViewModel.getState();
                currentState.setTaskName(nameField.getText());
                createTaskViewModel.setState(currentState);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                documentListenerHelper();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                documentListenerHelper();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                documentListenerHelper();
            }
        });

        descriptionField.getDocument().addDocumentListener(new DocumentListener() {

            private void documentListenerHelper() {
                final CreateTaskState currentState = createTaskViewModel.getState();
                currentState.setDescription(descriptionField.getText());
                createTaskViewModel.setState(currentState);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                documentListenerHelper();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                documentListenerHelper();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                documentListenerHelper();
            }
        });

        statusBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                final CreateTaskState state =
                        createTaskViewModel.getState();

                state.setStatus((String) statusBox.getSelectedItem());

                createTaskViewModel.setState(state);
            }
        });

        deadlineField.getDocument().addDocumentListener(new DocumentListener() {

            private void documentListenerHelper() {
                final CreateTaskState currentState = createTaskViewModel.getState();
                String deadline = deadlineField.getText().trim();

                if (deadline.isEmpty()) {
                    currentState.setDeadline(null);
                } else {
                    currentState.setDeadline(LocalDate.parse(deadline));
                }
                createTaskViewModel.setState(currentState);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                documentListenerHelper();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                documentListenerHelper();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                documentListenerHelper();
            }
        });

        locationField.getDocument().addDocumentListener(new DocumentListener() {

            private void documentListenerHelper() {
                final CreateTaskState currentState = createTaskViewModel.getState();
                if(locationField.getText().isEmpty()) {
                    currentState.setLocation(null);
                }else{
                    currentState.setLocation(locationField.getText());}
                createTaskViewModel.setState(currentState);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                documentListenerHelper();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                documentListenerHelper();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                documentListenerHelper();
            }
        });

        assignedMembersList.addListSelectionListener(
                new ListSelectionListener() {

                    private void updateState() {
                        final CreateTaskState state =
                                createTaskViewModel.getState();

                        if(assignedMembersList.isSelectionEmpty()){
                            state.setAssignedMembers(null);
                        }else{
                            state.setAssignedMembers(
                                assignedMembersList.getSelectedValuesList()
                        );}

                        createTaskViewModel.setState(state);
                    }

                    @Override
                    public void valueChanged(ListSelectionEvent evt) {
                            updateState();
                    }
                });

        add(buttons);
        add(errorLabel);
        add(nameField);
        add(deadlineField);
        add(locationField);
        add(assignedMembersList);
        add(descriptionField);
        add(statusBox);
    }

    public void actionPerformed(ActionEvent evt) {
        System.out.println("Click " + evt.getActionCommand());
    }


    @Override
    public void stateChanged() {
        setFields(createTaskViewModel.getState());
        errorLabel.setText(createTaskViewModel.getState().getError());

    }

    private void setFields(CreateTaskState state){
        nameField.setText( state.getTaskName());
        descriptionField.setText( state.getDescription());
        statusBox.setSelectedItem(state.getStatus());
        deadlineField.setText( state.getDeadline().toString());
        locationField.setText( state.getLocation());
        assignedMembersList.setListData( state.getAssignedMembers().toArray(new User[0]));
    }

    public void setCreateTaskController(CreateTaskController createTaskController) {
        this.createTaskController = createTaskController; }
}
