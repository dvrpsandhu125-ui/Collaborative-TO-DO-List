package use_case.manage_dashboard.switch_groups;

public class SwitchGroupsInputData {
    private final String groupName;

    public SwitchGroupsInputData(String groupName){
        this.groupName = groupName;
    }

    String getGroupName(){return groupName; }
}
