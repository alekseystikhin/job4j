package ru.job4j.tracker;

public class Engineer extends Profession {
    String designOffice;

    public Engineer(String name) {
        super(name);
    }

    public Invention work(Task task) {
        return new Invention("default invention");
    }
}
