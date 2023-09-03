// package lc;

// import java.lang.*;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import org.w3c.dom.Node;
// import java.io.*;

// // Ariana
// // O(n)
// class Solution {
//   public List<Integer> findAnagrams(String s, String p) {
//     int ns = s.length(), np = p.length();
//     if (ns < np)
//       return new ArrayList<>();
//     Map<Character, Integer> pCount = new HashMap();
//     Map<Character, Integer> sCount = new HashMap();
//     // build reference hashmap using string p
//     for (char ch : p.toCharArray()) {
//       pCount.put(ch, pCount.getOrDefault(ch, 0) + 1);
//     }

//     List<Integer> output = new ArrayList();
//     // sliding window on the string s
//     for (int i = 0; i < ns; ++i) {
//       // add one more letter
//       // on the right side of the window
//       char ch = s.charAt(i);
//       sCount.put(ch, sCount.getOrDefault(ch, 0) + 1);
//       // remove one letter
//       // from the left side of the window
//       if (i >= np) {
//         ch = s.charAt(i - np);
//         if (sCount.get(ch) == 1) {
//           sCount.remove(ch);
//         } else {
//           sCount.put(ch, sCount.get(ch) - 1);
//         }
//       }
//       // compare hashmap in the sliding window
//       // with the reference hashmap
//       if (pCount.equals(sCount)) {
//         output.add(i - np + 1);
//       }
//     }
//     return output;
//   }
// }

// public class lc438 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     String s = "cbaebabacd", p = "abc";
//     Object a = test.findAnagrams(s, p);

//     System.out.println("Hello World");

//   }
// }
