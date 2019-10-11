package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (true) {
            amount = Math.abs(amount);
            year++;
            amount += (amount * (double) (percent / 100));
            amount = salary - amount;
            if (amount > 0) {
                break;
            }
        }
        return year;
    }
}