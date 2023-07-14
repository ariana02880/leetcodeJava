// package lc;
// import java.lang.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;


//  class Solution {
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




// //mine:
// class Solution {
//   class TrieNode {
//       public TrieNode[] children;
//       public String word;
//       TrieNode(){
//           children = new TrieNode[26];
//           word = "";
//       }
//       public void add(String aa, int idx) {
//           if(idx == aa.length()){
//               this.word = aa;
//               return;
//           }
//           if(this.children[aa.charAt(idx) - 'a'] == null) {
//               this.children[aa.charAt(idx) - 'a'] = new TrieNode();
//           }
//           this.children[aa.charAt(idx) - 'a'].add(aa,idx+1);
//       }
//   }
//   public List<List<String>> wordSquares(String[] words) {
//       TrieNode root = new TrieNode();
//       for(String aa: words) {
//           root.add(aa,0);
//       }
//       List<List<String>> ans = new ArrayList<>();
//       for(String aa: words){
//           List<String> temp = new ArrayList<>();
//           temp.add(aa);
//           dfs(root, aa.length(),temp, ans);
//       }
//       return ans;
//   }
  
//   public void dfs (TrieNode root, int len, List<String >temp, List<List<String>> ans) {
//       if(temp.size() == len) {
//           ans.add(new ArrayList<>(temp));
//           return;
//       }
//       String prefix = getPrefix(temp);
//       TrieNode node = getPrefixNode(root, prefix);
//       if(node == null){
//           return;
//       }
//       List<String> children = new ArrayList<>();
//       getChildren(node,children);
//       for(String aa : children) {
//           temp.add(aa);
//           dfs(root, len, temp, ans);
//           temp.remove(temp.size()-1);
//       }
//   }
  
  
  
//   public String getPrefix(List<String> temp) {
//       int idx = temp.size();
//       StringBuilder sb = new StringBuilder();
//       for(int i=0;i<idx ;i++){
//           sb.append(temp.get(i).charAt(idx));
//       }
//       return sb.toString();
//   }
//   public TrieNode getPrefixNode(TrieNode root, String prefix) {
//       TrieNode temp = root;
//       for(int i =0; i<prefix.length();i++) {
//           if(temp.children[prefix.charAt(i)-'a'] == null){
//               return null;
//           }
//           temp=temp.children[prefix.charAt(i)-'a'];
//       }
//       return temp;
//   }
//   public void getChildren(TrieNode node, List<String> children) {
//       if(node.word != "") {
//           children.add(node.word);
//           return;
//       }
//       for(int i=0;i<26;i++) {
//           if(node.children[i] == null)
//               continue;
//           getChildren(node.children[i], children);
//       }
//       return;
//   }
  
  
// }



// public class lc425 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
//     String[] aa = {"lead","wall","lady","ball", "area"};
//     // List<String> input= new ArrayList<>();
//     // input.addAll(Arrays.asList(aa));
    
//     test.wordSquares(aa);


// 		System.out.println("Hello World");

// 	}
// }
