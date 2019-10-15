package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 120;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2 dollar. Test result : " + passed);

        in = 140;
        expected = 9800;
        out = euroToRuble(140);
        passed = expected == out;
        System.out.println("140 euros are 9800 rubles. Test result : " + passed);

        expected = 8400;
        out = dollarToRuble(140);
        passed = expected == out;
        System.out.println("140 dollars are 8400 rubles. Test result : " + passed);
    }
}