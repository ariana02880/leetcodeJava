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

// public class Solution {
//   /**
//    * @param matrix: a boolean 2D matrix
//    * @return: an integer
//    */
//   public int maximalRectangle(boolean[][] matrix) {
//       // write your code here
//       if(matrix==null ||matrix.length ==0)
//       return 0;
//       int m = matrix.length;
//       int n = matrix[0].length;
//       int [][] height = new int[m][n];
//       int ans = 0;
//       for(int i =0;i<m;i++){
//           for(int j=0;j<n;j++){
//               if(matrix[i][j] == false){
//                   height[i][j] =0;
//               }
//               else{
//                   height[i][j] = (i == 0)? 1: height[i-1][j] +1;
//               }
//           }
//       }
//       for(int i=0;i<m;i++){
//           ans = Math.max(ans,help(height[i]));
//       }
//       return ans;
//   }
//   public int help(int[] height){
//       Stack<Integer> idx = new Stack<>();
//       idx.push(0);
//       int ans = 0;
//       int my[] = new int[height.length+1];
//       for(int i=0;i<height.length;i++){
//           my[i] = height[i];
//       }
//       my[height.length] = 0;
//       for(int i=0;i<my.length;i++){
//           while(!idx.empty() && my[idx.peek()] >= my[i]){
//               int cur = idx.pop();
//               ans = Math.max(ans, my[cur]* (idx.empty()? i : (i-idx.peek()-1)));
//           }
//           idx.push(i);
//       }
//       return ans;
//   }
// }


// public class l510 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
		
// 		int[][]t= {{0,1,0,0,0},{1,0,0,2,1},{0,1,0,0,0}};
// 		Object a=test.shortestDistance(t);
// 		System.out.println("Hello World");

// 	}
// }
