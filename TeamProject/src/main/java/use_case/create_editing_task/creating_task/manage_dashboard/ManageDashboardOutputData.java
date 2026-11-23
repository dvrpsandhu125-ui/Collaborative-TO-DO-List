package use_case.create_editing_task.creating_task.manage_dashboard;

/**
 * Output Data for the Dashboard Use Case.
 */

public class ManageDashboardOutputData {

    private final String username;
    private final String color;

    public ManageDashboardOutputData(String username, String color) {
        this.username = username;
        this.color = color;
    }

    public String getUsername() { return username; }

    public String getColor() { return color;}
}
