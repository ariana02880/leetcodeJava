//package lintcode;
//package lc;
//import java.lang.*;
//import java.io.*;
//// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
//}
////Definition for a binary tree node.
//class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
//}
//
//
//
//
//
////my
//class Solution {
//    /**
//     * @param s: the maximum length of s is 1000
//     * @return: the longest palindromic subsequence's length
//     */
//    public int longestPalindromeSubseq(String s) {
//        // write your code here
//        int n=s.length();
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        int dp[][]=new int[n][n];
//        for(int i=0;i<n;i++){
//            dp[i][i]=1;
//        }
//        for(int i=0;i<n-1;i++){
//            if(s.charAt(i)==s.charAt(i+1)){
//                dp[i][i+1]=2;
//            }
//            else{
//                dp[i][i+1]=1;
//            }
//        }
//        
//        for(int len=2;len<n;len++){
//            for(int i=0;len+i<n;i++){
//                if(s.charAt(i)==s.charAt(i+len)){
//                    dp[i][i+len]=2+dp[i+1][i+len-1];
//                }
//                else{
//                    dp[i][i+len]=Math.max(dp[i][i+len-1],dp[i+1][i+len]);
//                }
//            }
//        }
//        int ans=0;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                if(dp[i][j]>ans){
//                    ans=dp[i][j];
//                }
//            }
//        }
//        return ans;
//    }
//}
//
//
//public class l667 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//
////		Object a=test.closestKValues(root, target, k)(4);
//		System.out.println("Hello World");
//
//	}
//}
