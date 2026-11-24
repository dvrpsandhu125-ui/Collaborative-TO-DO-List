package use_case.manage_dashboard.edit_password;

/**
 * The Input Data for the Edit Password Use Case.
 */

public class EditPasswordInputData {
    private final String password;


    public EditPasswordInputData(String password){
        this.password = password;
    }


    String getPassword(){return password; }

}
