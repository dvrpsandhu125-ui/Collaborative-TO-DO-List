package entity;

public class GroupFactory {
    public Group create(String groupName, int groupId) { return new Group(groupName, groupId); }
}
