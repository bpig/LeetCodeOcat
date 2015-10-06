package N28;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-05
 */

/**
 * According to the Wikipedia's article:
 * "The Game of Life, also known simply as Life,
 * is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * <p/>
 * Given a board with m by n cells, each cell has an initial state live (1) or dead (0).
 * Each cell interacts with its eight neighbors (horizontal, vertical, diagonal)
 * using the following four rules (taken from the above Wikipedia article):
 * <p/>
 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * Write a function to compute the next state (after one update) of the board given its current state.
 * <p/>
 * Follow up:
 * Could you solve it in-place?
 * Remember that the board needs to be updated at the same time:
 * You cannot update some cells first and then use their updated values to update other cells.
 * In this question, we represent the board using a 2D array.
 * In principle, the board is infinite,
 * which would cause problems when
 * How would you address these problems?
 */
public class N289_GameOfLife_B {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                int lives = 0;
                for (int l = -1; l <= 1; ++l) {
                    for (int m = -1; m <= 1; ++m) {
                        int row = i + l;
                        int col = j + m;
                        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
                            continue;
                        }
                        if (l == 0 && m == 0) { continue; }
                        int value = board[row][col] & 1;
                        if (value == 1) { lives++; }
                    }
                }
                int self = board[i][j] & 1;
                if (self == 1 && (lives == 2 || lives == 3)) {
                    self = 3;
                }
                if (self == 0 && lives == 3) {
                    self = 2;
                }
                board[i][j] = self;
            }
        }
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                board[i][j] = board[i][j] >> 1;
            }
        }
    }
}







