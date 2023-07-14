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
//////my slower:
////class Solution {
////	private List< List<Integer>  > m=new ArrayList<>();
////    public List<Integer> largestValues(TreeNode root) {
////        help(root, 0);
////        List<Integer> ans=new ArrayList<>();
////        for(List<Integer> aa:m) {
////        	Collections.sort(aa);
////        	ans.add(aa.get(aa.size()-1));
////        }
////        return ans;
////    }
////    public void help(TreeNode root, int h) {
////    	if(root==null)
////    		return;
////    	if(m.size()==h)
////    		m.add(new ArrayList<>());
////    	m.get(h).add(root.val);
////    	help(root.left, h+1);
////    	help(root.right, h+1);
////    	
////    }
////}
//
////my way2 100%
//class Solution {
//    public List<Integer> largestValues(TreeNode root) {
//        List<Integer> ans=new ArrayList<>();
//        help(root, 0,ans);
//        return ans;
//    }
//    public void help(TreeNode root, int h,List<Integer> ans) {
//    	if(root==null)
//    		return;
//    	if(ans.size()<=h)
//    		ans.add(root.val);
//    	if(ans.get(h)< root.val) {
//    		ans.set(h, root.val);
//    	}
//    	help(root.left, h+1,ans);
//    	help(root.right, h+1,ans);
//    	
//    }
//}
//
//public class lc515 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
