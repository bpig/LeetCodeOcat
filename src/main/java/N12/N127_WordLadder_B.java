package N12;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-30
 */


import java.util.*;

/**
 * Given two words (beginWord and endWord),
 * and a dictionary's word list,
 * find the length of shortest transformation sequence from beginWord to endWord, such that:
 * <p/>
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the word list
 * For example,
 * <p/>
 * Given:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * <p/>
 * Note:
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 */
public class N127_WordLadder_B {
    boolean transformable(String w0, String w1) {
        int ct = 0;
        for (int i = 0; i < w0.length(); ++i) {
            if (w0.charAt(i) != w1.charAt(i)) {
                ct++;
                if (ct == 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public int score0(String beginWord, String endWord, Set<String> wordList) {
        wordList.add(endWord);
        Deque<String> queue = new ArrayDeque<>();
        int level = 1;
        queue.add(beginWord);
        while (!queue.isEmpty()) {
            int ct = queue.size();
            for (int i = 0; i < ct; ++i) {
                String source = queue.pop();
                Iterator<String> iter = wordList.iterator();
                while (iter.hasNext()) {
                    String word = iter.next();
                    if (transformable(word, source)) {
                        iter.remove();
                        if (word == endWord) {
                            return level + 1;
                        }
                        queue.add(word);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        wordList.add(endWord);
        Deque<String> queue = new ArrayDeque<>();
        int level = 1;
        queue.add(beginWord);
        while (!queue.isEmpty()) {
            int ct = queue.size();
            for (int i = 0; i < ct; ++i) {
                String source = queue.pop();
                for (int j = 0; j < source.length(); ++j) {
                    char[] chars = source.toCharArray();
                    for (char c = 'a'; c <= 'z'; ++c) {
                        chars[j] = c;
                        String word = new String(chars);
                        if (wordList.contains(word)) {
                            if (word.equals(endWord)) {
                                return level + 1;
                            }
                            queue.add(word);
                            wordList.remove(word);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }

}
