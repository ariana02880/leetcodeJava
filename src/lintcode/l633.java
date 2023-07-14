// package lintcode;
// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
// }



// class Solution {
//   /**
//    * @param nums an array containing n + 1 integers which is between 1 and n
//    * @return the duplicate one
//    */
//   public int findDuplicate(int[] nums) {
//       // Write your code here
//       int l = 1;
//       int r = nums.length - 1;  // n
      
//       while (l + 1 < r) {
//           int mid = l + (r - l) / 2;
//           if (count(nums, mid) <= mid) {
//               l = mid;
//           } else {
//               r = mid;
//           }
//       }
      
//       if (count(nums, l) <= l) {
//           return r;
//       }
//       return l;
//   }
  
//   private int count(int[] nums, int mid) {
//       int cnt = 0;
//       for (int item : nums) {
//           if (item <= mid) {
//               cnt++;
//           }
//       }
//       return cnt;
//   }
// }



// public class l633 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int[][] cand= {{5,-1},{1,-10}};
		
// 		Object a=test.maxEnvelopes(cand);
// 		System.out.println("Hello World");

// 	}
// }
