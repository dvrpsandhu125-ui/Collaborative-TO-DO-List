package use_case.manage_dashboard.edit_password;

import use_case.manage_dashboard.edit_name.EditNameOutputData;

public interface EditPasswordOutputBoundary {
    /**
     * Prepares the success view for the Edit Password Use Case.
     * @param outputData the output data.
     */
    void prepareSuccessView(EditPasswordOutputData outputData);


    /**
     * Prepares the failure view for the Edit Password Use Case.
     * @param errorMessage the explanation of the failure.
     */
    void prepareFailView(String errorMessage);

}
