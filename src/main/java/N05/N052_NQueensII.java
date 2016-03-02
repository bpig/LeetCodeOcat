package N05;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */

/**
 * Follow up for N-Queens problem.
 * <p>
 * Now, instead outputting board configurations,
 * return the total number of distinct solutions.
 */

public class N052_NQueensII {
    int ct;

    void recur(long target, long column, long left, long right) {
        if (target == column) {
            ct++;
            return;
        }
        long row = ~(column | left | right) & target;
        while (row != 0) {
            long pos = row & -row;
            recur(target, column | pos, (left | pos) << 1, (right | pos) >> 1);
            row -= pos;
        }
    }

    public int totalNQueens(int n) {
        ct = 0;
        long target = (1 << n) - 1;
        recur(target, 0, 0, 0);
        return ct;
    }
}
