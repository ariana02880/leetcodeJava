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
//////my
////class Solution {
////    public List<List<Integer>> generate(int numRows) {
////        List<List<Integer>> ans=new ArrayList<>();
////        if(numRows==0)
////            return ans;
////        ans.add(new ArrayList<>() );//ans[0]
////        ans.get(0).add(1);
////        for(int i=1;i<numRows;i++){
////        	ans.add(new ArrayList<>());
////        	ans.get(i).add(1);
////            for(int j=1;j<i;j++){
////                ans.get(i).add(ans.get(i-1).get(j-1)+ ans.get(i-1).get(j) );
////            }
////            ans.get(i).add(1);
////        }
////        return ans;
////        
////    }
////}
//class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        int start=0;int end=numbers.length-1;
//        int sum=0;
//        while(start<end){
//            sum=numbers[start]+numbers[end];
//            if(sum==target)
//                return new int[]{start+1,end+1};
//            if(sum<target)
//                start++;
//            else 
//                end--;
//        }
//        return new int[0];
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
