package N21;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-19
 */

/**
 * Design a data structure that supports the following two operations:
 * <p/>
 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression string
 * containing only letters a-z or .. A . means it can represent any one letter.
 * <p/>
 * For example:
 * <p/>
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 */
public class N211_AddAndSearchWord_B {
    WordNode root = new WordNode();

    public void clear() {
        root = new WordNode();
    }

    public void addWord(String word) {
        char chars[] = word.toCharArray();
        addWord(chars, 0, root);
    }

    private void addWord(char[] chars, int index, WordNode parent) {
        char c = chars[index];
        int idx = c - 'a';
        WordNode node = parent.children[idx];
        if (node == null) {
            node = new WordNode();
            parent.children[idx] = node;
        }
        if (chars.length == index + 1) {
            node.isLeaf = true;
            return;
        }
        addWord(chars, ++index, node);
    }


    public boolean search(String word) {
        return search(word.toCharArray(), 0, root);
    }

    private boolean search(char[] chars, int index, WordNode parent) {
        if (index == chars.length) {
            return parent.isLeaf;
        }
        WordNode[] childNodes = parent.children;
        char c = chars[index];
        if (c == '.') {
            for (int i = 0; i < childNodes.length; i++) {
                WordNode n = childNodes[i];
                if (n != null && search(chars, index + 1, n)) {
                    return true;
                }
            }
            return false;
        }
        WordNode node = childNodes[c - 'a'];
        if (node == null) {
            return false;
        }
        return search(chars, ++index, node);
    }

    private class WordNode {
        boolean isLeaf;
        WordNode[] children = new WordNode[26];
    }
}
