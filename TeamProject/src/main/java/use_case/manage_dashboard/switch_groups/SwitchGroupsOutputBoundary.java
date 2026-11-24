package use_case.manage_dashboard.switch_groups;

public interface SwitchGroupsOutputBoundary {

    /**
     * Prepares the success view for the Switch Groups Use Case.
     * @param outputData the output data.
     */
    void prepareSuccessView(SwitchGroupsOutputData outputData);

    /**
     * Prepares the failure view for the Switch Groups Use Case.
     * @param errorMessage the explanation of the failure.
     */
    void prepareFailureView(String errorMessage);

}
