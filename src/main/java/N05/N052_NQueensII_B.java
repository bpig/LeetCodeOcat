package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-28
 */

/**
 * Follow up for N-Queens problem.
 * <p>
 * Now, instead outputting board configurations,
 * return the total number of distinct solutions.
 */
public class N052_NQueensII_B {
    int target;
    int ct = 0;

    public int totalNQueens(int n) {
        target = (1 << n) - 1;
        recur(0, 0, 0);
        return ct;
    }

    void recur(int col, int left, int right) {
        if (col == target) {
            ct++;
        }
        int row = ~(col | left | right) & target;
        while (row > 0) {
            int pos = row & -row;
            row -= pos;
            recur(col | pos, (left | pos) << 1, (right | pos) >> 1);
        }
    }
}
