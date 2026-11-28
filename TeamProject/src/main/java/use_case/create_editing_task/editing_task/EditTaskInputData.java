package use_case.create_editing_task.editing_task;

import entity.User;

import java.time.LocalDate;
import java.util.List;

public class EditTaskInputData {
    private final String group_id;
    private final int task_id;
    private final String name;
    private final String description;
    private final String status;
    private final LocalDate deadline;
    private final String location;
    private final List<User> assignedMembers;


    public EditTaskInputData(
            String group_id,
            int task_id,
            String name,
            String description,
            String status,
            LocalDate deadline,
            String location,
            List<User> assignedMembers) {

        this.group_id = group_id;
        this.task_id = task_id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.deadline = deadline;
        this.location = location;
        this.assignedMembers = assignedMembers;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {return status;}

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getLocation() {
        return location;
    }

    public List<User> getAssignedMembers() {
        return assignedMembers;
    }

    public String getGroup_id() {return group_id;}

    public int getTask_id() {return task_id;}

}

