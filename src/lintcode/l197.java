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
//    /*
//     * @param A: An array of integers
//     * @return: A long integer
//     */
//    public long permutationIndex(int[] A) {
//        int[] smallerCount = new int[A.length];
//        
//        for (int i = A.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (A[j] > A[i]) {
//                    smallerCount[j]++;
//                }
//            }
//        }
//        
//        long[] permutation = new long[A.length];
//        for (int i = 0; i < A.length; i++) {
//            if (i == 0) {
//                permutation[i] = 1;
//            } else {
//                permutation[i] = permutation[i - 1] * (i + 1);
//            }
//        }
//        
//        long result = 0;
//        for (int i = 0; i < A.length - 1; i++) {
//            result += smallerCount[i] * permutation[A.length - 2 - i];
//        }
//        
//        return result + 1;
//    }
//}
//
//
//public class l197 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] nums= {3,2,1};
//		
//		long a=test.permutationIndex(nums);
//		System.out.println("Hello World");
//
//	}
//}
