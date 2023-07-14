//package lintcode;
//package lc;
//import java.lang.*;
//import java.io.*;
//// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
//}
////Definition for a binary tree node.
//class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
//}
//
//
//
//
//
//////my
////class Solution {
////    public ArrayList<String> ans=new ArrayList<>();
////    public List<String> findMissingRanges(int[] nums, long lower, long upper) {
////        // write your code here
////        if(nums==null|nums.length==0){
////            help(lower, upper);
////            return ans;
////        }
////
////        long start=lower;
////        long end;
////        for(int i=0;i<=nums.length;i++){
////            if(i==nums.length)
////                end=upper;
////            else
////                end=(long)nums[i]-1;
////            help(start, end);
////            start=(i==(long)nums.length)?0:(long)nums[i]+1;
////        }
////        return ans;
////    }
////    public void help(long start,long end) {
////    	if(start>end)
////    		return;
////    	if(start==end){
////            ans.add(start+"");
////        }
////        if(start<end){
////            ans.add(start+"->"+end);
////        }
////    }
////}
////ans
//class Solution {
//    public ArrayList<String> ans=new ArrayList<>();
//    public List<String> findMissingRanges(int[] nums, long lower, long upper) {
//        // write your code here
//        if(nums==null|nums.length==0){
//            help(lower, upper);
//            return ans;
//        }
//        help(lower,(long)nums[0]-1);
//        for(int i=1;i<nums.length;i++){
//            help((long)nums[i-1]+1,(long)nums[i]-1);
//        }
//        help((long)nums[nums.length-1]+1,upper);
//        return ans;
//    }
//    public void help(long start,long end) {
//    	if(start>end)
//    		return;
//    	if(start==end){
//            ans.add(start+"");
//        }
//        if(start<end){
//            ans.add(start+"->"+end);
//        }
//    }
//}
//public class l641 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [] t= {0,1,3,5,75};
//		Object a=test.findMissingRanges(t,0,99);
//		System.out.println("Hello World");
//
//	}
//}
