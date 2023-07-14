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
//class Solution {
//    public int[] dailyTemperatures(int[] T) {
//        int[] ans = new int[T.length];
//        Stack<Integer> stack = new Stack<>();
//        for (int i = T.length - 1; i >= 0; --i) {
//            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) 
//            	stack.pop();
//            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
//            stack.push(i);
//        }
//        return ans;
//    }
//}
//
//public class lc739 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
