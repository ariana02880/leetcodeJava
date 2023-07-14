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
//    * @param nums: A list of integer
//    * @return: An integer, maximum coins
//    */
//   public int maxCoins(int[] nums) {
//       // write your code here
//       if(nums == null || nums.length == 0){
//           return 0;
//       }
//       int m = nums.length;
//       int[] arr = new int[m+2];
//       arr[0] = 1;
//       arr[m+1] = 1;
//       for(int i = 1; i <= m; i++){
//           arr[i] = nums[i-1];
//       }
//       int[][] dp = new int[m+2][m+2];
//       return dfs(dp,arr,1,m);
//   }
//   public int dfs(int[][] dp, int[] arr, int left, int right){
//       int ans = 0;
//       if(right < left){
//           return 0;
//       }
//       if(dp[left][right] > 0){
//           return dp[left][right];
//       }
//       for(int k = left; k <= right; k++){
//           ans = Math.max(ans, arr[k]*arr[left-1]*arr[right+1] + dfs(dp,arr,left,k-1) + dfs(dp,arr,k+1,right) );
//       }
//       dp[left][right] = ans;
//       return ans;
//   }
// }



// public class l168 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
		
// 		Point[] t= {new Point(0,0),new Point(1,1),new Point(1,0),new Point(0,1)};
// 		Object a=test.numIslands2(2,2,t);
// 		System.out.println("Hello World");

// 	}
// }
