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
//    public int minDeletionSize(String[] A) {
//    	int cnt=0;
//        for(int i=0;i<A[0].length();i++) {
//        	int temp=0;
//        	for(int j=0;j<A.length;j++) {
//        		int cur=A[j].charAt(i)-'a';
//        		if(cur<temp) {
//        			cnt++;
//        			break;
//        		}
//        		else
//        			temp=cur;
//        	}
//        }
//        return cnt;
//    }
//}
////ans:
//class Solution {
//    public int minDeletionSize(String[] A) {
//        int ans = 0;
//        for (int c = 0; c < A[0].length(); ++c)
//            for (int r = 0; r < A.length - 1; ++r)
//                if (A[r].charAt(c) > A[r+1].charAt(c)) {
//                    ans++;
//                    break;
//                }
//
//        return ans;
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
