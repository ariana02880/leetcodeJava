// package lc;

// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Deque;
// import java.util.HashMap;
// import java.util.List;

// class Solution {
//   public int[] maxSlidingWindow(int[] nums, int k) {
//     List<Integer> max = new ArrayList<>();
//     // put potental index inside of D
//     Deque<Integer> d = new ArrayDeque<>();
//     for (int i = 0; i < nums.length; i++) {
//       // remove the smaller index
//       while (!d.isEmpty() && nums[d.peekLast()] <= nums[i])
//         d.pollLast();

//       // outside the window, remove it
//       if (!d.isEmpty() && d.peekFirst() <= i - k)
//         d.pollFirst();

//         d.offerLast(i);
//       if (i >= k - 1)
//         max.add(nums[d.peekFirst()]);
//     }
//     return max.stream().mapToInt(i -> i).toArray();
//   }
// }

// public class lc239 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
//     int[] a = test.maxSlidingWindow(nums, 3);

//     System.out.println("Hello World");

//   }
// }
