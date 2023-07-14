// package lintcode;
// package lc;

// import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.

// class ListNode {
//   int val;
//   ListNode next;

//   ListNode(int x) {
//     val = x;
//   }
// }

// // Definition for a binary tree node.
// class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;

//   TreeNode(int x) {
//     val = x;
//   }
// }

// class Solution {
//   public class Ariana implements Comparator<Interval> {
//     public int compare(Interval i1, Interval i2) {
//       int cmp = i1.start - i2.start;
//       if (cmp != 0)
//         return cmp;
//       return i1.end - i2.end;
//     }
//   }

//   public List<Interval> merge(List<Interval> intervals) {
//     // write your code here
//     if (intervals == null || intervals.size() == 0)
//       return new ArrayList<>();
//     Comparator<Interval> cmp = new Ariana();
//     Collections.sort(intervals, cmp);
//     ArrayList<Interval> ans = new ArrayList<>();
//     int start = intervals.get(0).start, end = intervals.get(0).end;
//     for (int i = 1; i < intervals.size(); i++) {
//       if (intervals.get(i).start <= end) {// merge
//         end = Math.max(end, intervals.get(i).end);
//       } else {
//         ans.add(new Interval(start, end));
//         start = intervals.get(i).start;
//         end = intervals.get(i).end;
//       }
//     }
//     ans.add(new Interval(start, end));
//     return ans;
//   }
// }

// public class l156 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     Object a = test.plusOne(digits);
//     System.out.println("Hello World");

//   }
// }