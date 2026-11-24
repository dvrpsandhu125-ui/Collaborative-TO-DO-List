package use_case.manage_dashboard.edit_name;

/**
 * The Edit Name Use Case.
 */

public interface EditNameInputBoundary {

    /**
     * Execute the Manage Dashboard Use Case.
     * @param editNameInputData the input data for this use case.
     */
    void execute(EditNameInputData editNameInputData);
}