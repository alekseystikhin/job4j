package ru.job4j.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class SortDepartmentsTest {
    SortDepartments sortDepartments = new SortDepartments();
    List<String> orgs = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        orgs.addAll(Arrays.asList(
                "K1\\SK1",
                "K1\\SK2",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K2",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"));
    }

    @After
    public void tearDown() throws Exception {
        orgs.clear();
    }

    @Test
    public void ascSortTest() {
        List<String> expected = List.of(
                "K1\\SK1",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K1\\SK2",
                "K2",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2");

        sortDepartments.ascSort(orgs);
        Assert.assertThat(orgs, is(expected));
    }

    @Test
    public void descSortTest() {
        List<String> expected = List.of(
                "K2",
                "K2\\SK1\\SSK2",
                "K2\\SK1\\SSK1",
                "K1\\SK2",
                "K1\\SK1",
                "K1\\SK1\\SSK2",
                "K1\\SK1\\SSK1");

        sortDepartments.descSort(orgs);
        Assert.assertThat(orgs, is(expected));
    }

    @Test
    public void fillGapsTest() {
        List<String> expected = List.of(
                "K1\\SK1",
                "K1\\SK2",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K2",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2",
                "K1",
                "K2\\SK1");

        sortDepartments.fillGaps(orgs);
        Assert.assertThat(orgs, is(expected));
    }
}
