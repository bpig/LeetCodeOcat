package N07;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p/>
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 * <p/>
 * For example, Given board =
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 */
public class N079_WordSearch_B {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (exist(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, int x, int y, String word, int start) {
        if (start >= word.length()) {
            return true;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return false;
        }
        if (board[x][y] == word.charAt(start++)) {
            char c = board[x][y];
            board[x][y] = '#';
            boolean res = exist(board, x + 1, y, word, start)
                    || exist(board, x - 1, y, word, start)
                    || exist(board, x, y + 1, word, start)
                    || exist(board, x, y - 1, word, start);
            board[x][y] = c;
            return res;
        }
        return false;
    }
}
