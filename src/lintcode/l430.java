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


// class Solution {
//   /**
//    * @param s1: A string
//    * @param s2: Another string
//    * @return: whether s2 is a scrambled string of s1
//    */
//   public boolean isScramble(String s1, String s2) {
//       // write your code here
//       if(s1.length() != s2.length()){
//           return false;
//       }
//       int m = s1.length();
//       boolean[][][] dp = new boolean[m][m][m+1];
//       for(int i = 0; i<m ; i++){
//           for(int j =0 ; j<m; j++){
//               dp[i][j][1] = (s1.charAt(i) == s2.charAt(j));
//           }
//       }

//       for(int k = 2; k <= m; k++){
//           for(int i =0; i <= m-k; i++ ){
//               for(int j = 0; j <= m-k; j++){
//                   for(int w = 1; w < k; w++){
//                       if(dp[i][j][w] && dp[i+w][j+w][k-w]){
//                           dp[i][j][k] =true;
//                           break;
//                       }
//                       if(dp[i][j+k-w][w] && dp[i+w][j][k-w]){
//                           dp[i][j][k] =true;
//                           break;
//                       }
//                   }
//               }
//           }
//       }
//       return dp[0][0][m];
//   }
// }


// public class l430 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int [] t= {0,1,3,5,75};
// 		Object a=test.binaryRepresentation("0.5");
// 		System.out.println("Hello World");

// 	}
// }
