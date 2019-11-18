package ru.job4j.list;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    private List<User> listOfUsers = List.of(
            new User(1, "Alex", "Moscow"),
            new User(2, "Jane", "Samara"),
            new User(3, "John", "Rostov")
    );

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
