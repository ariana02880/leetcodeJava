// package lc;

// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.List;

// class Solution {
//   public int maxSubArray(int[] nums) {
//     // Initialize our variables using the first element.
//     int currentSubarray = nums[0];
//     int maxSubarray = nums[0];

//     // Start with the 2nd element since we already used the first one.
//     for (int i = 1; i < nums.length; i++) {
//       int num = nums[i];
//       // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
//       currentSubarray = Math.max(num, currentSubarray + num);
//       maxSubarray = Math.max(maxSubarray, currentSubarray);
//     }

//     return maxSubarray;
//   }
// }

// public class lc53 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//     int a = test.maxSubArray(input);
//     System.out.println("Hello World");

//   }
// }
