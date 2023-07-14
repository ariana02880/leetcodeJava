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
//
//	public class Codec {
//
//	    // Encodes a tree to a single string.
//		public StringBuilder postorder(TreeNode root,StringBuilder s) {
//			if(root==null)
//				return null;
//			postorder(root.left, s);
//			postorder(root.right, s);
//			s.append(root.val);
//			s.append(" ");
//			return s;
//		}
//	    public String serialize(TreeNode root) {
//	    	if(root==null)
//	    		return "";
//	    	StringBuilder ans=postorder(root, new StringBuilder());
//	    	ans.deleteCharAt(ans.length()-1);
//	    	
//	        return ans.toString();
//	    }
//
//	    // Decodes your encoded data to tree.
//	    public TreeNode deserialize(String data) {
//	    	if (data.isEmpty()) return null;//!!!!
//	        ArrayDeque<Integer> ad=new ArrayDeque<>();
//	        for(String aa: data.split("\\s+")) {
//	        	ad.add(Integer.valueOf(aa));
//	        }
//	        return help(Integer.MIN_VALUE, Integer.MAX_VALUE, ad);
//	    }
//	    public TreeNode help(int l,int h,ArrayDeque<Integer> ad) {
//	    	if(ad.isEmpty())
//	    		return null;
//	    	int temp=ad.getLast();
//	    	if(temp<l ||temp>h)
//	    		return null;
//	    	TreeNode tt=new TreeNode(temp);
//	    	ad.removeLast();
//	    	tt.right=help(temp, h, ad);
//	    	tt.left=help(l, temp, ad);
//	    	return tt;
//	    	
//	    }
//	}
//
//	}
//
//public class lc449 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
