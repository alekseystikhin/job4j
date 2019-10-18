package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        double expected = 1.49;
        double result = new Triangle(new Point(1, 1), new Point(2, 2), new Point(4, 1)).area();
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenNotExist() {
        double expected = -1;
        double result = new Triangle(new Point(1, 1), new Point(2, 2), new Point(0, 0)).area();
        Assert.assertEquals(expected, result, 0.01);
    }
}