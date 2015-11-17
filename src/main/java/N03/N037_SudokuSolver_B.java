package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */

/**
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * Empty cells are indicated by the character '.'.
 * You may assume that there will be only one unique solution.
 */
public class N037_SudokuSolver_B {
    boolean check(char[][] board, int i, int j, char val) {
        for (int x = 0; x < 9; x++) {
            if (board[x][j] == val) {
                return false;
            }
        }
        for (int y = 0; y < 9; y++) {
            if (board[i][y] == val) {
                return false;
            }
        }
        int row = i - i % 3;
        int column = j - j % 3;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (board[row + x][column + y] == val) {
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
        for (char c = '1'; c <= '9'; c++) {
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
