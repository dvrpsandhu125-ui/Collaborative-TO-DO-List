package use_case.create_editing_task.creating_task.manage_dashboard;

/**
 * The Manage Dashboard Use Case.
 */

public interface ManageDashboardInputBoundary {

    /**
     * Execute the Manage Dashboard Use Case.
     * @param manageDashboardInputData the input data for this use case.
     */
    void execute(ManageDashboardInputData manageDashboardInputData);
}