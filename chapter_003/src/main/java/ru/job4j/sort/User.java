package ru.job4j.sort;

public class User implements Comparable {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.age, ((User) o).age);
    }
}
