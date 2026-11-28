package use_case.manage_dashboard.switch_groups;

import entity.Group;

public interface SwitchGroupsUserDataAccessInterface {
    /**
     * Returns the group that the user selected.
     *
     * @param groupName the group the user selected.
     */
    Group getGroup(String groupName);
}
