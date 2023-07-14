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
//    * @param n: An integer
//    * @return: A boolean which equals to true if the first player will win
//    */
//   public boolean firstWillWin(int n) {
//       if (n == 0) {
//           return false;
//       }
       
//       // dp[i] means for the i coins in a line, the first player can win
//       //
//       boolean[] dp = new boolean[n + 1];
//       dp[0] = false;
//       dp[1] = true;
       
//       for (int i = 2; i <= n; i++) {
//           dp[i] = !dp[i - 1] || !dp[i - 2];
//       }
       
//       return dp[n];
//   }
// }


// public class l394 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int [][] p= {{1,0}};
// 		int[]A= {1,2,3};
// 		Object a=test.kClosestNumbers(A, 2, 3);
// 		System.out.println("Hello World");

// 	}
// }
