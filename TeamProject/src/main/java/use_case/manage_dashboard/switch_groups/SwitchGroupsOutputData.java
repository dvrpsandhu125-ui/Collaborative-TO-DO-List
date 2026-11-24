package use_case.manage_dashboard.switch_groups;

/**
 * Output Data for the Switch Groups Use Case.
 */

public class SwitchGroupsOutputData {
    private final String groupName;

    public SwitchGroupsOutputData(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
