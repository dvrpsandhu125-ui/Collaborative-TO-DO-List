package use_case.create_editing_task;

import entity.Task;


public interface CreateTaskDataAccessInterface {
    void saveTask(Task task);

    Task getTask(String taskId);

    int generateTaskId();

    interface TaskDataAccessInterface {

        void saveTask(Task task);

        Task getTask(String id);

        String generateTaskId();
    }
}
