package N01;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-14
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 * <p/>
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * <p/>
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class N017_LetterCombinationsOfAPhoneNumber {
    String transform(char c) {
        switch (c) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return "";
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < digits.length(); ++i) {
            char c = digits.charAt(i);
            String str = transform(c);
            if (ans.isEmpty()) {
                for (int j = 0; j < str.length(); ++j) {
                    ans.add(str.charAt(j) + "");
                }
            } else {
                List<String> tmp = new ArrayList<>();
                for (int j = 0; j < str.length(); ++j) {
                    for (int k = 0; k < ans.size(); ++k) {
                        tmp.add(ans.get(k) + str.charAt(j));
                    }
                }
                ans = tmp;
            }
        }
        return ans;
    }
}
