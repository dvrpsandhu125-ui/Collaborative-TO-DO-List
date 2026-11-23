package use_case.create_editing_task.creating_task.manage_dashboard;

public interface ManageDashboardOutputBoundary {
    /**
     * Prepares the success view for the Manage Dashboard Use Case.
     * @param outputData the output data.
     */
    void prepareSuccessView(ManageDashboardOutputData outputData);


    /**
     * Prepares the failure view for the Manage Dashboard Use Case.
     * @param errorMessage the explanation of the failure.
     */
    void prepareFailView(String errorMessage);

}
