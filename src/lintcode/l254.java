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
//     * @param n: An integer
//     * @return: The sum of a and b
//     */
//    public int dropEggs(int n) {
//        // write your code here
//        // ��ʵ������x : x + (x - 1) + (x - 2)+ ... + 1 > = n, �� (x + 1) * x / 2 >= n
//        // �ȱ��������ұ߽磬Ȼ����ַ���first position >= n�� ����Search in a Big Sorted Array 
//        // ��Ҫע�����n���������������������long 
//        long index = 1;
//        while (index * (index + 1) / 2 < n) {
//            index = index * 2;
//        }
//        
//        long start = 1;
//        long end = index;
//        while (start + 1 < end) {
//            long mid = start + (end - start) / 2;
//            if (mid * (mid + 1) / 2 >= n) {
//                end = mid;
//            } else {
//                start = mid;
//            } 
//        }
//        
//        if (start * (start + 1) / 2 >= n) {
//            return (int)start;
//        } else {
//            return (int)end;
//        }
//    }
//}
//
//public class l254 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [][] p= {{1,0}};
//		int[]A= {1,2,3};
//		Object a=test.dropEggs(100);
//		System.out.println("Hello World");
//
//	}
//}
