package ru.job4j.diapason;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonTest {
    private final static int LOGBASE = 5;
    private Diapason function = new Diapason();

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenqQuadraticFunctionThenQuadraticResults() {
        List<Double> result = function.diapason(5, 8, x -> Math.pow(x, 2) + 3 * x + 1);
        List<Double> expected = Arrays.asList(41D, 55D, 71D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        List<Double> result = function.diapason(5, 8, x -> Math.log(x) / Math.log(LOGBASE));
        List<Double> expected = Arrays.asList(
                1.0D,
                1.1132827525593785D,
                1.2090619551221675D);
        assertThat(result, is(expected));
    }
}
