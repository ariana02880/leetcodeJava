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
//class Solution {
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        Queue<TreeNode> q=new LinkedList<>();
//        List<List<Integer>> ans=new LinkedList<>();
//        if(root==null)
//        	return null;
//        q.add(root);
//        int level=1;
//        while(!q.isEmpty()) {
//        	int size=q.size();
//        	List<Integer> temp=new LinkedList<>();
//        	for(int i=0;i<size;i++) {
//        		TreeNode cur=q.remove();
//        		if(cur.left!=null) q.add(cur.left);
//        		if(cur.right!=null) q.add(cur.right);
//        		temp.add(cur.val);
//        	}
//        	if(level==0)
//        		Collections.reverse(temp);
//        	ans.add(temp);
//        	level=1-level;
//        }
//        return ans;
//    }
//}
//
//public class lc103 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
