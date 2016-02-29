package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-27
 */

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable.
 * Only the filled cells need to be validated.
 */
public class N036_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] blocks = new boolean[9][9];
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                int num = c - '1';
                int blockIdx = (i / 3) * 3 + j / 3;
                if (rows[i][num] || columns[j][num] || blocks[blockIdx][num]) {
                    return false;
                }
                rows[i][num] = true;
                columns[j][num] = true;
                blocks[blockIdx][num] = true;
            }
        }
        return true;
    }
}
