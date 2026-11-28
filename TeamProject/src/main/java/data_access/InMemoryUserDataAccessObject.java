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
        EditPasswordUserDataAccessInterface
{

    private final Map<String, User> users = new HashMap<>();

    public void save(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public User get(String username) {
        return users.get(username);
    }

    @Override
    public void saveColor(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public boolean usernameTaken(String identifier) {
        return users.containsKey(identifier);
    }

    @Override
    public void updateUsername(String oldUsername, User user) {
        users.remove(oldUsername);
        users.put(user.getName(), user);
    }

    @Override
    public void savePassword(User user) {
        users.put(user.getName(), user);
    }
}
