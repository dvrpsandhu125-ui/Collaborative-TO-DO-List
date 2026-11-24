package use_case.manage_dashboard.switch_groups;

import use_case.manage_dashboard.edit_password.EditPasswordInputData;

/**
 * The Switch Groups Use Case.
 */

public interface SwitchGroupsInputBoundary {
    /**
     * Execute the Switch Groups Use Case.
     * @param switchGroupsInputData the input data for this use case.
     */

    void execute(SwitchGroupsInputData switchGroupsInputData);
}
