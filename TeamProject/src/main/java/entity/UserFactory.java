package entity;

public class UserFactory {
    public User create(String name, String password, String color) { return new User(name, password, color); }
}
