// package lc;
// import java.lang.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
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
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> res = new ArrayList<>();
//         for (int i = 0; i < nums.length - 2; i++) {
//             if (i > 0 && nums[i] == nums[i - 1]) 
//                 continue;
//             int l = i + 1, r = nums.length - 1;
//             while (l < r) {
//                 int tmp = nums[l] + nums[r];
//                 if (nums[i] + tmp == 0) {
//                     res.add(Arrays.asList(nums[i], nums[l], nums[r]));
//                     l++;
//                     while (l < r && nums[l] == nums[l - 1]) l++;
//                 } else if (nums[i] + tmp < 0) 
//                         l++;
//                 else 
//                     r--;
//             }
//         }
//         return res;
//     }
// }

// public class lc15 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
//          int [] input = {-1,0,1,2,-1,-4};
		
// 		Object a=test.threeSum(input);
// 		System.out.println("Hello World");

// 	}
// }
