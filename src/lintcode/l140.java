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
//    public int fastPower(int a, int b, int n) {
//        long ans = 1, tmp = a;
//        
//        while (n != 0) {
//            if (n % 2 == 1) {
//                ans = (ans * tmp) % b;
//            }
//            tmp = (tmp * tmp) % b;
//            n = n / 2;
//        }
//        
//        return (int) ans % b;
//    }
//}
//
//public class l140 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [][] p= {{1,0}};
//		int[]A= {1,2,3};
//		Object a=test.fastPower(100,3,5);
//		System.out.println("Hello World");
//
//	}
//}
