// package lc;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// // Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }


// class Solution {
//   public void rotate(int[][] matrix) {
//       int n = matrix.length;
//       for (int i = 0; i < (n + 1) / 2; i ++) {
//           for (int j = 0; j < n / 2; j++) {
//               int temp = matrix[n - 1 - j][i];
//               matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
//               matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
//               matrix[j][n - 1 - i] = matrix[i][j];
//               matrix[i][j] = temp;
//           }
//       }
//   }
// }


// public class lc48 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.multiply("2","3");
// 		System.out.println("Hello World");

// 	}
// }