package N26;

/**
 * Created by wenwen.xww on 2015/11/2.
 */
public class N263_UglyNumber_O {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (true) {
            if (num%2 != 0) {
                break;
            }
            num /= 2;
        }
        while (true) {
            if (num%3 != 0) {
                break;
            }
            num /= 3;
        }
        while (true) {
            if (num%5 != 0) {
                break;
            }
            num /= 5;
        }
        if (num == 1) {
            return true;
        }
        return false;
    }
}
