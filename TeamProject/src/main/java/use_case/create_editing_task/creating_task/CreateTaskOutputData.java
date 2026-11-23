package use_case.create_editing_task.creating_task;

import entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreateTaskOutputData {

    private final int task_id;
    private final String group_id;
    private final String task_name;
    private final String task_description;
    private final String task_status;
    private final String location;
    private final LocalDate deadline;
    private final List<User> assignedMembers;

    public CreateTaskOutputData(
            int id,
            String group_id,
            String name,
            String description,
            String task_status,
            String location,
            LocalDate deadline,
            List<User> assignedMembers){

        this.task_id = id;
        this.group_id = group_id;
        this.task_name = name;
        this.task_description = description;

        this.task_status = task_status;
        this.location = location;
        this.deadline = deadline;
        this.assignedMembers = assignedMembers;
    }

    public int getTask_id() {
        return task_id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public String getTask_description() {
        return task_description;
    }

    public String getTask_status() {
        return task_status;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public List<User> getAssignedMembers() {
        return assignedMembers;
    }
}
