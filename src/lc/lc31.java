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
////my
//class Solution {
//    public void nextPermutation(int[] nums) {
//        int m=nums.length-2;
//        while(m>=0){
//            if(nums[m] <nums[m+1]){
//                int target=m;
//                int i=target+1;
//                while(i<nums.length){
//                    if( nums[target]>=nums[i]){
//                        swap(nums,target,i-1);
//                        reverse(nums,target+1,nums.length-1);
//                        return;
//                    }
//                    i++;
//                }
//                swap(nums,target,nums.length-1);
//                reverse(nums,target+1,nums.length-1);
//                return;
//            }
//            m--;
//        }
//        if(m==-1){
//            reverse(nums,0,nums.length-1);
//        }
//    }
//    public void swap(int[] nums,int target,int c){
//        int temp=nums[target];
//        nums[target]=nums[c];
//        nums[c]=temp;
//    }
//    public void reverse(int[] nums,int start,int end){
//        for(int i=start,target=end;i<target;i++,target--){
//                            int temp=nums[target];
//                            nums[target]=nums[i];
//                            nums[i]=temp;
//                        }
//    }
//}
//
//public class lc31 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
