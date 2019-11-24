package ru.job4j.group;

import java.util.*;

public class UsersGroupingByEmail {
    public Map<String, List<String>> groupingUsersByEmail(List<User> users) {
        Map<String, List<String>> mapOfEmails = new TreeMap<>();
        users.stream().forEach(user ->
                user.getEmails()
                        .forEach(email -> {
                            if (mapOfEmails.containsKey(email)) {
                                mapOfEmails.get(email).add(user.getName());
                            } else {
                                List<String> listOfNames = new ArrayList<>();
                                listOfNames.add(user.getName());
                                mapOfEmails.put(email, listOfNames);
                            }

                        }));
        return mapOfEmails;
    }
}
