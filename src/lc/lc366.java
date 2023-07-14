//package lc;
//
//import javax.swing.event.AncestorEvent;
//
//import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;
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
//
//class Solution {
//	List<List<Integer>> ans=new ArrayList<>();
//    public List<List<Integer>> findLeaves(TreeNode root) {
//    	dfs(root);
//    	return ans;
//    	
//    }
//    public int dfs(TreeNode root) {
//    	if(root==null)
//    		return -1;
//    	int h=1+Math.max(dfs(root.left), dfs(root.right));
//    	if(h==ans.size())
//    		ans.add(new ArrayList<>());
//    	ans.get(h).add(root.val);
//    	return h;
//    }
//}
//public class lc366 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
