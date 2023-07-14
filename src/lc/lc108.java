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
////my best one
//class Solution {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        TreeNode ans=help(0, nums.length-1,nums);
//        return ans;
//    }
//    public TreeNode help(int start,int end,int[] nums) {
//    	if(start>end)
//    		return null;
//    	int m=start+(end-start)/2;
//    	TreeNode t=new TreeNode(nums[m]);
//    	t.left=help(start, m-1, nums);
//    	t.right=help(m+1, end, nums);
//    	return t;
//    }
//}
//public class lc {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
