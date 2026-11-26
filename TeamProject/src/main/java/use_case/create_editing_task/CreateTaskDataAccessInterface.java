package use_case.create_editing_task;

import entity.Task;


public interface CreateTaskDataAccessInterface {
    void saveTask(Task task);

    Task getTask(int task_id);

    int generateTaskId();

}
