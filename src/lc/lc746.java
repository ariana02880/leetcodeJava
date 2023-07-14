//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
// // Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
//}
// //Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
//
//class Solution {
////	public int minCostClimbingStairs(int[] cost) {
////        if(cost.length==0)
////            return 0;
////        int n=cost.length;
////        int []dp=new int[n];
////        if(n==2)
////            return Math.min(cost[0],cost[1]);
////        if(n==1)
////            return dp[0];
////        dp[0]=cost[0];dp[1]=cost[1];
////        for(int i=2;i<n;i++){
////            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
////        }
////        return Math.min(dp[n-1],dp[n-2]);
////    
////    }
//	//faster
//	public int minCostClimbingStairs(int[] cost) {
//        int n = cost.length;
//        int[] dp = new int[n];
//        dp[0] = cost[0];
//        dp[1] = cost[1];
//        for (int i = 2; i < n; i++) {
//            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
//        }
//        return Math.min(dp[n - 1], dp[n - 2]);
//    }
//}
//
//
//public class lc746 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}