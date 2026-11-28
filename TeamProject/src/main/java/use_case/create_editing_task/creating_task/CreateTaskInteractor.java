package use_case.create_editing_task.creating_task;

import entity.Task;
import use_case.create_editing_task.CreateTaskDataAccessInterface;

/**
 * Create Task Interactor.
 */
public class CreateTaskInteractor implements CreateTaskInputBoundary{
    private final CreateTaskDataAccessInterface createTaskDataAccessObject;
    private final CreateTaskOutputBoundary createTaskPresenter;


    public CreateTaskInteractor(CreateTaskDataAccessInterface createTaskDataAccesObject,
                                CreateTaskOutputBoundary createTaskPresenter) {
        this.createTaskDataAccessObject = createTaskDataAccesObject;
        this.createTaskPresenter = createTaskPresenter;
    }


    @Override
    public void execute(CreateTaskInputData createTaskInputData) {
        if (createTaskInputData.getName() == null ||
                createTaskInputData.getName().isBlank()) {
            createTaskPresenter.prepareFailView("Task name cannot be empty.");
    }
        if (createTaskInputData.getDescription() == null ||
                createTaskInputData.getDescription().isBlank()) {
            createTaskPresenter.prepareFailView("Task description cannot be empty.");
        }

        if (createTaskInputData.getDescription().length() > 200) {
            createTaskPresenter.prepareFailView("The description cannot exceed 200 character.");
        }
        else{
            int taskId = createTaskDataAccessObject.generateTaskId();
            final Task task = new Task(createTaskInputData.getGroup_id(),
                    taskId,
                    createTaskInputData.getName(),
                    createTaskInputData.getDescription(),
                    createTaskInputData.getStatus(),
                    createTaskInputData.getDeadline(),
                    createTaskInputData.getLocation(),
                    createTaskInputData.getAssignedMembers()
            );

            createTaskDataAccessObject.saveTask(task);
        }
    }
}
