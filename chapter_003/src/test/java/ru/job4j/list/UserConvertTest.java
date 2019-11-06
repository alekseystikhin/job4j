package ru.job4j.list;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    private final List<User> listOfUsers = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        listOfUsers.add(new User(1, "Alex", "Moscow"));
        listOfUsers.add(new User(2, "Jane", "Samara"));
        listOfUsers.add(new User(3, "John", "Rostov"));
    }

    @After
    public void tearDown() throws Exception {
        listOfUsers.clear();
    }

    @Test
    public void testProcess() throws Exception {
        UserConvert userConvert = new UserConvert();
        HashMap<Integer, User> result = userConvert.process(listOfUsers);
        HashMap<Integer, User> expected = new HashMap<>();
        for (User user : listOfUsers) {
            expected.put(user.getId(), user);
        }

        assertThat(result, is(expected));
    }
}
