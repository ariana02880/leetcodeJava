//package lc;
//import java.lang.*;
//import java.io.*;
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
//////my ans for ����divisor
////class Solution {
////    public int minSteps(int n) {
////    	int ans=n;
////        if(n==1)
////            return 0;
////        for(int i=n-1;i>1;i--) {
////        	if(n%i==0)
////        		ans=Math.min(ans, minSteps(n/i)+i);
////        }
////        return ans;
////    }
////}
////my way2 use dp:
////velocity is lower
//class Solution {
//    public int minSteps(int n) {
//    	int dp[]=new int[n+1];
//    	for(int i=2;i<n+1;i++)
//    		dp[i]=i;
//    	for(int i=2;i<n+1;i++) {
//    		for(int j=i-1;j>1;j--) {
//    			if(i%j==0)
//    				dp[i]=Math.min(dp[i], dp[i/j]+j);
//    		}
//    	}
//    	return dp[n];
//    		
//    }
//}
//public class lc650 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
