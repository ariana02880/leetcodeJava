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
//    * @param matrix: A 2D-array of integers
//    * @return: an integer
//    */

//   int[][] dp;
//   int n, m;

//   public int longestContinuousIncreasingSubsequence2(int[][] A) {
//       if (A.length == 0) {
//           return 0;
//       }

//       n = A.length;
//       m = A[0].length;
//       int ans = 0;
//       dp = new int[n][m]; // dp[i][j] means the longest continuous increasing path from (i,j)
//       for (int i = 0; i < n; ++i) {
//           for (int j = 0; j < m; ++j) {
//               dp[i][j] = -1; // dp[i][j] has not been calculated yet
//           }
//       }

//       for (int i = 0; i < n; ++i) {
//           for (int j = 0; j < m; ++j) {
//               search(i, j, A);
//               ans = Math.max(ans, dp[i][j]);
//           }
//       }

//       return ans;
//   }

//   int[] dx = { 1, -1, 0, 0 };
//   int[] dy = { 0, 0, 1, -1 };

//   void search(int x, int y, int[][] A) {
//       if (dp[x][y] != -1) { // if dp[i][j] has been calculated, return directly
//           return;
//       }

//       int nx, ny;
//       dp[x][y] = 1;
//       for (int i = 0; i < 4; ++i) {
//           nx = x + dx[i];
//           ny = y + dy[i];
//           if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
//               if (A[nx][ny] > A[x][y]) {
//                   search(nx, ny, A); // dp[nx][ny] must be calcuted
//                   dp[x][y] = Math.max(dp[x][y], dp[nx][ny] + 1);
//               }
//           }
//       }
//   }
// }


// public class l398 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int [][] p= {{1,0}};
// 		Object a=test.canFinish(2,p );
// 		System.out.println("Hello World");

// 	}
// }
