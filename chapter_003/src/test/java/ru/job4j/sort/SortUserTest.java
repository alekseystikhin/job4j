package ru.job4j.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;

public class SortUserTest {
    private final SortUser sortUser = new SortUser();
    List<User> users = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        users.addAll(Arrays.asList(
                new User("Lisa", 17),
                new User("Alex", 14),
                new User("Lena", 12)));
    }

    @After
    public void tearDown() throws Exception {
        users.clear();
    }

    @Test
    public void testSort() {
        Set<User> expected = new TreeSet<>();
        expected.add(new User("Lena", 12));
        expected.add(new User("Alex", 14));
        expected.add(new User("Lisa", 17));
        Set<User> actual = sortUser.sort(users);
        Assert.assertThat(actual, is(expected));
    }

    @Test
    public void testsortNameLength() {
        List<User> actual = new ArrayList<>();
        actual.add(new User("Сергей", 25));
        actual.add(new User("Игорь", 30));
        actual.add(new User("Семен", 20));
        actual.add(new User("Иван", 25));

        List<User> expected = new ArrayList<>();
        expected.add(new User("Иван", 25));
        expected.add(new User("Игорь", 30));
        expected.add(new User("Семен", 20));
        expected.add(new User("Сергей", 25));

        actual = sortUser.sortNameLength(actual);
        Assert.assertThat(actual, is(expected));
    }

    @Test
    public void testsortByAllFields() {
        List<User> actual = new ArrayList<>();
        actual.add(new User("Сергей", 25));
        actual.add(new User("Иван", 30));
        actual.add(new User("Сергей", 20));
        actual.add(new User("Иван", 25));

        List<User> expected = new ArrayList<>();
        expected.add(new User("Иван", 25));
        expected.add(new User("Иван", 30));
        expected.add(new User("Сергей", 20));
        expected.add(new User("Сергей", 25));

        actual = sortUser.sortByAllFields(actual);
        Assert.assertThat(actual, is(expected));
    }
}
