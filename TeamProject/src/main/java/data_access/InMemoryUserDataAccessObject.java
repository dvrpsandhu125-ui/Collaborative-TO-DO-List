package data_access;

import entity.User;
import use_case.manage_dashboard.edit_color.EditColorUserDataAccessInterface;
import use_case.manage_dashboard.edit_name.EditNameUserDataAccessInterface;
import use_case.manage_dashboard.edit_password.EditPasswordUserDataAccessInterface;
import use_case.manage_dashboard.switch_groups.SwitchGroupsUserDataAccessInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * In-memory implementation of the DAO for storing user data.
 */


public class InMemoryUserDataAccessObject implements
        EditColorUserDataAccessInterface,
        EditNameUserDataAccessInterface,
        EditPasswordUserDataAccessInterface,
        SwitchGroupsUserDataAccessInterface {

    private final Map<String, User> users = new HashMap<>();

    private String currentUsername;

    @Override
    public void saveColor(User user) {
        users.put(user.getColor(), user);
    }

    @Override
    public boolean usernameTaken(String identifier) {
        return users.containsKey(identifier);
    }

    @Override
    public void saveUsername(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public void savePassword(User user) {
        users.put(user.getPassword(), user);
    }
}
