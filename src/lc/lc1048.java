//package lc;
//import java.lang.*;
//import java.sql.Array;
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
////my
//class Solution {
//    public int longestStrChain(String[] words) {
//    	int m=words.length;
//        int [] dp=new int[m];
//        int ans=1;
//        Arrays.fill(dp,1);
//        Arrays.sort(words, (a,b)->a.length()-b.length());
//        for(int i=1;i<m;i++) {
//        	for(int j=0;j<i;j++) {
//        		if(preString(words[j], words[i])) {
//        			dp[i]=Math.max(dp[i],dp[j]+1);
//        			ans=Math.max(ans, dp[i]);
//        		}
//        	}
//        }
//        return ans;
//    }
//    public boolean preString(String a,String b) {
//    	int pa=0,pb=0;
//    	int cnt=0;
//    	if(b.length()-a.length()!=1) 
//    		return false;
//    	while(pa<a.length()&& pb<b.length()) {
//    		if(a.charAt(pa)==b.charAt(pb))
//    			pa++;
//    		pb++;
//    	}
//    	return pa==a.length();
//    }
//}
//public class lc1048 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		String[] words= {"a","b","ba","bca","bda","bdca"};
//		Object a=test.longestStrChain(words);
//		System.out.println("Hello World");
//
//	}
//}
