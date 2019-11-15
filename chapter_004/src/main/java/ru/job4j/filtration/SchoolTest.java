package ru.job4j.filtration;

import java.util.List;

public class SchoolTest {

    public static void main(String[] args) {
        List<Student> studentsOf9A = List.of(
                new Student(100),
                new Student(51),
                new Student(10)
        );
        SchoolTest schoolTest = new SchoolTest();
        School school = new School();
        List<Student> students10A = schoolTest.addStudentsTo10A(school, studentsOf9A);
        List<Student> students10B = schoolTest.addStudentsTo10B(school, studentsOf9A);
        List<Student> students10C = schoolTest.addStudentsTo10C(school, studentsOf9A);
    }

    public List<Student> addStudentsTo10A(School school, List<Student> includedStudents) {
        List<Student> students10A = school.collect(includedStudents, student -> student.score > 70 && student.score <= 100);
        return students10A;
    }

    public List<Student> addStudentsTo10B(School school, List<Student> includedStudents) {
        List<Student> students10B = school.collect(includedStudents, student -> student.score > 50 && student.score <= 70);
        return students10B;
    }

    public List<Student> addStudentsTo10C(School school, List<Student> includedStudents) {
        List<Student> students10C = school.collect(includedStudents, student -> student.score >= 0 && student.score <= 50);
        return students10C;
    }
}
