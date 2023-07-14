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
//   public int maxSquare2(int[][] matrix) {
//       if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
//           return 0;
//       }
//       int n = matrix.length; int m = matrix[0].length;
//       int[][] leftZeros = new int[n][m];
//       int[][] upZeros = new int[n][m];
//       // 初始化leftZeros和upZeros，统计每个位置的左边和上面有多少连续0
//       for(int i = 0; i < n; i++){
//           leftZeros[i][0] = 0;
//       }
//       for(int j = 0; j < m; j++){
//           upZeros[0][j] = 0;
//       }
//       for(int i = 0; i < n; i++){
//           for(int j = 1; j < m; j++){
//               if(matrix[i][j - 1] == 0){
//                   leftZeros[i][j] = leftZeros[i][j - 1] + 1;
//               }    
//               else{
//                   leftZeros[i][j] = 0;
//               }
//           }
//       }
//       for(int i = 1; i < n; i ++){
//           for(int j = 0; j < m; j++){
//               if(matrix[i - 1][j] == 0){
//                   upZeros[i][j] = upZeros[i - 1][j] + 1;
//               }
//               else{
//                   upZeros[i][j] = 0;
//               }                
//           }
//       }

//       int[][] dp = new int[n][m];
//       //初始化dp数组
//       for(int i = 0; i < n; i++){
//           dp[i][0] = matrix[i][0];    
//       }
//       for(int j = 0; j < m; j++){
//           dp[0][j] = matrix[0][j];
//       }
//       //状态转移。记录每个点对角线到此点的最大长度。
//       for(int i = 1; i < n; i++){
//           for(int j = 1; j < m; j++){
//               if(matrix[i][j] == 0){
//                   dp[i][j] = 0;
//               }
//               else{
//                   dp[i][j] = Math.min(Math.min(leftZeros[i][j], upZeros[i][j]), dp[i - 1][j - 1]) + 1;
//               }
//           }
//       }
//       int max = 0;
//       //遍历dp查找最大矩阵的对角线长度
//       for(int i = 0; i < n; i++){
//           for(int j = 0; j < m; j++){
//               max = Math.max(max, dp[i][j]);    
//           }
//       }
//       //答案就是最长对角线长度的平方
//       return max * max;
//   }
// }


// public class l631 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int [][] p= {{1,0}};
// 		int[]A= {1,2,3};
// 		Object a=test.kClosestNumbers(A, 2, 3);
// 		System.out.println("Hello World");

// 	}
// }
