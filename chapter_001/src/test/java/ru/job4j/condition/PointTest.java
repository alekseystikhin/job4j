package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        double expected = 2.82;
        double out = new Point(1, 1).distance(new Point(3, 3));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        double expected = 8.66;
        double out = new Point(-1, 3, 3).distance3d(new Point(6, 2, -2));
        Assert.assertEquals(expected, out, 0.01);
    }
}
