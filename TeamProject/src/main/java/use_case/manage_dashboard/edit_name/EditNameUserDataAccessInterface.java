package use_case.manage_dashboard.edit_name;

import entity.User;
/**
 * The DAO interface for the Change Password Use Case.
 */

public interface EditNameUserDataAccessInterface {

    /**
     * Updates the system to record this user's username, password, and color.
     *
     * @param user the user whose username, password, and color are to be updated/edited.
     */
    void editUsername(User user);

    void editPassword(User user);

    void editColor(User user);
}
