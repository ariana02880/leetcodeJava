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
//    public int matrixScore(int[][] A) {
//    	int m=A.length,n=A[0].length;        
//        int ans=(1<<(n-1))*m;
//        for(int i=1;i<n;i++) {
//        	int cnt=0;
//        	for(int j=0;j<m;j++) {
//        		if(A[j][i]==A[j][0])
//        			cnt++;
//        	}
//        	ans+=(1<<(n-1-i))* Math.max(cnt,(m-cnt));
//        }
//        return ans;
//    }
//}
//
//public class lc861 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		int [][]A={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
//		Object a=test.matrixScore(A);
//		System.out.println("Hello World");
//
//	}
//}
