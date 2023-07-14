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
//////ans
////class Solution {    
////    public TreeNode increasingBST(TreeNode root) {
////        List<Integer> vals = new ArrayList();
////        inorder(root, vals);
////        TreeNode ans = new TreeNode(0), cur = ans;
////        for (int v: vals) {
////            cur.right = new TreeNode(v);
////            cur = cur.right;
////        }
////        return ans.right;
////    }
////
////    public void inorder(TreeNode node, List<Integer> vals) {
////        if (node == null) return;
////        inorder(node.left, vals);
////        vals.add(node.val);
////        inorder(node.right, vals);
////    }
////}
////my
//class Solution {    
//  public TreeNode increasingBST(TreeNode root) {
//      List<Integer> vals = new ArrayList();
//      help(root, vals);
//      TreeNode ans=new TreeNode(0);
//      TreeNode t1=ans;
//      for(Integer aa:vals) {
//    	  TreeNode temp=new TreeNode(aa);
//    	  t1.right=temp;
//    	  t1=t1.right;
//      }
//      return ans;
//  }
//
//  public void help(TreeNode node, List<Integer> vals) {
//	  if(node==null)
//		  return ;
//	  help(node.left, vals);
//	  vals.add(node.val);
//	  help(node.right, vals);
//	  return;
//  }
//}
//public class lc897 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
