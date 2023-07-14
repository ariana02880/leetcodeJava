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
//     * @param envelopes a number of envelopes with widths and heights
//     * @return the maximum number of envelopes
//     */
//    public int maxEnvelopes(int[][] envelopes) {
//        // Write your code here
//        if(envelopes == null || envelopes.length == 0 
//            || envelopes[0] == null || envelopes[0].length != 2)
//            return 0;
//        Arrays.sort(envelopes, new Comparator<int[]>(){
//            public int compare(int[] arr1, int[] arr2){
//                if(arr1[0] == arr2[0])
//                    return arr2[1] - arr1[1];
//                else
//                    return arr1[0] - arr2[0];
//            } 
//        });
//        int dp[] = new int[envelopes.length];
//        int len = 0;
//        for(int[] envelope : envelopes){
//            int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
//                if(index < 0)
//                    index = -index - 1;
//            dp[index] = envelope[1];
//            if (index == len)
//                len++;
//        }
//        return len;
//    }
//}
//
//
//public class l602 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[][] cand= {{5,-1},{1,-10}};
//		
//		Object a=test.maxEnvelopes(cand);
//		System.out.println("Hello World");
//
//	}
//}
