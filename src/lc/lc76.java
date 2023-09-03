// package lc;

// import java.lang.*;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.io.*;

// class Solution {
//   public String minWindow(String s, String t) {
//     char[] c1 = s.toCharArray(), c2 = t.toCharArray();
//     if (c2.length > c1.length)
//       return "";
//     int[] count = new int[128];
//     for (char c : c2)
//       count[c]++;
//     int left = 0, right = Integer.MAX_VALUE, l = 0, r = 0, cur = c2.length;
//     for (; r < c1.length; r++) {
//       // all char will be --
//       if (count[c1[r]]-- > 0)
//         cur--;
//       while (cur == 0) {
//         if (right - left > r - l) {
//           left = l;
//           right = r;
//         }
//         if (++count[c1[l++]] > 0)
//           cur++;
//       }
//     }
//     return right == Integer.MAX_VALUE ? "" : s.substring(left, right + 1);
//   }
// }

// public class lc76 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     String s = "ADOBECODEBANC", t = "ABC";

//     Object a = test.minWindow(s, t);
//     System.out.println("Hello World");

//   }
// }
