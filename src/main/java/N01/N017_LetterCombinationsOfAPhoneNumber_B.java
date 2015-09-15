package N01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-13
 */
public class N017_LetterCombinationsOfAPhoneNumber_B {
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
        }
        return "";
    }

    public void recurComb(StringBuilder builder, String digits, int idx) {
        if (idx == digits.length()) {
            if (idx != 0) {
                combinations.add(builder.toString());
            }
            return;
        }
        String letter = transform(digits.charAt(idx));
        for (int i = 0; i < letter.length(); ++i) {
            builder.append(letter.charAt(i));
            recurComb(builder, digits, idx + 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
    private List<String> combinations = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        StringBuilder builder = new StringBuilder();
        recurComb(builder, digits, 0);
        return combinations;
    }
}









