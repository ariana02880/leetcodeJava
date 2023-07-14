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
//////ans:
////class Solution {
////    public List<Integer> addToArrayForm(int[] A, int K) {
////        int N = A.length;
////        int cur = K;
////        List<Integer> ans = new ArrayList();
////
////        int i = N;
////        while (--i >= 0 || cur > 0) {
////            if (i >= 0)
////                cur += A[i];
////            ans.add(cur % 10);
////            cur /= 10;
////        }
////
////        Collections.reverse(ans);
////        return ans;
////    }
////}
////my
//class Solution {
//    public List<Integer> addToArrayForm(int[] A, int K) {
//        List <Integer> ans=new ArrayList<>();
//        int cur=K;int i=A.length-1;
//        while(i>=0||cur>0){
//        	if(i>=0)
//        		cur+=A[i];//********
//            ans.add(cur%10);
//            cur=cur/10;
//            i--;
//        }
//        Collections.reverse(ans);
//        return ans;
//    }
//}
//
//public class lc {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//		
//		class Solution {
//		    public void merge(int[] nums1, int m, int[] nums2, int n) {
//		        System.arraycopy(nums2, 0, nums1, m, n);
//		    Arrays.sort(nums1);
//		    }
//		}
//
//	}
//}
