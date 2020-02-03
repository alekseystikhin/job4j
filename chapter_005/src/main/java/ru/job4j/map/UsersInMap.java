package ru.job4j.map;

import java.util.HashMap;

public class UsersInMap {
    private User user1;
    private User user2;
    private HashMap<User, Object> mapOfUsers = new HashMap<>();

    public void createAndPutUsersInMap() {
        user1 = new User("Alex", 1, null);
        user2 = new User("Alex", 1, null);
        mapOfUsers.put(user1, "first");
        mapOfUsers.put(user2, "second");
        System.out.println(mapOfUsers);
    }
}
