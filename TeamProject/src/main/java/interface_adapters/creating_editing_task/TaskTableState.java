package interface_adapters.creating_editing_task;

import entity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskTableState {
    private int groupId;
    private List<Task> tasks = new ArrayList<>();

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
}
