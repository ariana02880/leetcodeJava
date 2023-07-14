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
////my
//class Solution {
//    public int atoi(String str) {
//        long ans=0;
//        if(str==null)
//        return 0;
//        str=str.trim();
//        if(str.length()==0)
//            return 0;
//        int idx=0;
//        int sign=1;
//        if(str.charAt(idx)=='+'){
//                idx++;
//            }
//        else if(str.charAt(idx)=='-'){
//                sign=-1;idx++;
//            }
//        while(idx<str.length()){
//            if(str.charAt(idx)<'0'||str.charAt(idx)>'9')
//                break;
//            ans=ans*10+(str.charAt(idx++)-'0');
//            if(ans>Integer.MAX_VALUE)
//                break;
//        }
//        ans=sign*ans;
//        if(ans>Integer.MAX_VALUE)
//            return Integer.MAX_VALUE;
//        if(ans<=Integer.MIN_VALUE)
//            return Integer.MIN_VALUE;
//        return (int)ans;
//    }
//}
//
//public class l54 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [] t= {0,1,3,5,75};
//		Object a=test.atoi("   +-1111");
//		System.out.println("Hello World");
//
//	}
//}
