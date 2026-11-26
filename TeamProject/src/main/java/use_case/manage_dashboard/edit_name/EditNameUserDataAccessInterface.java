package use_case.manage_dashboard.edit_name;

import entity.User;
/**
 * The DAO interface for the Edit Name Use Case.
 */

public interface EditNameUserDataAccessInterface {

    /**
     * Checks if the user's requested new username already exists.
     * @param username the username that needs to be checked.
     * @return True if the new username is already taken, False otherwise.
     */
    boolean usernameTaken(String username);

    /**
     * Updates the system to record this user's username.
     * @param user the user whose username are to be updated/edited.
     */
    void saveUsername(User user);

}
