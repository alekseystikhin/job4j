package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            char sign = board[row][row];  // тут нужно проверять диагональ
            if (sign == 'X') {
                int countXInCell = 0;
                int countXInRow = 0;
                for (int cell = 0; cell < board.length; cell++) {
                    if (board[row][cell] == 'X') {
                        countXInCell++;
                    }
                    if (board[cell][row] == 'X') {
                        countXInRow++;
                    }
                }
                if (countXInCell == board.length || countXInRow == board.length) {
                    result = true;
                }
                break;
            }
        }
        return result;
    }
}
