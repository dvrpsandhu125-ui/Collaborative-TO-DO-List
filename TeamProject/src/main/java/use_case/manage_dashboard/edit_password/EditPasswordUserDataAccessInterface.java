package use_case.manage_dashboard.edit_password;

import entity.User;

public interface EditPasswordUserDataAccessInterface {
    /**
     * Returns the user with the given username, or null if none exists.
     *
     * @param username the username to look up
     * @return the matching user, or null
     */
    User get(String username);

    /**
     * Updates the system to record this user's password.
     *
     * @param user the user whose password is to be updated/edited.
     */
    void savePassword(User user);

}
