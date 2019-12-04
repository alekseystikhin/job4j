package ru.job4j.generic;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@SuppressWarnings("unchecked")
public class UserStoreTest {
    private Store us;

    @Before
    public void setUp() throws Exception {
        us = new UserStore(3);
    }

    @After
    public void tearDown() throws Exception {
        us = null;
    }

    @Test
    public void addTest() {
        User expected = new User("1");
        us.add(expected);
        assertThat(us.findById("1"), is(expected));
    }

    @Test
    public void replaceTest() {
        User expected = new User("2");
        us.add(new User("1"));
        us.replace("1", expected);
        assertThat(us.findById("2"), is(expected));
    }

    @Test
    public void deleteTest() {
        User expected = new User("1");
        us.add(expected);
        us.delete("1");
        Assert.assertEquals(null, us.findById("1"));
    }

    @Test
    public void findByIdTest() {
        User expected = new User("2");
        us.add(new User("1"));
        us.add(expected);
        us.add(new User("3"));
        assertThat(us.findById("2"), is(expected));
    }
}
