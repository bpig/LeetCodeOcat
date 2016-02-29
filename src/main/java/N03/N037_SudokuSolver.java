package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-28
 */

/**
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * Empty cells are indicated by the character '.'.
 * You may assume that there will be only one unique solution.
 */

public class N037_SudokuSolver {
    boolean check(char[][] board, int i, int j, char c) {
        for (int idx = 0; idx < 9; ++idx) {
            if (board[i][idx] == c || board[idx][j] == c) {
                return false;
            }
        }
        int row = i / 3 * 3;
        int column = j / 3 * 3;
        for (int u = row; u < row + 3; u++) {
            for (int v = column; v < column + 3; v++) {
                if (board[u][v] == c) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean recur(char[][] board, int i, int j) {
        if (i == 9) {
            return true;
        }
        if (j == 9) {
            return recur(board, i + 1, 0);
        }
        if (board[i][j] != '.') {
            return recur(board, i, j + 1);
        }
        for (char c = '1'; c <= '9'; ++c) {
            if (check(board, i, j, c)) {
                board[i][j] = c;
                if (recur(board, i, j + 1)) {
                    return true;
                }
                board[i][j] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        recur(board, 0, 0);
    }
}
