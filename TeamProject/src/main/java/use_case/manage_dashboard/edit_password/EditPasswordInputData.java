package use_case.manage_dashboard.edit_password;

public class EditPasswordInputData {
    private final String password;


    public EditPasswordInputData(String password){
        this.password = password;
    }


    String getPassword(){return password; }

}
