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
//
//class Solution {
//    int maxHeight=0;
//    int ans=0;
//    public int findBottomLeftValue(TreeNode root) {
//        help(root, 1);
//        return ans;
//    }
//    public void help(TreeNode root,int h){
//    	if(root==null)
//    		return;
//    	if(maxHeight<h){
//    		maxHeight=h;
//    		ans=root.val;
//    	}
//        help(root.left, h+1);
//        help(root.right, h+1);
//    }
//    
//}
//public class lc513 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
