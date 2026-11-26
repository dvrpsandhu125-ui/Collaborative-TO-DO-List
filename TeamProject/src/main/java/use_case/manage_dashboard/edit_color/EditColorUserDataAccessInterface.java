package use_case.manage_dashboard.edit_color;

import entity.User;

/**
 * The DAO interface for the Edit Color Use Case.
 */

public interface EditColorUserDataAccessInterface {

    /**
     * Updates the system to record this user's color.
     *
     * @param user the user whose color are to be updated/edited.
     */

    void saveColor(User user);
}
