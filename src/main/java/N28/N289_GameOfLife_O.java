package N28;

/**
 * Created by wenwen.xww on 2015/10/5.
 */

/**
 * \
 * According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * <p/>
 * Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 * <p/>
 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * Write a function to compute the next state (after one update) of the board given its current state.
 * <p/>
 * Follow up:
 * Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
 * In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
 */

public class N289_GameOfLife_O {
    public boolean isNeighborLive(int[][] board, int i, int j) {
        if (i >= 0 && i < board.length && j >= 0 && j < board[0].length) {
            if (board[i][j] == 1 || board[i][j] == 3) {
                return true;
            }
        }
        return false;
    }
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int live;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                live = 0;
                for (int s = -1 ; s < 2; s++) {
                    for (int t = -1; t < 2; t++) {
                        if (s == 0 && t == 0) {
                            continue;
                        }
                        if (isNeighborLive(board,i+s,j+t)) {
                            live++;
                        }
                    }
                }

                if (board[i][j] == 1 && live < 2) {
                    board[i][j] = 3;
                }
                if (board[i][j] == 1 && (live == 2 || live == 3)) {
                    board[i][j] = 1;
                }
                if (board[i][j] == 1 && live > 3) {
                    board[i][j] = 3;
                }
                if (board[i][j] == 0 && live == 3) {
                    board[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j =0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                } else if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
            }
        }
    }
}
