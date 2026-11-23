package use_case.create_editing_task.creating_task.manage_dashboard;

/**
 * The Input Data for the Dashboard Use Case.
 */

public class ManageDashboardInputData {

    private final String password;
    private final String username;
    private final String color;


    public ManageDashboardInputData(String password, String username, String color){
        this.password = password;
        this.username = username;
        this.color = color;
    }


    String getPassword(){return password; }


    String getUsername(){return username; }


    String getColor(){return color; }
}
