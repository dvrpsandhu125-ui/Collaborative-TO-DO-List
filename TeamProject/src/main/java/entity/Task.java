package entity;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Task {
    private final int task_id;
    private final String group_id;
    private final String task_name;
    private final String task_description;
    private final String task_status;
    private final String location;
    private final LocalDate deadline;
    private final List<User> assignedMembers;
    private boolean is_deleted;

    public Task(int id, String group_id, String name, String description){
        this.task_id = id;
        this.group_id = group_id;
        this.task_name = name;
        this.task_description = description;

        this.task_status = "NOT_STARTED";
        this.location = null;
        this.deadline = null;
        this.assignedMembers = new ArrayList<>();
        this.is_deleted = false;
    }
}
