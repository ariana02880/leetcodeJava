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
// // // brute force
// // class Solution {
// //   public List<List<Integer>> threeSum(int[] nums) {
// //       Arrays.sort(nums);
// //       List<List<Integer>> res = new ArrayList<>();
// //       for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
// //           if (i == 0 || nums[i - 1] != nums[i]) {
// //               twoSumII(nums, i, res);
// //           }
// //       return res;
// //   }
// //   void twoSumII(int[] nums, int i, List<List<Integer>> res) {
// //       int lo = i + 1, hi = nums.length - 1;
// //       while (lo < hi) {
// //           int sum = nums[i] + nums[lo] + nums[hi];
// //           if (sum < 0) {
// //               ++lo;
// //           } else if (sum > 0) {
// //               --hi;
// //           } else {
// //               res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
// //               while (lo < hi && nums[lo] == nums[lo - 1])
// //                   ++lo;
// //           }
// //       }
// //   }
// // }



// class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//    	Set<List<Integer>> res=new HashSet<>();
//    	Arrays.sort(nums);
//        if (nums.length==0 || nums[nums.length-1] < 0 || nums[0] > 0) 
//        	return new ArrayList<List<Integer>>();
//        for (int k = 0; k < nums.length; ++k) {
//            if (nums[k] > 0) 
//            	break;
//            int target = 0 - nums[k];
//            int i = k + 1, j = nums.length - 1;
//            while (i < j) {
//                if (nums[i] + nums[j] == target) {
//                	res.add(new ArrayList<Integer>(
//                			Arrays.asList(nums[k], nums[i], nums[j])  )
//                			);
                   
//                    ++i; --j;
//                } 
//                else if (nums[i] + nums[j] < target) 
//                	++i;
//                else 
//                	--j;
//            }
//        }
//        return  new ArrayList<>(res);
//    }
// }

// public class lc {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }
