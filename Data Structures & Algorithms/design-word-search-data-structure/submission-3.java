class WordDictionary {

    public TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode tmp = root;
        for(char c : word.toCharArray()) {
            int i = c-'a';
            if(tmp.children[i] == null)
                tmp.children[i] = new TrieNode();
            tmp = tmp.children[i];
        }
        tmp.endOfWord = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    public boolean dfs(String word, int j, TrieNode node) {
        TrieNode tmp = node;
        for (int i = j; i < word.length(); i++) {
            if(word.charAt(i) == '.') {
                for(TrieNode child : tmp.children) {
                    if(child != null && dfs(word, i+1, child))
                        return true;
                }
                return false;
            }
            else {
                int c = word.charAt(i) - 'a';
                if(tmp.children[c] == null)
                    return false;
                tmp = tmp.children[c];
            }
        }
        return tmp.endOfWord;
    }
}

public class TrieNode {
    public TrieNode[] children;
    public boolean endOfWord;

    public TrieNode() {
        children = new TrieNode[26];
        endOfWord = false;
    }
}
