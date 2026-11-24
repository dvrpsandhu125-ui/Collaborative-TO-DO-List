package use_case.manage_dashboard.edit_password;

/**
 * The Edit Password Use Case.
 */

public interface EditPasswordInputBoundary {

    /**
     * Execute the Edit Password Use Case.
     * @param editPasswordInputData the input data for this use case.
     */

    void execute(EditPasswordInputData editPasswordInputData);
}
