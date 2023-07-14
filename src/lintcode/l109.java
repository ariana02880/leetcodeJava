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
//    int[][] minA;
//    int n;
//    public int minimumTotal(int[][] triangle) {
//        // write your code here
//        if (triangle == null || triangle.length == 0) {
//            return -1;
//        }
//        if (triangle[0] == null || triangle[0].length == 0) {
//            return -1;
//        }
//
//        n=triangle.length;
//        minA=new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                minA[i][j] = Integer.MAX_VALUE;
//            }
//        }
//        return help(0,0,triangle);
//    }
//    
//    
//    
//    private int help(int x,int y,int[][] triangle){
//        if(x>=n||y>x+1){
//            return 0;
//        }
//        //important
//        if (minA[x][y] != Integer.MAX_VALUE) {
//            return minA[x][y];
//        }
//        minA[x][y]=Math.min(  help(x+1,y,triangle),help(x+1,y+1,triangle)) +triangle[x][y];
//        return minA[x][y];
//    }
//    
//    //better
//    public int minimumTotal(int[][] triangle) {
//        if (triangle == null || triangle.length == 0) {
//            return -1;
//        }
//        if (triangle[0] == null || triangle[0].length == 0) {
//            return -1;
//        }
//        
//        // state: f[x][y] = minimum path value from x,y to bottom
//        int n = triangle.length;
//        int[][] f = new int[n][n];
//        
//        // initialize 
//        for (int i = 0; i < n; i++) {
//            f[n - 1][i] = triangle[n - 1][i];
//        }
//        
//        // bottom up
//        for (int i = n - 2; i >= 0; i--) {
//            for (int j = 0; j <= i; j++) {
//                f[i][j] = Math.min(f[i + 1][j], f[i + 1][j + 1]) + triangle[i][j];
//            }
//        }
//        
//        // answer
//        return f[0][0];
//    }
//}
//
//
//public class l109 {
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
