// package lc;

// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Map;
// import java.util.Queue;
// import java.util.Random;
// import java.util.Set;
// // Definition for singly-linked list.
// import java.util.TreeMap;

// /**
//  * // This is the Master's API interface.
//  * // You should not implement it, or speculate about its implementation
//  * interface Master {
//  * public int guess(String word) {}
//  * }
//  */

// interface Master {
//   // public int guess(String word) {
//   //   return 12;
//   // }
// }

// class Solution {
//   public void findSecretWord(String[] words, Master master) {
//     Random rand = new Random();
//     ArrayList<String> poss = new ArrayList<>();
//     for (String word : words) {
//       poss.add(word);
//     }
//     while (true) {
//       int ind = rand.nextInt(poss.size());
//       String guess = poss.get(ind);
//       int score = master.guess(guess);
//       if (score == 6)
//         return;
//       ArrayList<String> temp = new ArrayList<>();
//       for (String word : poss) {
//         if (calcCloseness(word, guess) == score) {
//           temp.add(word);
//         }
//       }
//       poss = temp;
//     }
//   }

//   private int calcCloseness(String s1, String s2) {
//     int close = 0;
//     for (int i = 0; i < 6; i++) {
//       if (s1.charAt(i) == s2.charAt(i))
//         close++;
//     }
//     return close;
//   }

// }

// public class lc843 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     int[][] aa = { { 3, 1, 6 }, { -9, 5, 7 } };

//     int ans = test.maxIncreasingCells(aa);

//     System.out.println("Hello World");

//   }
// }