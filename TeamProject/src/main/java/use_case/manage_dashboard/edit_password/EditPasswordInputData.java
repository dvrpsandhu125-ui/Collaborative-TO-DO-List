package use_case.manage_dashboard.edit_password;

/**
 * The Input Data for the Edit Password Use Case.
 */

public class EditPasswordInputData {
    private final String username;
    private final String password;


    public EditPasswordInputData(String username, String password){
        this.username = username;
        this.password = password;
    }

    String getUsername() {
        return username;
    }

    String getPassword() {
        return password;
    }

}
