package ru.job4j.generic;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@SuppressWarnings("unchecked")
public class RoleStoreTest {
    private Store rs;

    @Before
    public void setUp() throws Exception {
        rs = new RoleStore(3);
    }

    @After
    public void tearDown() throws Exception {
        rs = null;
    }

    @Test
    public void addTest() {
        Role expected = new Role("1");
        rs.add(expected);
        assertThat(rs.findById("1"), is(expected));
    }

    @Test
    public void replaceTest() {
        Role expected = new Role("2");
        rs.add(new Role("1"));
        rs.replace("1", expected);
        assertThat(rs.findById("2"), is(expected));
    }

    @Test
    public void deleteTest() {
        Role expected = new Role("1");
        rs.add(expected);
        rs.delete("1");
        Assert.assertEquals(null, rs.findById("1"));
    }

    @Test
    public void findByIdTest() {
        Role expected = new Role("2");
        rs.add(new Role("1"));
        rs.add(expected);
        rs.add(new Role("3"));
        assertThat(rs.findById("2"), is(expected));
    }
}
