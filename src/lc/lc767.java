// package lc;

// import java.lang.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
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

// //// ans
// // class Solution {
// // public String reorganizeString(String S) {
// // int N = S.length();
// // int[] counts = new int[26];
// // for (char c: S.toCharArray()) counts[c-'a'] += 100;
// // for (int i = 0; i < 26; ++i) counts[i] += i;
// // Arrays.sort(counts);
// //
// // char[] ans = new char[N];
// // int t = 1;
// // for (int code: counts) {
// // int ct = code / 100;
// // char ch = (char) ('a' + (code % 100));
// // if (ct > (N+1) / 2)
// // return "";
// // for (int i = 0; i < ct; ++i) {
// // if (t >= N)
// // t = 0;
// // ans[t] = ch;
// // t += 2;
// // }
// // }
// // return String.valueOf(ans);
// // }
// // }
// class Solution {
//   public String reorganizeString(String S) {
//     int[] nums = new int[26];
//     for (char cc : S.toCharArray())
//       nums[cc - 'a'] += 100;
//     for (int i = 0; i < 26; i++)
//       nums[i] += i;
//     Arrays.sort(nums);

//     char[] ans = new char[S.length()];
//     int start = 1;
//     for (int aa : nums) {
//       int cnt = aa / 100;
//       if (cnt > (S.length() + 1) / 2)
//         return "";
//       char idx = (char) ('a' + (aa % 100));
//       for (int i = 0; i < cnt; i++) {
//         if (start >= S.length())
//           start = 0;
//         ans[start] = idx;
//         start += 2;
//       }
//     }
//     return String.valueOf(ans);
//   }
// }

// public class lc767 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     Object a = test.reorganizeString("aaaabbb");

//     for (int i = 0; i < 10; i = i++) {
//       i += 1;
//       System.out.println("Hello World!");
//       System.out.println(i);
//     }

//     System.out.println("Hello World");



//     List<Boolean> list = new ArrayList<>(); 
//     list.add(true);  
//     list.add(Boolean.parseBoolean("True"));  
//     list.add(Boolean.TRUE);  
//     System.out.print(list.size());  
//     System.out.print(list.get(1) instanceof Boolean);  

//   }
// }

