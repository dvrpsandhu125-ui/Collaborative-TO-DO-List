package data_access;

import entity.Task;
import use_case.create_editing_task.CreateTaskDataAccessInterface;
import use_case.create_editing_task.EditTaskDataAccessInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * In-memory implementation of the DAO for storing task data. This implementation does
 * NOT persist data between runs of the program.
 */
public class InMemoryTaskDataAccessObject implements CreateTaskDataAccessInterface, EditTaskDataAccessInterface {

    private final Map<Integer, Task> tasks = new HashMap<>();
    private int nextId = 1;

    @Override
    public void saveTask(Task task){
        tasks.put(task.getTask_id(), task);
    }

    @Override
    public Task getTask(int task_id){

        return tasks.get(task_id);
    }

    @Override
    public int generateTaskId(){
        return nextId++;
    }


}
