package ru.job4j.group;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Student implements Comparable<Student> {
    private String name;
    private int scope;

    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .takeWhile(student -> student.getScope() >= bound)
                .collect(Collectors.toList());
    }

    public Student(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    public int getScope() {
        return scope;
    }

    @Override
    public int compareTo(Student s) {
        int result = 0;
        if (s.getScope() != this.getScope()) {
            result = s.getScope() > this.getScope() ? 1 : -1;
        }
        return result;
    }
}