package use_case.manage_dashboard.edit_color;

/**
 * Output Data for the Edit Color Use Case.
 */

public class EditColorOutputData {
    private final String color;

    public EditColorOutputData(String color) {
        this.color = color;
    }

    public String getColor() { return color;}
}
