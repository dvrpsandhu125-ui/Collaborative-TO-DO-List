package use_case.manage_dashboard.edit_password;

/**
 * Output Data for the Edit Password Use Case.
 */

public class EditPasswordOutputData {
    private final String password;

    public EditPasswordOutputData(String password) {
        this.password = password;
    }

    public String getPassword() { return password; }

}
