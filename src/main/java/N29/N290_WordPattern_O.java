package N29;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenwen.xww on 2015/10/6.
 */
public class N290_WordPattern_O {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> mm = new HashMap<>();
        String[] array = str.split(" ");
        int i = 0;
        int j = 0;
        for (; i < pattern.length(); i++) {
            for (; j < array.length; j++) {
                if (mm.containsKey(pattern.charAt(i))) {
                    if (!mm.get(pattern.charAt(i)).equals(array[j])) {
                        return false;
                    }
                } else {
                    mm.put(pattern.charAt(i), array[j]);
                }
            }
        }
        if (pattern.length() == i && array.length == j) {
            return true;
        }
        return false;

    }
}
