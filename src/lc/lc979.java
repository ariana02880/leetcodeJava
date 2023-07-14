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
//	int ans=0;
//    public int distributeCoins(TreeNode root) {
//        help(root);
//        return ans;
//    }
//    public int help(TreeNode root) {
//        if(root==null)
//        	return 0;
//        int ll=help(root.left);
//        int rr=help(root.right);
//        ans +=Math.abs(ll)+Math.abs(rr);
//        return ll+rr+root.val-1;
//    }
//}
//public class lc979 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		TreeNode root=new TreeNode(1);
//		TreeNode l1=new TreeNode(2);
//		TreeNode r1=new TreeNode(0);
//		root.left=l1; root.right=r1;
//		Object a=test.distributeCoins(root);
//		System.out.println("Hello World");
//
//	}
//}
