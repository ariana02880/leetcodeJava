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
////my
//class Solution {
//    public int[] kClosestNumbers(int[] A, int target, int k) {
//        // write your code here
//        int left=0;int right=A.length-1;
//        int[] ans=new int[k];
//        
//        if(A.length==0){
//            return new int[0];
//        }
//        while(left<right-1){
//            int mid=left+(right-left)/2;
//            if(A[mid]<target){
//                left=mid;
//            }
//            else{
//                right=mid;
//            }
//        }
//        
//        for(int i=0;i<k;i++){
//            if(isLeft(A,left,right,target)){
//                ans[i]=A[left];
//                left--;
//            }
//            else{
//                ans[i]=A[right];
//                right++;
//            }
//        }
//        return ans;
//    }
//    public boolean isLeft(int[] A,int left,int right,int target){
//        if(left<0||left>=A.length)
//            return false;
//        if(right<0||right>=A.length)
//            return true;
//        if(Math.abs(A[left]-target)> Math.abs(A[right]-target)){
//            return false;
//        }
//        return true;
//    }
//}
//public class l460 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [][] p= {{1,0}};
//		int[]A= {1,2,3};
//		Object a=test.kClosestNumbers(A, 2, 3);
//		System.out.println("Hello World");
//
//	}
//}
