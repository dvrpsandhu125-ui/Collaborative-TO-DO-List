package interface_adapters.creating_editing_task;

import entity.Task;
import use_case.create_editing_task.creating_task.CreateTaskOutputBoundary;
import use_case.create_editing_task.creating_task.CreateTaskOutputData;

public class CreateTaskPresenter implements CreateTaskOutputBoundary {

    private final TaskTableViewModel taskViewModel;
    private final CreateTaskViewModel createTaskViewModel;


    public CreateTaskPresenter( TaskTableViewModel taskViewModel,  CreateTaskViewModel createTaskViewModel) {
        this.taskViewModel = taskViewModel;
        this.createTaskViewModel = createTaskViewModel;
    }

    @Override
    public void prepareSuccessView(CreateTaskOutputData response){
        // We need to update the task table view, which should shows the created task.
        // We need to update/clear create task view model that state is changed.
        final TaskTableState taskTableState = taskViewModel.getState();
        Task newTask = new Task(
                response.getTask_id(),
                response.getTask_name(),
                response.getTask_description(),
                response.getTask_status(),
                response.getDeadline(),
                response.getLocation(),
                response.getAssignedMembers());

        taskTableState.addTask(newTask);
        taskViewModel.notifyStateChanged();

        createTaskViewModel.setState(new CreateTaskState());
        createTaskViewModel.notifyStateChanged();

    }

    @Override
    public void prepareFailView( String error){
        final CreateTaskState createTaskState = createTaskViewModel.getState();
        createTaskState.setError(error);
        createTaskViewModel.notifyStateChanged();
    }
}
