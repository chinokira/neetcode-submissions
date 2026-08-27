class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode tmp = root;
        for(char c : word.toCharArray()){
            int i = c - 'a';
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
        for(int i = j; i < word.length(); i++) { 
            char c = word.charAt(i);
            if(c == '.') {
                for(TrieNode n : tmp.children) {
                    if(n != null && dfs(word, i+1, n))
                        return true;
                }
                return false;
            }else {
                int h = c - 'a';
                if(tmp.children[h] == null)
                    return false;
                tmp = tmp.children[h];
            }
        }
        return tmp.endOfWord;
    }
}

public class TrieNode{
    public TrieNode[] children;
    public boolean endOfWord;

    public TrieNode(){
        children = new TrieNode[26];
        endOfWord = false;
    }
}
