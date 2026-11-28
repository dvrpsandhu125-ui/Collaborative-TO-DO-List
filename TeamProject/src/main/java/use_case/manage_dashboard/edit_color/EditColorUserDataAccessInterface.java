package use_case.manage_dashboard.edit_color;

import entity.User;

/**
 * The DAO interface for the Edit Color Use Case.
 */

public interface EditColorUserDataAccessInterface {

    /**
     * Returns the user with the given username, or null if none exists.
     *
     * @param username the username to look up
     * @return the matching user, or null
     */

    User get(String username);

    /**
     * Updates the system to record this user's color.
     *
     * @param user the user whose color are to be updated/edited.
     */

    void saveColor(User user);
}
