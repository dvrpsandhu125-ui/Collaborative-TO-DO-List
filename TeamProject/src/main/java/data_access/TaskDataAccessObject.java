package data_access;

import entity.Task;

public abstract class TaskDataAccessObject {
    abstract void saveTask(Task task);

    public abstract Task getTask(int task_id);

    public abstract Task getTask(String task_id);
}
