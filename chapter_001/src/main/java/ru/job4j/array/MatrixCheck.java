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
                        if ((countXInCell == board.length)) {
                            result = true;
                            return result;
                        }
                    }
                    for (int j = 0; j < 5; j++) {
                        if (board[j][cell] == 'X') {
                            countXInRow++;
                        }
                        if ((countXInRow == board.length)) {
                            result = true;
                            return result;
                        }
                    }
                    return result;
                }
            }
        }
        return result;
    }
}
