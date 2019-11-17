package ru.job4j.group;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentTest {

    @Test
    public void whenAddThreeThenTwoSize() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Vasya", 6));
        list.add(new Student("Misha", 7));
        list.add(new Student("Lesha", 1));

        assertThat(Student.levelOf(list, 4).size(), is(2));
    }

    @Test
    public void whenAddThreeAndNullThenTwoSize() {
        List<Student> list = new ArrayList<>();
        list.add(null);
        list.add(new Student("Vasya", 6));
        list.add(new Student("Misha", 7));
        list.add(new Student("Lesha", 1));

        assertThat(Student.levelOf(list, 3).size(), is(2));
    }
}
