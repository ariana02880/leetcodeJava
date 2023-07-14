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
////my 74%
//class Solution {
//    public String simplifyPath(String path) {
//        String[] ans=path.split("/");
//        Stack<String> stack=new Stack<>();
//        for(int i=0;i<ans.length;i++) {
//        	if(!ans[i].isEmpty()) {
//        		if(ans[i].equals("..")&& !stack.isEmpty()) {
//        			stack.pop();
//        		}
//        		if(!ans[i].equals("..") && !ans[i].equals(".") && !ans[i].equals(""))
//        			stack.push(ans[i]);
//        	}        	
//        }
//        String reString="";
//        if(stack.size()==0)
//        	return "/";
//        while(!stack.isEmpty()) {
//        	reString="/"+stack.pop()+reString;
//        }
//        return reString.isEmpty()? "/":reString;
//    }
//}
//public class lc71 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.simplifyPath("/asdf/..///dfasf/s../s");
//		System.out.println("Hello World");
//
//	}
//}
