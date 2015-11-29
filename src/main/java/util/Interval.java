package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-29
 */
public class Interval {
    public int start;
    public int end;

    public Interval() {
        start = 0;
        end = 0;
    }

    public Interval(int s, int e) {
        start = s;
        end = e;
    }

    // 1,3;2,6;8,10;15,18
    public static List<Interval> createList(String str) {
        String[] items = str.split(";");
        List<Interval> list = new ArrayList<>();
        for (String item : items) {
            if (!item.equals("")) {
                list.add(create(item));
            }
        }
        return list;
    }

    public static Interval create(String str) {
        String[] items = str.split(",");
        return new Interval(Integer.valueOf(items[0]),
                Integer.valueOf(items[1]));
    }

    @Override
    public String toString() {
        return "" + start + "," + end;
    }

    public static String toString(List<Interval> lists) {
        if (lists.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lists.get(0));
        for (int i = 1; i < lists.size(); ++i) {
            sb.append(";");
            sb.append(lists.get(i));
        }
        return sb.toString();
    }
}
