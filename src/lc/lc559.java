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
//////ans:
////class Solution {
////	public int maxDepth(Node root) {
////	    if (root == null) {
////	      return 0;
////	    } else if (root.children.isEmpty()) {
////	      return 1;  
////	    } else {
////	      List<Integer> heights = new LinkedList<>();
////	      for (Node item : root.children) {
////	        heights.add(maxDepth(item)); 
////	      }
////	      return Collections.max(heights) + 1;
////	    }
////	  }
////}
////my:
//class Solution {
//	public int maxDepth(Node root) {
//		int ans=0;
//	    if(root==null)
//	    	return 0;
//	    else if(root.children.isEmpty())
//	    	return 1;
//	    else {
//	    	for(Node aa:root.children) {
//	    		ans=Math.max(ans, maxDepth(aa)+1);
//	    	}
//	    }
//	    return ans;
//	  }
//}
//////my2 :
////class Solution {
////	public int maxDepth(Node root) {
////		return help(root, 1);
////	    
////	  }
////	public int help(Node root,int depth) {
////		int ans=0;
////		if(root==null)
////			return depth-1;
////		ans=depth;
////		for(Node aa:root.children) {
////			ans=Math.max(ans, help(aa, depth+1));
////		}
////		
////		return ans;
////	}
////}
//public class lc559 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
