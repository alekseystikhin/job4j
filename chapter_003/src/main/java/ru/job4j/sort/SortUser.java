package ru.job4j.sort;

import java.util.*;

public class SortUser {
    public Set<User> sort(List<User> users) {
        return new TreeSet<>(users);
    }

    public List<User> sortNameLength(List<User> users) {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.name.length(), o2.name.length());
            }
        });
        return users;
    }

    public List<User> sortByAllFields(List<User> users) {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int result = o1.name.compareTo(o2.name);
                if (o1.name == o2.name) {
                    result = Integer.compare(o1.age, o2.age);
                }
                return result;
            }
        });
        return users;
    }
}
