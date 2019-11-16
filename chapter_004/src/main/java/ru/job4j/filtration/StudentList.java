package ru.job4j.filtration;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentList {
    Map<String, Student> studentsToMap(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(el -> el.getName(), el -> el));
    }
}
