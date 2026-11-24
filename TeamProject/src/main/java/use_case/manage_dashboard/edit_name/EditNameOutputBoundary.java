package use_case.manage_dashboard.edit_name;

public interface EditNameOutputBoundary {
    /**
     * Prepares the success view for the Manage Dashboard Use Case.
     * @param outputData the output data.
     */
    void prepareSuccessView(EditNameOutputData outputData);


    /**
     * Prepares the failure view for the Manage Dashboard Use Case.
     * @param errorMessage the explanation of the failure.
     */
    void prepareFailView(String errorMessage);

}
