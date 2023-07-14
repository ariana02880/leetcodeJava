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


// // // my time limit
// // class Solution {
// //   /**
// //    * @param nums: an array with positive and negative numbers
// //    * @param k: an integer
// //    * @return: the maximum average
// //    */
// //   public double maxAverage(int[] nums, int k) {
// //       // write your code here
// //       if(nums == null ||nums.length ==0){
// //           return 0;
// //       }
// //       double l = nums[0];
// //       double r = nums[0];
// //       for(int aa:nums){
// //           l = Math.min(l, aa);
// //           r = Math.max(r, aa);
// //       }
// //       while(l+1e-5 < r){
// //           double mid = l+(r-l)/2;
// //           if(canFind(mid, nums, k)){
// //               l=mid;
// //           }
// //           else r = mid;
// //       }
// //       if(canFind(r, nums, k)){
// //           return r;
// //       }
// //       return l;
// //   }
// //   public boolean canFind(double mid, int[]nums, int k){
// //       double[] sum = new double[nums.length +1 ];
// //       sum[0]=0;
// //       for(int i=1;i<sum.length; i++){
// //           sum[i] = sum[i-1]+ nums[i-1] -mid;
// //       }
// //       for(int i=0;i<sum.length-k;i++){
// //           for(int j=i+k;j<sum.length ; j++){
// //               if(sum[j]-sum[i] >= 0){
// //                   return true;
// //               }
// //           }
// //       }
// //       return false;
// //   }
// // }

// //others
// class Solution {
//   /**
//    * @param nums: an array with positive and negative numbers
//    * @param k: an integer
//    * @return: the maximum average
//    */
//   public double maxAverage(int[] nums, int k) {
//       if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
//           return 0;
//       }
       
//       double lo = nums[0];
//       double hi = nums[0];
//       for (int i = 0; i < nums.length; i++) {
//           lo = Math.min(lo, nums[i]);
//           hi = Math.max(hi, nums[i]);
//       }
       
//       while (lo + 1e-5 < hi) {
//           double mid = lo + (hi - lo) / 2;
//           if (canFind(nums, k, mid)) {
//               lo = mid;
//           } else {
//               hi = mid;
//           }
//       }
       
//       return lo;
//   }
   
//   private boolean canFind(int[] nums, int k, double target) {
//       double leftSum = 0;
//       double rightSum = 0;
//       double minLeftSum = 0;
       
//       for (int i = 1; i <= nums.length; i++) {
//           rightSum += nums[i - 1] - target;
           
//           if (i >= k) {
//               leftSum += i > k ? nums[i - k - 1] - target : 0;
               
//               minLeftSum = Math.min(leftSum, minLeftSum);
           
//               if (rightSum - minLeftSum >= 0) {
//                   return true;
//               }
//           }
//       }
       
//       return false;
//   }
// }

// public class l617 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int [] p= {1,12,-5,-6,50,3};
//     int k = 3;
// 		double a =test.maxAverage(p , k);
// 		System.out.println("Hello World");

// 	}
// }
