package ru.job4j.profile;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    List<Profile> profiles = List.of(
            new Profile(new Address("Moscow", "Tverskaya", 1, 5)),
            new Profile(new Address("Rostov", "Lenina", 2, 6)),
            new Profile(new Address("Anapa", "Stalina", 3, 7)),
            new Profile(new Address("Anapa", "Stalina", 3, 7))
    );
    List<Address> expected = new ArrayList<>();

    @After
    public void tearDown() throws Exception {
        expected.clear();
    }

    @Test
    public void collectTest() {
        expected.add(new Address("Moscow", "Tverskaya", 1, 5));
        expected.add(new Address("Rostov", "Lenina", 2, 6));
        expected.add(new Address("Anapa", "Stalina", 3, 7));
        expected.add(new Address("Anapa", "Stalina", 3, 7));

        List<Address> actual = new Profiles().collect(profiles);
        assertThat(actual, is(expected));
    }

    @Test
    public void collectUniqueTest() {
        expected.add(new Address("Anapa", "Stalina", 3, 7));
        expected.add(new Address("Moscow", "Tverskaya", 1, 5));
        expected.add(new Address("Rostov", "Lenina", 2, 6));

        List<Address> actual = new Profiles().collectUnique(profiles);
        assertThat(actual, is(expected));
    }

}
