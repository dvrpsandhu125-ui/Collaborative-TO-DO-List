package entity;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Task {
    private final String groupId;
    private final int task_id;
    private final String task_name;
    private final String task_description;
    private final String task_status;
    private final String location;
    private final LocalDate deadline;
    private final List<User> assignedMembers;

    public Task(String groupId, int id, String name, String description, String status, LocalDate deadline, String location, List<User> assignedMembers){
        this.groupId = groupId;
        this.task_name = name;
        this.task_description = description;
        this.task_id = id;

        this.task_status = status;
        this.location = location;
        this.deadline = deadline;
        this.assignedMembers = assignedMembers;
    }

    public int getTask_id() {
        return task_id;
    }
    public String getTask_name() {
        return task_name;
    }

    public String getTask_description() { return task_description;}

    public String getTask_status() { return task_status;}

    public String getLocation() { return location;}

    public LocalDate getDeadline() { return deadline;}

    public List<User> getAssignedMembers() { return assignedMembers;}

    public String getGroupId() { return groupId; }
}
