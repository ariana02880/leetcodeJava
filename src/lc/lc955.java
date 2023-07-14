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
//
//class Solution {
//    public int minDeletionSize(String[] A) {
//       int ans=0;
//       int m=A.length,n=A[0].length();
//       String [] now=new String[A.length];
//       for(int c=0;c<n;c++) {
//    	   String[] temp=Arrays.copyOf(now, m);
//    	   for(int r=0;r<m;r++) {
//    		   temp[r]+=A[r].charAt(c);
//    	   }
//    	   if(help(temp)) {
//    		   now=temp;
//    	   }
//    	   else
//    		   ans++;
//       }
//       return ans;
//    }
//    public boolean help(String[] A) {
//    	for(int i=0;i<A.length-1;i++) {
//    		if(A[i].compareTo(A[i+1])>0)
//    			return false;
//    	}
//    	return true;
//    }
//}
//////ans
////class Solution {
////    public int minDeletionSize(String[] A) {
////        int N = A.length;
////        int W = A[0].length();
////        int ans = 0;
////        String[] cur = new String[N];
////        for (int j = 0; j < W; ++j) {
////            String[] cur2 = Arrays.copyOf(cur, N);
////            for (int i = 0; i < N; ++i)
////                cur2[i] += A[i].charAt(j);
////            if (isSorted(cur2))
////                cur = cur2;
////            else
////                ans++;
////        }
////        return ans;
////    }
////
////    public boolean isSorted(String[] A) {
////        for (int i = 0; i < A.length - 1; ++i)
////            if (A[i].compareTo(A[i+1]) > 0)
////                return false;
////        return true;
////    }
////}
//public class lc955 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		String A[]= {"xga","xfb","yfa"};
//		Object a=test.minDeletionSize(A);
//		System.out.println("Hello World");
//
//	}
//}
