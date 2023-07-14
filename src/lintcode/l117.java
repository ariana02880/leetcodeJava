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
////ans
//class Solution {
//    public int jump(int[] A) {
//        if (A == null || A.length == 0) {
//            return -1;
//        }
//        int start = 0, end = 0, jumps = 0;
//        while (end < A.length - 1) {
//            jumps++;
//            int farthest = end;
//            for (int i = start; i <= end; i++) {
//                if (A[i] + i > farthest) {
//                    farthest = A[i] + i;
//                }
//            }
//            start = end + 1;
//            end = farthest;
//        }
//        return jumps;
//    }
//}
//
//
//public class l117 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[]cand= {2,1,3,1,4};
//		
//		Object a=test.jump(cand);
//		System.out.println("Hello World");
//
//	}
//}
