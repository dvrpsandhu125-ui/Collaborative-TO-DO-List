package interface_adapters.creating_editing_task;

import entity.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreateTaskState {
    private String taskName = "";
    private String description = "";
    private String status = "";
    private LocalDate deadline = null;
    private String location = "";
    private List<User> assignedMembers = new ArrayList<>();
    private String error;

    public String getTaskName() {return taskName;}
    public String getDescription() {return description;}
    public String getStatus() {return status;}
    public LocalDate getDeadline() {return deadline;}
    public String getLocation() {return location;}
    public List<User> getAssignedMembers() {return assignedMembers;}
    public String error() {return error;}

    public void setTaskName(String taskName) {this.taskName = taskName;}
    public void setDescription(String description) {this.description = description;}
    public void setStatus(String status) {this.status = status;}
    public void setDeadline(LocalDate deadline) {this.deadline = deadline;}
    public void setLocation(String location) {this.location = location;}

    public void setError(String error) {
        this.error = error;
    }
}
