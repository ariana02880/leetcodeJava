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
//    * @param grid: a list of lists of integers
//    * @return: An integer, minimizes the sum of all numbers along its path
//    */
//   public int minPathSum(int[][] grid) {
//       // write your code here
//       if(grid == null || grid.length == 0 || grid[0] == null){
//           return 0;
//       }
//       int m = grid.length, n = grid[0].length;
//       int [][] dp = new int[2][n];
//       dp[0][0] = grid[0][0];
//       int now = 0, old = 0;
//       for(int i = 0; i < m; i++){
//           old = now;
//           now = 1 - old;
//           for(int j = 0; j < n; j++){
//               if(i == 0 && j == 0){
//                   dp[now][0] = grid[0][0];
//                   continue;
//               }
//               dp[now][j]= Integer.MAX_VALUE;
//               if(j > 0){
//                   dp[now][j] = Math.min(dp[now][j-1],dp[now][j]);
//               }
//               if(i > 0){
//                   dp[now][j] = Math.min(dp[old][j],dp[now][j]);
//               }
//               dp[now][j] += grid[i][j];
//           }
//       }
//       return dp[now][n-1];
//   }
// }




// public class l110 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		String [] t= {"internal","internet","interval"};
// 		Object a=test.wordsAbbreviation(t);
// 		System.out.println("Hello World");

// 	}
// }
