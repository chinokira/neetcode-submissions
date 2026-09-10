class PrefixTree {
    private TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode tmp = root;
        for(char c : word.toCharArray()){
            int i = c - 'a';
            if(tmp.children[i] == null){
                tmp.children[i] = new TrieNode();
            }
            tmp = tmp.children[i];
        }
        tmp.endOfWord = true;
    }

    public boolean search(String word) {
        TrieNode tmp = root;
        for(char c : word.toCharArray()){
            int i = c - 'a';
            if(tmp.children[i] != null)
                tmp = tmp.children[i];
            else return false;
        }
        return tmp.endOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode tmp = root;
        for(char c : prefix.toCharArray()){
            int i = c - 'a';
            if(tmp.children[i] != null)
                tmp = tmp.children[i];
            else return false;
        }
        return true;
    }
}


public class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean endOfWord = false;
}
