package use_case.manage_dashboard.edit_name;

/**
 * Output Data for the Dashboard Use Case.
 */

public class EditNameOutputData {

    private final String username;

    public EditNameOutputData(String username) {
        this.username = username;
    }

    public String getUsername() { return username; }

}
