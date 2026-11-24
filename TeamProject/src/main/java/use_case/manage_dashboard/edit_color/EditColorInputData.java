package use_case.manage_dashboard.edit_color;

/**
 * The Input Data for the Edit Color Use Case.
 */

public class EditColorInputData {

    private final String color;


    public EditColorInputData(String color){
        this.color = color;
    }

    String getColor(){return color; }

}
