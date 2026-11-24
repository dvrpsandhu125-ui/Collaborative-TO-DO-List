package use_case.manage_dashboard.edit_color;

import use_case.manage_dashboard.edit_name.EditNameOutputData;

public interface EditColorOutputBoundary {
    /**
     * Prepares the success view for the Edit Color Use Case.
     * @param outputData the output data.
     */
    void prepareSuccessView(EditColorOutputData outputData);


    /**
     * Prepares the failure view for the Edit Color Use Case.
     * @param errorMessage the explanation of the failure.
     */
    void prepareFailView(String errorMessage);

}
