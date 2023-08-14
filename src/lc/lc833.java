// package lc;

// import java.lang.*;
// import java.util.TreeMap;
// import java.io.*;

// class Solution {
//   public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
//     StringBuilder sb = new StringBuilder(s);
//     TreeMap<Integer, Integer> map = new TreeMap<>();
//     for (int i = 0; i < indices.length; i++)
//       map.put(indices[i], i);
//     for (int key : map.descendingKeySet()) {
//       int i = map.get(key);
//       if (s.substring(indices[i]).startsWith(sources[i]))
//         sb.replace(indices[i], indices[i] + sources[i].length(), targets[i]);
//     }
//     return sb.toString();
//   }
// }

// public class lc833 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     Object a = test.findReplaceString(
//         "abcd",
//         new int[] { 0, 2 },
//         new String[] { "a", "cd" },
//         new String[] { "eee", "ffff" });

//     System.out.println("Hello World");

//   }
// }
