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



// public class WordDictionary {
//   /*
//    * @param word: Adds a word into the data structure.
//    * @return: nothing
//    */
//   class TrieNode{
//       public String word;
//       public HashMap<Character, TrieNode> children;
//       TrieNode(){
//           word = "";
//           children = new HashMap<>();
//       }
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

//   /*
//    * @param word: A word could contain the dot character '.' to represent any one letter.
//    * @return: if the word is in the data structure.
//    */
//   public boolean search(String word) {
//       // write your code here
//       TrieNode now = root;
//       if(word == null || word ==""){
//           return false;
//       }
//       return searchMy(word, now, 0);
//   }
//   public boolean searchMy(String word, TrieNode now, int index){
//       if(index >= word.length()){
//           return now.word == "" ? false: true;
//       }
//       if(word.charAt(index) == '.'){
//           for(Character cc: now.children.keySet()){
//               if(searchMy(word, now.children.get(cc) , index+1)){
//                   return true;
//               }
//           }
//       }
//       else if(!now.children.containsKey(word.charAt(index))){
//           return false;
//       }
//       else{
//           return searchMy(word, now.children.get(word.charAt(index)),  index+1);
//       }
//       return false;
//   }
// }
// public class l473 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int [][] p= {{1,0}};
// 		int[]A= {1,2,3};
// 		Object a=test.kClosestNumbers(A, 2, 3);
// 		System.out.println("Hello World");

// 	}
// }
