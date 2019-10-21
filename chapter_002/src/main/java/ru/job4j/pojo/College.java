package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иван Иванович Собакевич");
        student.setGroup("Группа 1");
        student.setAcceptanceDate(new Date());
        System.out.println(student.getFio() + " из группы: \"" + student.getGroup()
                + "\", поступил в университет: " + student.getAcceptanceDate());
    }
}
