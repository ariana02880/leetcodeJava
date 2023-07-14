//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Set;
//import java.util.Vector;
//
//import com.sun.corba.se.impl.protocol.JIDLLocalCRDImpl;
//
//import sun.java2d.pipe.SpanClipRenderer;
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
////class NumArray {
////	private int [] dp;
////
////    public NumArray(int[] nums) {
////        if(nums.length>=1) {
////        	dp=new int[nums.length];
////        	dp[0]=nums[0];
////        	for(int i=1;i<nums.length;i++) {
////        		dp[i]=nums[i]+dp[i-1];
////        	}
////        }
////        
////    }
////    
////    public int sumRange(int i, int j) {
////    	if(i==0)
////    		return dp[j];
////    	else{
////        	return dp[j]-dp[i-1];
////        }
////    }
////}
//
////fast and correct:
//class NumArray {
//    
//    private final int[] nums;
//
//    public NumArray(int[] nums) {
//        this.nums = nums;
//        for(int i=1;i<nums.length;i++){
//            nums[i]+=nums[i-1];
//        }
//    }
//    
//    public int sumRange(int i, int j) {
//        if(i==0){
//            return nums[j];
//        }
//        return nums[j]-nums[i - 1];
//    }
//}
//
//public class lc303 {
//	public static void main(String arg[]) {
//		//Solution test=new Solution();
//		
//		List<Integer>aa=new ArrayList<Integer>();
//		aa.size();
//		aa.add(23);
//		//aa.set(3, 23);
//
//		List bb=new Vector<Integer>();
//		bb.size();
//		bb.add(11);
//		bb.add(23);
//		bb.add(1);
//		bb.add(2);
//		bb.add(3);
//		bb.add(4);
//		Iterator<Integer> it=bb.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		Collections.reverse(bb);
//		
//		//bb.set(3, 23);
//		//Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}