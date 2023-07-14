//package lc;
//
//import sun.launcher.resources.launcher;
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
//	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        List<Integer> l1=new ArrayList<>();
//        List<Integer> l2=new ArrayList<>();
//        help(root1,l1);
//        help(root2,l2);
//        return l1.equals(l2);
//    }
//    public void help(TreeNode root,List<Integer> ans){
//        if(root==null)
//            return;
//        help(root.left,ans);
//        help(root.right,ans);
//        if(root.left==null && root.right==null)
//            ans.add(root.val);
//    }
//}
//public class lc872 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
