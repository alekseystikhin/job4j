package ru.job4j.oop;

import org.junit.Test;
import ru.job4j.oop.DummyDic;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyDicTest {
    @Test
    public void testEngToRus() {
        String result = new DummyDic().engToRus("one");
        assertThat(result, is("Неизвестное слово. one"));
    }
}
