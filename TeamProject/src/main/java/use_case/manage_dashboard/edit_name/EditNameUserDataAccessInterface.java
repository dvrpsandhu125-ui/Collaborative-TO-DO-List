package use_case.manage_dashboard.edit_name;

import entity.User;
/**
 * The DAO interface for the Edit Name Use Case.
 */

public interface EditNameUserDataAccessInterface {
    /**
     * Returns the user with the given username, or null if none exists.
     *
     * @param username the username to look up
     * @return the matching user, or null
     */
    User get(String username);

    /**
     * Checks if the user's requested new username already exists.
     *
     * @param username the username that needs to be checked.
     * @return True if the new username is already taken, False otherwise.
     */
    boolean usernameTaken(String username);

    /**
     * Changes the user's old username to the new username.
     *
     * @param oldUsername the old username that needs to be replaced.
     * @param user the user whose username is updated.
     */
    void updateUsername(String oldUsername, User user);
}
