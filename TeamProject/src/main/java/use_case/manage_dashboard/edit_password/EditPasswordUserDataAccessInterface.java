package use_case.manage_dashboard.edit_password;

import entity.User;

public interface EditPasswordUserDataAccessInterface {
    /**
     * Updates the system to record this user's password.
     *
     * @param user the user whose password are to be updated/edited.
     */
    void editPassword(User user);

}
