package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void getPassengers(int numberOfPassengers) {
        System.out.println("Село в автобус: " + numberOfPassengers);
    }

    @Override
    public double refuel(double petrol) {
        double price = 50;
        return petrol * price;
    }
}
