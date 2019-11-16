package ru.job4j.filtration;


import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentsListTest {
    StudentList studentList = new StudentList();

    @Test
    public void studentsToMapTest() {
        List<Student> list = List.of(new Student("Vasya", 20),
                new Student("Misha", 30),
                new Student("Lesha", 40));
        Map<String, Student> expected = new HashMap<>();
        list.forEach(el -> expected.put(el.getName(), el));

        Map<String, Student> actual = studentList.studentsToMap(list);

        assertThat(actual, is(expected));

    }
}
