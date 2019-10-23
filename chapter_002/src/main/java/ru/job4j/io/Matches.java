package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private int count = 11;

    public static void main(String[] args) {
        new Matches().getMatches();
    }

    private void getMatches() {
        Scanner input = new Scanner(System.in);
        String player = "первый";
        while (count > 0) {
            System.out.print("Введите количество спичек, которые берет " + player + " игрок:");
            int select = Integer.parseInt(input.nextLine());
            if ((select >= 1) && (select <= 3) && (select <= count)) {
                count -= select;
            } else if ((select >= 1) && (select <= 3)) {
                System.out.println("Можно взять не более: " + count + " штук");
                System.out.println();
                continue;
            } else {
                System.out.println("Можно взять только 1, 2 или 3 спички");
                System.out.println();
                continue;
            }
            System.out.println("Количество оставшихся спичек: " + (Math.max(count, 0)));
            if (count <= 0) {
                return;
            } else {
                System.out.println();
                player = "первый".equals(player) ? "второй" : "первый";
            }

        }
    }
}