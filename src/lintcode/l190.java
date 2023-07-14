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
//    /**
//     * @param num: an array of integers
//     * @return: return nothing (void), do not return anything, modify num in-place instead
//     */
//     
//    public void reverse(int[] num, int start, int end) {
//        for (int i = start, j = end; i < j; i++, j--) {
//            int temp = num[i];
//            num[i] = num[j];
//            num[j] = temp;
//        }
//    }
//    
//    public void nextPermutation(int[] num) {
//        // find the last increase index
//        int index = -1;
//        for (int i = num.length - 2; i >= 0; i--) {
//            if (num[i] < num[i + 1]) {
//                index = i;
//                break;
//            }
//        }
//        if (index == -1) {
//            reverse(num, 0, num.length - 1);
//            return;
//        }
//        
//        // find the first bigger one
//        int biggerIndex = index + 1;
//        for (int i = num.length - 1; i > index; i--) {
//            if (num[i] > num[index]) {
//                biggerIndex = i;
//                break;
//            }
//        }
//
//        // swap them to make the permutation bigger
//        int temp = num[index];
//        num[index] = num[biggerIndex];
//        num[biggerIndex] = temp;
//        
//        // reverse the last part
//        reverse(num, index + 1, num.length - 1);
//    }
//}
//
//
//public class l190 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] nums= {1,1,5,4,3,2};
//		
//		test.nextPermutation(nums);
//		System.out.println("Hello World");
//
//	}
//}
