package use_case.create_editing_task.editing_task;

import entity.Task;
import use_case.create_editing_task.EditTaskDataAccessInterface;
import use_case.create_editing_task.editing_task.EditTaskOutputBoundary;

public class EditTaskInteractor implements EditTaskInputBoundary {

    private final EditTaskDataAccessInterface editTaskDataAccessObject;
    private final EditTaskOutputBoundary editTaskPresenter;

    public EditTaskInteractor(EditTaskDataAccessInterface editTaskDataAccessObject,
                              EditTaskOutputBoundary editTaskPresenter) {
        this.editTaskDataAccessObject = editTaskDataAccessObject;
        this.editTaskPresenter = editTaskPresenter;
    }

    public void execute( EditTaskInputData editTaskInputData) {

        if (editTaskInputData.getName() == null ||
                editTaskInputData.getName().isBlank()) {
            editTaskPresenter.prepareFailView("Task name cannot be empty.");
        }
        if (editTaskInputData.getDescription() == null ||
                editTaskInputData.getDescription().isBlank()) {
            editTaskPresenter.prepareFailView("Task description cannot be empty.");
        }

        if (editTaskInputData.getDescription().length() > 200) {
            editTaskPresenter.prepareFailView("The description cannot exceed 200 character.");
        }
        else{
            final Task task = new Task(editTaskInputData.getGroup_id(),
                    editTaskInputData.getTask_id(),
                    editTaskInputData.getName(),
                    editTaskInputData.getDescription(),
                    editTaskInputData.getStatus(),
                    editTaskInputData.getDeadline(),
                    editTaskInputData.getLocation(),
                    editTaskInputData.getAssignedMembers()
            );

            editTaskDataAccessObject.saveTask(task);
        }
    }
}

