package ru.job4j.filtration;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {

    @Test
    public void matrixToListTest() {
        MatrixToList matrixToList = new MatrixToList();
        Integer[][] integers = {{1, 2}, {3, 4}};
        List<Integer> actual = matrixToList.matrixToList(integers);
        List<Integer> expected = new ArrayList<>();
        for (Integer[] i : integers) {
            expected.addAll(Arrays.asList(i));
        }

        assertThat(actual, is(expected));
    }
}
