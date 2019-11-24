package ru.job4j.group;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class UsersGroupingByEmailTest {
    UsersGroupingByEmail usersGroupingByEmail = new UsersGroupingByEmail();
    List<User> users = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        users.add(new User("A", List.of("a@a.ru", "a@b.ru")));
        users.add(new User("B", List.of("c@a.ru", "d@a.ru")));
        users.add(new User("C", List.of("a@a.ru", "a@b.ru")));
    }

    @After
    public void tearDown() throws Exception {
        users.clear();
    }

    @Test
    public void groupingUsersByEmailTest() {
        Map<String, List<String>> expected = new TreeMap<>();
        expected.put("a@a.ru", new ArrayList<>(Arrays.asList("A", "C")));
        expected.put("a@b.ru", new ArrayList<>(Arrays.asList("A", "C")));
        expected.put("c@a.ru", new ArrayList<>(Arrays.asList("B")));
        expected.put("d@a.ru", new ArrayList<>(Arrays.asList("B")));

        Map<String, List<String>> actual = usersGroupingByEmail.groupingUsersByEmail(users);
        assertThat(actual, is(expected));
    }
}
