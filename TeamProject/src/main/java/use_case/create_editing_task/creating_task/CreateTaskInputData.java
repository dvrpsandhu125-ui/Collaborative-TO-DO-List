package use_case.create_editing_task.creating_task;

import java.time.LocalDate;
import java.util.List;

public class CreateTaskInputData {
    private final String name;
    private final String description;
    private final LocalDate deadline;
    private final String location;
    private final List<String> assignedMembers;
    private final String group_id;

    public CreateTaskInputData(
            String name,
            String description,
            LocalDate deadline,
            String location,
            List<String> assignedMembers, String group_id) {

        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.location = location;
        this.assignedMembers = assignedMembers;
        this.group_id = group_id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getLocation() {
        return location;
    }

    public List<String> getAssignedMembers() {
        return assignedMembers;
    }

    public String getGroup_id() {
        return group_id;
    }

}
