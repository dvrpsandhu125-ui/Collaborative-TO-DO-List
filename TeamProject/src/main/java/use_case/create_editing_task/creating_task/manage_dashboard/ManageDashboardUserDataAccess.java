package use_case.create_editing_task.creating_task.manage_dashboard;

import entity.User;
/**
 * The DAO interface for the Change Password Use Case.
 */

public interface ManageDashboardUserDataAccess {

    /**
     * Updates the system to record this user's username, password, and color.
     *
     * @param user the user whose username, password, and color are to be updated/edited.
     */
    void editUsername(User user);

    void editPassword(User user);

    void editColor(User user);
}
