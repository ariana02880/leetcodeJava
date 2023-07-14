//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverAnonymous;
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
//////my dp bad 114ms
////class Solution {
////    public boolean isSubsequence(String s, String t) {
////        int m=s.length();
////        int n=t.length();
////        if(m==0)
////        	return true;
////        if(m!=0&&n==0)
////        	return false;
////        boolean [][]dp=new boolean[m][n];
////        for(int j=0;j<n;j++) {
////        	if(s.charAt(0)!=t.charAt(j))
////        		dp[0][j]=false;
////        	else{
////        		while(j<n)
////        			dp[0][j++]=true;
////        		break;
////        	}
////        }
////        
////        for(int i=1;i<m;i++) {
////        	for(int j=1;j<n;j++) {
////        		if(s.charAt(i)==t.charAt(j)&& dp[i-1][j-1]==true) {
////        			while(j<n)
////            			dp[i][j++]=true;
////            		break;
////        		}
////        	}
////        }
////        return dp[m-1][n-1];
////    }
////}
//
////my way 2: 20ms
////用两个指针分别指向字符串s和t，然后如果字符相等，则i和j自增1，反之只有j自增1，
////最后看i是否等于s的长度，等于说明s已经遍历完了，而且字符都有在t中出现过
//class Solution {
//    public boolean isSubsequence(String s, String t) {
//    	int ps=0,pt=0;
//        while(ps<s.length() && pt<t.length()) {
//        	if(s.charAt(ps)== t.charAt(pt)) {
//        		ps++;
//        	}
//        	pt++;
//        }
//        if(ps==s.length())
//        	return true;
//        else
//        	return false;
//    }
//}
//
//public class lc392 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.isSubsequence("ace","abcde");
//		System.out.println("Hello World");
//
//	}
//}
