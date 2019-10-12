package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                if (sign == 'X') {
                    int countXInCell = 0;
                    int countXInRow = 0;
                    for (int i = 0; i < 5; i++) {
                        if (board[row][i] == 'X') {
                            countXInCell++;
                        }
                        if (board[i][cell] == 'X') {
                            countXInRow++;
                        }
                        if ((countXInCell == board.length) || (countXInRow == board.length)) {
                            result = true;
                        }
                    }
                    return result;
                }
            }
        }
        return result;
    }
}