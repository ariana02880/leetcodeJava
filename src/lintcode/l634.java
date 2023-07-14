// package lintcode;

// public class Solution {
//   /*
//    * @param words: a set of words without duplicates
//    * @return: all word squares
//    */

//   class TrieNode{
//     public String word;
//     public HashMap<Character, TrieNode> children;
//     TrieNode(){
//         word = "";
//         children = new HashMap<>();
//     }
//   }
//   public TrieNode root =new TrieNode();
//   public void addWord(String word) {
//       // write your code here
//       TrieNode now = root;
//       for(int i=0;i<word.length();i++){
//           if(!now.children.containsKey(word.charAt(i))){
//               now.children.put(word.charAt(i),new TrieNode());
//           }
//           now = now.children.get(word.charAt(i));
//       }
//       now.word = word;
//   }
//   public List<List<String>> wordSquares(String[] words) {
//       // write your code here
//       TrieNode root = buildTrie(words);
//       List<List<String>> squares = new ArrayList<>();
      
//       for (String word : words) {
//           List<String> square = new ArrayList<>();
//           square.add(word);
//           wordSquares(root, word.length(), square, squares);
//       }
//       return squares;
//   }
//   private TrieNode buildTrie(String[] words) {
//       TrieNode root = new TrieNode();
//       for (String word : words) {
//           TrieNode now = root;
//           for (int i=0;i<word.length();i++) {
//               if (! now.children.containsKey(word.charAt(i))) {
//                   now.children.put(word.charAt(i),new TrieNode());
//               }
//               now = now.children.get(word.charAt(i));
//           }
//           now.word = word;
//       }
//       return root;
//   }

//   private void wordSquares(TrieNode root, int len, List<String> square, List<List<String>> squares) {
//       if (square.size() == len) {
//           squares.add(new ArrayList<>(square));
//           return;
//       }

//       String prefix = getPrefix(square, square.size());
//       TrieNode node = search(root, prefix);
//       if (node == null) {
//           return;
//       }
      
//       List<String> children = new ArrayList<>();
//       getChildren(node, prefix, children);
//       for (String child : children) {
//           square.add(child);
//           wordSquares(root, len, square, squares);
//           square.remove(square.size() - 1);
//       }
//   }
  
//   private String getPrefix(List<String> square, int index) {
//       StringBuilder sb = new StringBuilder();
//       for (int i = 0; i < index; i++) {
//           sb.append(square.get(i).charAt(index));
//       }
//       return sb.toString();
//   }
  
//   private void getChildren(TrieNode node, String s, List<String> children) {
//       if (node.word !="") {
//           children.add(s);
//           return;
//       }
//       for (char cc: node.children.keySet()) {
//           getChildren(node.children.get(cc), s + cc, children);
          
//       }
//   }
//   private TrieNode search(TrieNode root, String prefix) {
//       TrieNode now = root;
//       for (char c : prefix.toCharArray()) {
//           if (!now.children.containsKey(c)) {
//               return null;
//           }
//           now = now.children.get(c);
//       }
//       return now;
//   }
// }


// public class l634 {
//   public static void main(){

//     System.out.println("Ariana");
//   }
// }
