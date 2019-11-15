package ru.job4j.filtration;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    List<Student> studentsOf9A = List.of(
            new Student(100),
            new Student(51),
            new Student(10)
    );
    School school = new School();

    @Test
    public void addStudentsTo10ATest() {
        List<Student> actual = school.collect(studentsOf9A, student -> student.score > 70 && student.score <= 100);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(100));
        assertThat(actual, is(expected));
    }

    @Test
    public void addStudentsTo10BTest() {
        List<Student> actual = school.collect(studentsOf9A, student -> student.score > 50 && student.score <= 70);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(51));
        assertThat(actual, is(expected));
    }

    @Test
    public void addStudentsTo10CTest() {
        List<Student> actual = school.collect(studentsOf9A, student -> student.score >= 0 && student.score <= 50);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(10));
        assertThat(actual, is(expected));
    }
}
