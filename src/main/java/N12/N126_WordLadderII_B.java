package N12;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-10-01
 */

import java.util.*;

/**
 * Given two words (beginWord and endWord), and a dictionary's word list,
 * find all shortest transformation sequence(s) from beginWord to endWord, such that:
 * <p/>
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the word list
 * For example,
 * <p/>
 * Given:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * Return
 * [
 * ["hit","hot","dot","dog","cog"],
 * ["hit","hot","lot","log","cog"]
 * ]
 * Note:
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 */
public class N126_WordLadderII_B {
    class node {
        String word;
        List<String> pre;

        public node(String word, List<String> pre) {
            this.word = word;
            this.pre = pre;
        }
    }

    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        List<List<String>> ans = new ArrayList<>();
        // Queue for BFS
        Queue<node> q = new LinkedList<>();
        // Prepare for the first node
        List<String> first = new ArrayList<>();  // Define path list
        first.add(beginWord);
        q.offer(new node(beginWord, first)); // Add the first node in the queue
        wordList.remove(beginWord);             // After adding beginWord in the queue, make sure it doesn't appear in the list
        // Prepare for the map
        Map<String, List<List<String>>> map = new HashMap<>();  // Use map to memorize paths to each string in the middle
        List<List<String>> start = new ArrayList<>();   // Insert the first mapping for beginWord
        start.add(first);
        map.put(beginWord, start);
        wordList.add(endWord);                  // Add endWord into the list

        while (!q.isEmpty()) {
            // Level by level, get the number of nodes for each level
            int n = q.size();
            Set<String> set = new HashSet<>(); // data structure to track words that are transferred from wordList to queue
            // Scann the level
            while (n-- > 0) {
                node cur = q.poll();
                String word = cur.word;
                if (word.equals(endWord)) {
                    return map.get(word);
                } else {
                    // find all words in the list that are only one-character different than the current one
                    char[] arr = word.toCharArray();
                    for (int i = 0; i < arr.length; i++) {
                        for (char c = 'a'; c <= 'z'; c++) {
                            char temp = arr[i];
                            if (temp != c) arr[i] = c;
                            String newWord = new String(arr);
                            if (wordList.contains(newWord)) {
                                // Find all the previous paths to the current word from the map
                                List<List<String>> all = map.get(word);
                                // Add the newWord to the end of each path and then write them back to the map
                                for (List<String> each : all) {
                                    List<String> pre = new ArrayList<>(each);
                                    pre.add(newWord);
                                    if (map.keySet().contains(newWord)) {
                                        List<List<String>> path = map.get(newWord);
                                        path.add(pre);
                                        map.put(newWord, path);
                                    } else {
                                        q.offer(new node(newWord, pre));
                                        List<List<String>> path = new ArrayList<>();
                                        path.add(pre);
                                        map.put(newWord, path);
                                    }
                                }
                                // temporarily memorize the transferred words, can't remove them yet.
                                // e.g. 1. hot -> dot -> dit
                                //      2. hot -> hit -> dit
                                // If "dit" is removed too early from the wordList after the traversal of "dot", we lose the second path.
                                set.add(newWord);
                            }
                            arr[i] = temp;
                        }
                    }
                }
            }
            // After scanning the whole level, remove all the transferred words
            wordList.removeAll(set);
        }
        return ans;
    }

    public List<List<String>> scoreC(String beginWord,
                                     String endWord, Set<String> wordList) {
        wordList.add(endWord);
        List<List<String>> ans = new ArrayList<>();
        Deque<String> dq = new ArrayDeque<>();
        Deque<List<String>> trace = new ArrayDeque<>();
        dq.add(beginWord);
        trace.add(Arrays.asList(beginWord));
        boolean flag = false;
        int level = 1;
        while (!dq.isEmpty() && !flag && level < wordList.size()) {
            int ct = dq.size();
            while (ct > 0) {
                String word = dq.pop();
                List<String> step = new ArrayList<>(trace.pop());
                for (int i = 0; i < word.length(); ++i) {
                    char[] bytes = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; ++c) {
                        bytes[i] = c;
                        String trans = new String(bytes);
                        if (!wordList.contains(trans)) {
                            continue;
                        }
                        step.add(trans);
                        if (trans.equals(endWord)) {
                            flag = true;
                            ans.add(new ArrayList<>(step));
                        }
//                        } else {
//                            wordList.remove(trans);
//                        }
                        dq.add(trans);
                        trace.add(new ArrayList<>(step));
                        step.remove(step.size() - 1);
                    }
                }
                ct--;
            }
            level++;
        }
        return ans;
    }
}
