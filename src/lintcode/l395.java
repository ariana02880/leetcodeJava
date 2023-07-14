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
//    * @param values: a vector of integers
//    * @return: a boolean which equals to true if the first player will win
//    */
//   public boolean firstWillWin(int[] values) {
//       // write your code here
//       if(values == null || values.length == 0){
//           return false;
//       }
//       int n = values.length;
//       int[] dp = new int[n+1];
//       dp[n] = 0;
//       for(int i = n-1; i >= 0; i--){
//           dp[i] = values[i]-dp[i+1];
//           if(i < n-1)
//               dp[i] = Math.max(dp[i], values[i] + values[i+1]- dp[i+2]);
//       }
//       return dp[0] >= 0;
//   }
// }



// public class l395 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		String s="lintcode";
// 		HashSet<String> ss= new HashSet<>();
// 		ss.add("de");
// 		ss.add("ding");
// 		ss.add("co");ss.add("code"); ss.add("lint");
// 		Object a=test.wordBreak(s, ss);
// 		System.out.println("Hello World");

// 	}
// }
