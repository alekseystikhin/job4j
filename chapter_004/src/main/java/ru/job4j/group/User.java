package ru.job4j.group;

import java.util.List;

public class User {
    private String name;
    List<String> email;

    public User(String name, List<String> email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", email=" + email + '}';
    }
}
