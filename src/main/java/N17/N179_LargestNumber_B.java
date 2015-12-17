package N17;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-14
 */

import java.util.*;

/**
 * Given a list of non negative integers,
 * arrange them such that they form the largest number.
 * <p/>
 * For example, given [3, 30, 34, 5, 9],
 * the largest formed number is 9534330.
 * <p/>
 * Note: The result may be very large,
 * so you need to return a string instead of an integer.
 */
public class N179_LargestNumber_B {

    class Bigger implements Comparator<Integer> {
        List<Integer> trans(Integer i) {
            List<Integer> lt = new ArrayList<>();
            while (i != 0) {
                int v = i % 10;
                lt.add(v);
                i /= 10;
            }
            Collections.reverse(lt);
            return lt;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
            List<Integer> i1 = trans(o1);
            List<Integer> i2 = trans(o1);
            int len = Math.max(i1.size(), i2.size());
            for (int i = 0; i < len; ++i) {
                int n1 = i < i1.size() ? i1.get(i) : 9;
                int n2 = i < i2.size() ? i2.get(i) : 9;
                if (n1 == n2) {
                    continue;
                }
                return n2 - n1;
            }
            return 0;
        }
    }

    // some slow
    // collections is slow ??
    public String largestNumberA(int[] nums) {
        List<String> ls = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            ls.add(Integer.toString(nums[i]));
        }
        Collections.sort(ls, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) > s2.charAt(i)) {
                    return 1;
                } else if (s1.charAt(i) < s2.charAt(i)) {
                    return -1;
                }
            }
            // same as charAt compare
            // return s2.compareTo(s1);
            return 0;
        });
        //remove leading zeros.

        int k = 0;
        while (k < ls.size() - 1 && ls.get(k).equals("0")) {
            k++;
        }

        //output the result.
        StringBuffer sb = new StringBuffer();
        for (int i = k; i < ls.size(); i++) {
            sb.append(ls.get(i));
        }
        return sb.toString();
    }

    public String largestNumberB(int[] nums) {
        Integer[] nn = new Integer[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            nn[i] = nums[i];
        }
        Arrays.sort(nn, new Bigger());
        StringBuffer sb = new StringBuffer();
        for (int n : nn) {
            sb.append(n);
        }
        return sb.toString();
    }

    public String largestNumber(int[] nums) {
        NumStr[] n = new NumStr[nums.length];
        for (int i = 0; i < nums.length; i++) {
            n[i] = new NumStr(nums[i]);
        }
        Arrays.sort(n);
        int idx = 0;
        while (idx < n.length - 1 && n[idx].num.equals("0")) {
            idx++;
        }
        StringBuilder b = new StringBuilder();
        for (int i = idx; i < n.length; i++) {
            b.append(n[i].num);
        }
        return b.toString();
    }

    class NumStr implements Comparable<NumStr> {
        String num;

        public NumStr(int n) {
            this.num = Integer.toString(n);
        }

        @Override
        public int compareTo(NumStr n) {
            String s1 = n.num + this.num;
            String s2 = this.num + n.num;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) > s2.charAt(i)) {
                    return 1;
                } else if (s1.charAt(i) < s2.charAt(i)) {
                    return -1;
                }
            }
            return 0;
        }
    }
}