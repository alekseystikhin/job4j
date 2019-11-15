package ru.job4j.diapason.ru.job4j.filtration;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
