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
// import java.util.Set;
// // Definition for singly-linked list.
// import java.util.TreeMap;

// // Time & space: O(V + E).
// class Solution {
//   public int minimumSemesters(int N, int[][] relations) {
//     Map<Integer, List<Integer>> g = new HashMap<>(); // key: prerequisite, value: course list.
//     int[] inDegree = new int[N + 1]; // inDegree[i]: number of prerequisites for i.
//     for (int[] r : relations) {
//       g.computeIfAbsent(r[0], l -> new ArrayList<>()).add(r[1]); // construct graph.
//       inDegree[r[1]]++; // count prerequisites for r[1].
//     }
//     Queue<Integer> q = new ArrayDeque<>(); // save current 0 in-degree vertices.
//     for (int i = 1; i <= N; i++)
//       if (inDegree[i] == 0)
//         q.add(i);
//     int semester = 0;
//     while (!q.isEmpty()) { // BFS traverse all currently 0 in degree vertices.
//       for (int sz = q.size(); sz > 0; sz--) { // sz is the search breadth.
//         int c = q.poll();
//         N--;
//         if (!g.containsKey(c))
//           continue; // c's in-degree is currently 0, but it has no prerequisite.
//         for (int course : g.remove(c))
//           if (--inDegree[course] == 0) // decrease the in-degree of course's neighbors.
//             q.offer(course); // add current 0 in-degree vertex into Queue.
//       }
//       semester++; // need one more semester.
//     }
//     return N == 0 ? semester : -1;
//   }
// }

// public class lc1136 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     int[][] aa = { { 3, 1, 6 }, { -9, 5, 7 } };

//     int ans = test.maxIncreasingCells(aa);

//     System.out.println("Hello World");

//   }
// }