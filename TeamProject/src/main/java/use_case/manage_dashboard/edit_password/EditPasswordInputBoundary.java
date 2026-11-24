package use_case.manage_dashboard.edit_password;

import use_case.manage_dashboard.edit_name.EditNameInputData;

/**
 * The Edit Password Use Case.
 */

public interface EditPasswordInputBoundary {

    /**
     * Execute the Manage Dashboard Use Case.
     * @param editPasswordInputData the input data for this use case.
     */
    void execute(EditPasswordInputData editPasswordInputData);
}
