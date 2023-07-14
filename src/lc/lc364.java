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
//	private int height=1;
//	int sum=0;
//    public int depthSumInverse(List<NestedInteger> nestedList) {
//        helper(nestedList, 1);
//        helper2(nestedList, height);
//        return sum;
//        
//    }
//    
//    public void helper(List<NestedInteger> nestedList,int h) {
//    	height=Math.max(height, h);
//    	for(NestedInteger aa:nestedList) {
//    		if(!aa.isInteger())
//    			helper(aa.getList(), h+1);
//    	}
//    }
//    public void helper2(List<NestedInteger> nestedList,int h) {
//    	for(NestedInteger aa:nestedList) {
//    		if(!aa.isInteger()) {
//    			helper2(aa.getList(), h-1);
//    		}
//    		else 
//    			sum+= aa.getInteger()*h;
//    	}
//    }
//}
//
////ans
//class Solution {
//    private int dpth = 1;
//    public int depthSumInverse(List<NestedInteger> nestedList) {
//        count(nestedList, dpth); // count the total level
//        return partialSum(nestedList, dpth);
//    }
//    
//    private void count(List<NestedInteger> nestedList, int depth){
//        dpth = Math.max(depth, dpth);
//        for (int i = 0; i < nestedList.size(); i++){
//            NestedInteger curNI = nestedList.get(i);
//            if (!curNI.isInteger()) count(curNI.getList(), depth+1);
//        }
//    }
//    
//    private int partialSum(List<NestedInteger> nestedList, int depth){
//        int count = 0;
//        for (int i = 0; i < nestedList.size(); i++){
//            NestedInteger curNI = nestedList.get(i);
//            if (curNI.isInteger()) count += depth*curNI.getInteger();
//            else count += partialSum(curNI.getList(), depth-1);
//        }
//        return count;
//    }
//}
//public class lc364 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		List<NestedInteger> nestedList;
//		NestedInteger t1;
//		Object a=test.depthSumInverse(nestedList);
//		System.out.println("Hello World");
//
//	}
//}
