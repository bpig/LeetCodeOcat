package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-27
 */

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable.
 * Only the filled cells need to be validated.
 */
public class N036_ValidSudoku_B {

    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] block = new boolean[9][9];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == '.') {
                    continue;
                }
                int value = board[i][j] - '1';
                int blockIdx = i / 3 * 3 + j / 3;
                if (row[i][value] || column[j][value] || block[blockIdx][value]) {
                    return false;
                }
                row[i][value] = true;
                column[j][value] = true;
                block[blockIdx][value] = true;
            }
        }
        return true;
    }
}
