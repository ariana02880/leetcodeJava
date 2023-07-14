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
//////ans:
////class Solution{
////	public int depthSum(List<NestedInteger> nestedList) {
////	    return depthSum(nestedList, 1);
////	}
////
////	public int depthSum(List<NestedInteger> list, int depth) {
////	    int sum = 0;
////	    for (NestedInteger n : list) {
////	        if (n.isInteger()) {
////	            sum += n.getInteger() * depth;
////	        } else {
////	            sum += depthSum(n.getList(), depth + 1);
////	        }
////	    }
////	    return sum;
////	}
////}
////my:
//class Solution {
//    public int depthSum(List<NestedInteger> nestedList) {
//        return help(nestedList, 1);
//    }
//    public int help(List<NestedInteger> nestedList,int depth) {
//    	int ans=0;
//    	for(NestedInteger n:nestedList) {
//    		if(n.isInteger())
//    			ans+=n.getInteger()*depth;
//    		else
//    			ans+=help(n.getList(), depth+1);
//    	}
//    	return ans;
//    }
//}
//
//public class lc339 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		List<NestedInteger> nestedList;
//		Object a=test.depthSum(nestedList);
//		System.out.println("Hello World");
//
//	}
//}
