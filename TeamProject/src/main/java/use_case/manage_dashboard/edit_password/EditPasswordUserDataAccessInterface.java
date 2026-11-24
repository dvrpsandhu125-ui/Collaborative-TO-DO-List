package use_case.manage_dashboard.edit_password;

import entity.User;

public interface EditPasswordUserDataAccessInterface {
    /**
     * Updates the system to record this user's username, password, and color.
     *
     * @param user the user whose username, password, and color are to be updated/edited.
     */
    void editPassword(User user);

}
