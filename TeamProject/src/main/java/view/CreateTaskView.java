package view;

import entity.User;
import interface_adapters.creating_editing_task.CreateTaskController;
import interface_adapters.creating_editing_task.CreateTaskViewModel;
import interface_adapters.creating_editing_task.CreateTaskViewModelListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateTaskView extends JPanel implements ActionListener, CreateTaskViewModelListener {

    private final String viewName = "create task";
    private final CreateTaskViewModel createTaskViewModel;
    private CreateTaskController createTaskController;

    private final JTextField nameField = new JTextField(20);
    private final JTextArea descriptionField = new JTextArea(5, 20);
    private final JTextField deadlineField = new JTextField(20);
    private final JTextField locationField = new JTextField(20);
    private final JList<User> assignedMembersList = new JList<>();
    private final JLabel errorLabel = new JLabel();

    private final JButton createButton = new JButton("Create Task");
    private final JButton cancelButton = new JButton("Cancel");

    public CreateTaskView(CreateTaskViewModel createTaskViewModel) {

        this.createTaskViewModel = createTaskViewModel;
        this.createButton.addActionListener(this);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(new JLabel("Create New Task"));

        add(new JLabel("Task Name"));
        add(nameField);

        add(new JLabel("Description"));
        add(new JScrollPane(descriptionField));

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

        add(buttons);

        createButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }
    @Override
    public void stateChanged() {


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
