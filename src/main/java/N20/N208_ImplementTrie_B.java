package N20;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-18
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Implement a trie with insert, search, and startsWith methods.
 * <p/>
 * Note:
 * You may assume that all inputs are consist of lowercase letters a-z.
 * <p/>
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 * <p/>
 * https://leetcode.com/discuss/68924/ac-java-dfs-solution-beat-91-31%25-submissions
 * array version
 */
public class N208_ImplementTrie_B {
    class TrieNode {
        // Initialize your data structure here.
        public TrieNode() {
        }

        public TrieNode(char val) {
            this.val = val;
        }

        public Map<Character, TrieNode> children;
        public boolean isLeaf;
        public char val;
    }

    public class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        // Inserts a word into the trie.
        public void insert(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); ++i) {
                char c = word.charAt(i);
                if (node.children == null) {
                    node.children = new HashMap<>();
                }
                if (!node.children.containsKey(c)) {
                    node.children.put(c, new TrieNode(c));
                }
                node = node.children.get(c);
            }
            node.isLeaf = true;
        }

        TrieNode doSearch(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); ++i) {
                char c = word.charAt(i);
                if (node.children == null || !node.children.containsKey(c)) {
                    return null;
                }
                node = node.children.get(c);
            }
            return node;
        }

        // Returns if the word is in the trie.
        public boolean search(String word) {
            TrieNode node = doSearch(word);
            if (node == null) {
                return false;
            }
            return node.isLeaf;
        }

        // Returns if there is any word in the trie
        // that starts with the given prefix.
        public boolean startsWith(String prefix) {
            TrieNode node = doSearch(prefix);
            return node != null;
        }
    }
}
