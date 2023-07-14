// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
// // brute force:
// class Solution {
//   public int maxArea(int[] height) {
//       int ans=0;
//       for(int i=0;i<height.length;i++){
//           for(int j = i+1;j<height.length;j++){
//               ans=Math.max(ans, Math.min(height[i],height[j]) * (j-i));
//           }
//       }
//       return ans;
      
//   }
// }


// // // faster double pointer
// // class Solution {
// //   public int maxArea(int[] height) {
// //       int maxarea = 0, l = 0, r = height.length - 1;
// //       while (l < r) {
// //           maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
// //           if (height[l] < height[r])
// //               l++;
// //           else
// //               r--;
// //       }
// //       return maxarea;
// //   }
// // }



// public class lc11 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		// Object a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }
