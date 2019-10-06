package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        double expected = 98.9;
        double out = Fit.manWeight(186);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double expected = 63.25;
        double out = Fit.womanWeight(165);
        Assert.assertEquals(expected, out, 0.01);
    }
}
