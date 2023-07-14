// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;

// class TrieNode {
//   TrieNode[] children = new TrieNode[26];
//   boolean word = false;

//   public TrieNode() {
//   }
// }

// class WordDictionary {
//   TrieNode trie;

//   /** Initialize your data structure here. */
//   public WordDictionary() {
//     trie = new TrieNode();
//   }

//   /** Adds a word into the data structure. */
//   public void addWord(String word) {
//     TrieNode node = trie;

//     for (char ch : word.toCharArray()) {
//       if (node.children[ch - 'a'] == null) {
//         node.children[ch - 'a'] = new TrieNode();
//       }
//       node = node.children[ch - 'a'];
//     }
//     node.word = true;
//   }

//   /** Returns if the word is in the node. */
//   public boolean searchInNode(String word, TrieNode node) {
//     if (node == null) {
//       return false;
//     }
//     for (int i = 0; i < word.length(); ++i) {
//       char ch = word.charAt(i);
//       if (ch == '.') {
//         for (int idx = 0; idx < 26; idx++) {
//           TrieNode child = node.children[idx];
//           if (searchInNode(word.substring(i + 1), child)) {
//             return true;
//           }
//         }
//         return false;
//       } else if (node.children[ch - 'a'] == null) {
//         return false;
//       } else {
//         node = node.children[ch - 'a'];
//       }
//     }
//     return node.word;
//   }

//   public boolean search(String word) {
//     return searchInNode(word, trie);
//   }
// }

// public class lc211 {

//   public static void main(String arg[]) {
//     RandomListNode aa = new RandomListNode(12);
//     // Solution.copyRandomList(aa);
//     System.out.println("Hello world");
//   }
// }
