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
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> ans=new ArrayList<>();
//        help(root, 0, ans);
//        return ans;
//    }
//    public void help(TreeNode root,int h,List<Integer> ans) {
//    	if(root==null)
//    		return;
//    	if(ans.size()<=h)
//    		ans.add(root.val);
//    	help(root.right, h+1, ans);
//    	help(root.left, h+1, ans);
//    }
//}
//public class lc199 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
