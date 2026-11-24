package use_case.manage_dashboard.edit_password;

public class EditPasswordOutputData {
    private final String password;

    public EditPasswordOutputData(String password) {
        this.password = password;
    }

    public String getPassword() { return password; }

}
