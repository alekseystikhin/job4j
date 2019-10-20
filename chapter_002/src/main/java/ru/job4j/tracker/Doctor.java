package ru.job4j.tracker;

public class Doctor extends Profession {
    String hospitalName;

    public Doctor(String name) {
        super(name);
    }

    public Diagnose heal(Pacient pacient) {
        return new Diagnose("default diagnose");
    }
}
