package N29;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-20
 */

/**
 * You are playing the following Bulls and Cows game with your friend:
 * You write down a number and ask your friend to guess what the number is.
 * Each time your friend makes a guess,
 * you provide a hint that indicates how many digits in said guess
 * match your secret number exactly in both digit and position (called "bulls")
 * and how many digits match the secret number but locate in the wrong position (called "cows").
 * Your friend will use successive guesses and hints to eventually derive the secret number.
 * <p/>
 * For example:
 * <p/>
 * Secret number:  "1807"
 * Friend's guess: "7810"
 * Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
 * Write a function to return a hint according to the secret number and friend's guess,
 * use A to indicate the bulls and B to indicate the cows.
 * In the above example, your function should return "1A3B".
 * <p/>
 * Please note that both secret number and friend's guess may contain duplicate digits, for example:
 * <p/>
 * Secret number:  "1123"
 * Friend's guess: "0111"
 * In this case, the 1st 1 in friend's guess is a bull,
 * the 2nd or 3rd 1 is a cow, and your function should return "1A1B".
 * You may assume that the secret number and your friend's guess only contain digits,
 * and their lengths are always equal.
 */
public class N299_BullsAndCows_B {
    public String getHint(String secret, String guess) {
        int[] digits = new int[10];
        int a = 0;
        for (int i = 0; i < secret.length(); ++i) {
            int sc = secret.charAt(i) - '0';
            int gc = guess.charAt(i) - '0';
            digits[sc]++;
            digits[gc]--;
            if (sc == gc) {
                a++;
            }
        }
        int total = secret.length();
        for (int n : digits) {
            if (n > 0) {
                total -= n;
            }
        }
        int b = total - a;
        return a + "A" + b + "B";
    }
    //concise
    public String scoreAPlus(String secret, String guess) {
        int a = 0, b = 0;
        int[] digits = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;
                continue;
            }
            if (++digits[secret.charAt(i) - '0'] <= 0) {
                b++;
            }
            if (--digits[guess.charAt(i) - '0'] >= 0) {
                b++;
            }
        }
        return a + "A" + b + "B";
    }
}
