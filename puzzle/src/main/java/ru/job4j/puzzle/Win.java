package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if ((board[index][index] == 1) && (monoVertical(board, index) || monoHorizontal(board, index))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

}
