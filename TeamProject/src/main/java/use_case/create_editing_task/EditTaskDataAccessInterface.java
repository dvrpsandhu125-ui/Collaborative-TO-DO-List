package use_case.create_editing_task;

import entity.Task;

public interface EditTaskDataAccessInterface {

    void saveTask(Task task);

    Task getTask(int task_id);
}
