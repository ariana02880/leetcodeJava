// package lintcode;
// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
// }


// public class Trie {
//   class TrieNode{
//       public String word;
//       public HashMap<Character,TrieNode> children;
//       TrieNode(){
//           word = "";
//           children = new HashMap<>();
//       }
//   }
//   public TrieNode root; 
//   public Trie() {
//       // do intialization if necessary
//       root = new TrieNode();
//   }

//   /*
//    * @param word: a word
//    * @return: nothing
//    */
//   public void insert(String word) {
//       // write your code here
//       TrieNode now=root;
//       for(int i=0;i<word.length();i++){
//           if(!now.children.containsKey(word.charAt(i))){
//               now.children.put(word.charAt(i),new TrieNode());
//           }
//           now= now.children.get(word.charAt(i));
//       }
//       now.word = word;
//   }

//   /*
//    * @param word: A string
//    * @return: if the word is in the trie.
//    */
//   public boolean search(String word) {
//       // write your code here
//       TrieNode now=root;
//       for(int i=0;i<word.length();i++){
//           if(!now.children.containsKey(word.charAt(i))){
//               return false;
//           }
//           now = now.children.get(word.charAt(i));
//       }
//       if(now.word != ""){
//           return true;
//       }
//       return false;
//   }

//   /*
//    * @param prefix: A string
//    * @return: if there is any word in the trie that starts with the given prefix.
//    */
//   public boolean startsWith(String prefix) {
//       // write your code here
//       TrieNode now=root;
//       for(int i=0;i<prefix.length();i++){
//           if(!now.children.containsKey(prefix.charAt(i))){
//               return false;
//           }
//           now = now.children.get(prefix.charAt(i));
//       }
//       return true;
//   }
// }

// public class l442 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.isNumber("1      ");
// 		System.out.println("Hello World");

// 	}
// }
