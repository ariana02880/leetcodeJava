//package lc;
//
//import sun.print.resources.serviceui;
//
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
////my
//class Solution {
//    public List<Integer> partitionLabels(String S) {
//        int []last=new int[26];
//        for(int i=0;i<S.length();i++) {
//        	last[S.charAt(i)-'a']=i;
//        }
//        List<Integer> ans=new ArrayList<>();
//        int start=0;int end=0;
//        for(int i=0;i<S.length();i++) {
//        	end=Math.max(end,last[S.charAt(i)-'a']);
//        	if(i==end) {
//        		ans.add(end-start+1);
//        		start=end+1;
//        	}
//        }
//        return ans;
//    }
//}
//public class lc763 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
