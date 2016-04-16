package N07;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/3/27
 */

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 * <p>
 * For example,
 * Given board =
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 */
public class N079_WordSearch {
    boolean recur(char[][] board, int i, int j, String word, int pos) {
        if (pos == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        char c = board[i][j];
        if (c != word.charAt(pos++)) {
            return false;
        }

        board[i][j] = '#';
        boolean ans = recur(board, i - 1, j, word, pos)
                || recur(board, i + 1, j, word, pos)
                || recur(board, i, j - 1, word, pos)
                || recur(board, i, j + 1, word, pos);
        board[i][j] = c;

        return ans;
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (recur(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
