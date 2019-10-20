package ru.job4j.tracker;

public class Profession {
    String name;
    String surname;
    String education;
    String birthday;

    public Profession(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }
}
