// package lc;

// import java.lang.*;
// import java.io.*;

// // 分别找第 (m+n+1) / 2 个，和 (m+n+2) / 2 个，然后求其平均值即可，
// // 这对奇偶数均适用。若 m+n 为奇数的话，那么其实 (m+n+1) / 2 和 (m+n+2) / 2 的值相等，
// // 相当于两个相同的数字相加再除以2，还是其本身。
// // https://www.cnblogs.com/grandyang/p/4465932.html
// class Solution {
//   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//       int m = nums1.length, n = nums2.length, left = (m + n + 1) / 2, right = (m + n + 2) / 2;
//       return (findKth(nums1, 0, nums2, 0, left) + findKth(nums1, 0, nums2, 0, right)) / 2.0;
//   }
//   int findKth(int[] nums1, int i, int[] nums2, int j, int k) {
//       if (i >= nums1.length) return nums2[j + k - 1];
//       if (j >= nums2.length) return nums1[i + k - 1];
//       if (k == 1) return Math.min(nums1[i], nums2[j]);
//       int midVal1 = (i + k / 2 - 1 < nums1.length) ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
//       int midVal2 = (j + k / 2 - 1 < nums2.length) ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;
//       if (midVal1 < midVal2) {
//           return findKth(nums1, i + k / 2, nums2, j, k - k / 2);
//       } else {
//           return findKth(nums1, i, nums2, j + k / 2, k - k / 2);
//       }
//   }
// }

// public class lc4 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     String s = " a cc ";
//     Object a = test.lengthOfLongestSubstring(s);
//     System.out.println("Hello World");

//   }
// }
