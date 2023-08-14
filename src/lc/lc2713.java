// package lc;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;
// import java.util.Set;
// // Definition for singly-linked list.
// import java.util.TreeMap;

// //Time:
// //Constructor: O(1),
// //addRange(left: int, right: int): O(klogn),
// //queryRange(left: int, right: int): O(logn),
// //removeRange(left: int, right: int): O(klogn), where k is # of overlapping ranges
// // Space: O(n)

// //https://leetcode.com/problems/maximum-strictly-increasing-cells-in-a-matrix/discuss/3570337/C%2B%2BorJavaorPythonDetailed-explanation
// //Time:O(mnlog(mn)) Space: O(mn)
// class Solution {
//     public int maxIncreasingCells(int[][] mat) {
//         int m = mat.length, n = mat[0].length;
//         TreeMap<Integer, List<int[]>> mp = new TreeMap<>();
//         for (int i = 0; i < m; i++)
//             for (int j = 0; j < n; j++)
//                 mp.computeIfAbsent(mat[i][j], k -> new ArrayList<>()).add(new int[]{i, j});
//         // row: what is the largest value in this row.
//         // col: what is the largest value in this col.
//         int[] row = new int[m], col = new int[n];
//         int[] tmpR = new int[m], tmpC = new int[n];
//         for (var v: mp.values()) {
//             for (int i = 0; i < v.size(); ++i) {
//                 int x = v.get(i)[0], y = v.get(i)[1];
//                 int s = Math.max(row[x], col[y]);
//                 tmpR[x] = Math.max(tmpR[x], s + 1);
//                 tmpC[y] = Math.max(tmpC[y], s + 1);
//             }
//             for (int i = 0; i < v.size(); ++i) {
//                 int x = v.get(i)[0], y = v.get(i)[1];
//                 row[x] = tmpR[x];
//                 col[y] = tmpC[y];
//             }
//         }
//         return Arrays.stream(row).max().getAsInt();
//     }
// }

// // // // ==============================================================================================================
// // // // Ariana DFS
// // class Solution {
// //   private int[][] visited;
// //   private boolean[][] visitedBFS;
// //   private int m, n;

// //   // 1: DFS:
// //   private int dfs(int x, int y, int[][] mat) {
// //     if (visited[x][y] != -1)
// //       return visited[x][y];

// //     int ans = 1;
// //     // for col
// //     for (int col = 0; col < n; col++) {
// //       if (mat[x][y] < mat[x][col]) {
// //         int colAns = 1 + dfs(x, col, mat);
// //         ans = Math.max(ans, colAns);
// //       }
// //     }

// //     // for row
// //     for (int row = 0; row < m; row++) {
// //       if (mat[x][y] < mat[row][y]) {
// //         int rowAns = 1 + dfs(row, y, mat);
// //         ans = Math.max(ans, rowAns);
// //       }
// //     }
// //     visited[x][y] = ans;
// //     return ans;
// //   }
// //   // DFS
// //   public int maxIncreasingCells(int[][] mat) {
// //     m = mat.length;
// //     n = mat[0].length;
// //     visited = new int[m + 1][n + 1];
// //     for (int[] row : visited) {
// //       Arrays.fill(row, -1);
// //     }

// //     int ans = 1;
// //     for (int i = 0; i < m; i++) {
// //       for (int j = 0; j < n; j++) {
// //         ans = Math.max(ans, dfs(i, j, mat));
// //       }
// //     }
// //     return ans;
// //   }



// //   // 2: Cannot use BFS, since we need to retrive the path.

// // //   private int bfs (int x, int y, int[][] mat) {
// // //     visitedBFS = new boolean[m][n];

// // //     Queue<int[]> q = new LinkedList<>();
// // //     q.add(new int[] { x, y });
// // //     int level = 0;
// // //     visitedBFS[x][y] = true;
// // //     while (!q.isEmpty()) {
// // //       int countQ = q.size();
// // //       level++;
// // //       for (int i = 0; i < countQ; i++) {
// // //         int[] dir = q.poll();
// // //         int curX = dir[0];
// // //         int curY = dir[1];
// // //         visitedBFS[curX][curY] = true;
// // //         for (int col = 0; col < n; col++) {
// // //           if (mat[curX][curY] < mat[curX][col] && !visitedBFS[curX][col]) {
// // //             q.add(new int[] { curX, col });
// // //           }
// // //         }

// // //         // for row
// // //         for (int row = 0; row < m; row++) {
// // //           if (mat[curX][curY] < mat[row][curY] && !visitedBFS[row][curY]) {
// // //             q.add(new int[] { row, curY });
// // //           }
// // //         }
// // //       }
// // //     }
// // //     return level;

// // //   }

// // // // BFS
// // //   public int maxIncreasingCells(int[][] mat) {
// // //     m = mat.length;
// // //     n = mat[0].length;


// // //     int ans = 1;
// // //     for (int i = 0; i < m; i++) {
// // //       for (int j = 0; j < n; j++) {
// // //         // ans = Math.max(ans, dfs(i, j, mat));
// // //         ans = Math.max(ans, bfs(i,j,mat));
// // //       }
// // //     }
// // //     return ans;
// // //   }
// // }

// public class lc2713 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     int[][] aa = { { 3, 1, 6 }, { -9, 5, 7 } };

//     int ans = test.maxIncreasingCells(aa);

//     System.out.println("Hello World");

//   }
// }