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
//    * @param matrix: a matrix of 0 and 1
//    * @return: an integer
//    */
//   public int maxSquare(int[][] matrix) {
//       // write your code here
//       if(matrix == null || matrix.length == 0 || matrix[0] == null){
//           return 0;
//       }
//       int m = matrix.length;
//       int n = matrix[0].length;
//       int [][]dp = new int [m][n];
//       int ans = 0;


//       for(int i = 0; i < m; i++){
//           for(int j = 0;j < n; j++){
//               if(i == 0 || j == 0){
//                   dp[i][j] = matrix[i][j];
//                   ans = Math.max(ans,dp[i][j]);
//                   continue;
//               }
//               if(matrix[i][j] == 1){
//                   dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1])) + 1;
//               }
//               else{
//                   dp[i][j] = 0;
//               }
//               ans = Math.max(ans,dp[i][j]);
//           }
//       }
//       return ans * ans;
//   }
// }



// public class l436 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.isNumber("1      ");
// 		System.out.println("Hello World");

// 	}
// }
