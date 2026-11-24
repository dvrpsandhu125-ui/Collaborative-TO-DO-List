package use_case.manage_dashboard.edit_name;

/**
 * The Input Data for the Edit Name Use Case.
 */

public class EditNameInputData {

    private final String username;


    public EditNameInputData(String username){
        this.username = username;
    }

    String getUsername(){return username; }

}
