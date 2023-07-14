// package lc;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.PriorityQueue;
// import java.util.Set;
// // Definition for singly-linked list.

// class Solution {
//   public List<List<Integer>> getSkyline(int[][] buildings) {
//     List<List<Integer>> res = new ArrayList<>();
//     if (buildings == null || buildings.length <= 0)
//       return res;

//     List<int[]> point = new ArrayList<>();
//     for (int i = 0; i < buildings.length; i++) {
//       int[] one = buildings[i];
//       point.add(new int[] { one[0], one[2] });
//       point.add(new int[] { one[1], -one[2] });
//     }

//     Collections.sort(point, new Comparator<int[]>() {
//       @Override
//       public int compare(int[] a, int[] b) {
//         if (a[0] != b[0])
//           return a[0] - b[0];
//         else
//           return b[1] - a[1];
//       }
//     });

//     PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

//     // cur记录当前的最高的高度，pre记录之前的高度。
//     int cur = 0, pre = 0;
//     for (int i = 0; i < point.size(); i++) {
//       int[] one = point.get(i);
//       if (one[1] > 0) {
//         maxHeap.add(one[1]);
//         cur = maxHeap.peek();
//       } else {
//         maxHeap.remove(-one[1]);
//         cur = maxHeap.peek() == null ? 0 : maxHeap.peek();
//       }

//       if (pre != cur) {
//         List<Integer> temp = new ArrayList<>();
//         temp.add(one[0]);
//         temp.add(cur);
//         res.add(temp);
//         pre = cur;
//       }
//     }
//     return res;
//   }
// }

// public class lc218 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     int[][] ss = {{1,2,3},{2,5,3}};
//     Object a = test.getSkyline(ss);
//     System.out.println("Hello World");

//   }
// }
