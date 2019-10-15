package ru.job4j.loop;

public class Slash {
    /**
     * @param size - размер фигуры для отрисовки.
     *             left - переменная, в которой определяется условия для отрисовки диагонали в нижний правый угол
     *             right - переменная, в которой определяется условия для отрисовки диагонали в верхний правый угол
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = size - 1 - row == cell;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}