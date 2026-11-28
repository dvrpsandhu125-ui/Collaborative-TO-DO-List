package use_case.manage_dashboard.edit_color;

/**
 * The Input Data for the Edit Color Use Case.
 */

public class EditColorInputData {

    private final String username;
    private final String color;


    public EditColorInputData(String username, String color) {
        this.username = username;
        this.color = color;
    }

    String getUsername() {
        return username;
    }

    String getColor() {
        return color;
    }

}
