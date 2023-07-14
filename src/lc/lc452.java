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
//    public int findMinArrowShots(int[][] points) {
//        int n=points.length;
//        if(n==0) return 0;
//        int ans=1;
//        Arrays.sort(points, (a,b)->{
//        	return a[1]-b[1];
//        });
//        int end=points[0][1];
//        for(int [] p:points) {
//        	if(p[0]>end) {
//        		end=p[1];
//        		ans++;
//        	}
//        }
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
