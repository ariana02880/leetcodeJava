
// package lintcode;

// import java.util.Comparator;
// import java.util.PriorityQueue;

// class Solution {
//   /**
//    * @param heights: a matrix of integers
//    * @return: an integer
//    */
//   class pairComparator implements Comparator<pair> {
//     public int compare(pair x, pair y) {
//       if (x.height > y.height) {
//         return 1;
//       } else if (x.height == y.height)
//         return 0;
//       else {
//         return -1;
//       }
//     }
//   }

//   class pair {
//     public int x, y, height;
//     pair(int a, int b, int c) {
//       x = a;
//       y = b;
//       height = c;
//     }
//   }

//   public int trapRainWater(int[][] height) {
//     // write your code here
//     if (height == null || height.length == 0 || height[0].length == 0) {
//       return 0;
//     }
//     int ans = 0;
//     PriorityQueue<pair> minQ = new PriorityQueue<>(new pairComparator());
//     int[] dx = { 0, 1, 0, -1 };
//     int[] dy = { 1, 0, -1, 0 };
//     int m = height.length;
//     int n = height[0].length;
//     boolean[][] visit = new boolean[m][n];
//     for (int i = 0; i < m; i++) {
//       for (int j = 0; j < n; j++) {
//         if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
//           minQ.add(new pair(i, j, height[i][j]));
//           visit[i][j] = true;
//         }
//       }
//     }
//     while (!minQ.isEmpty()) {
//       pair now = minQ.poll();
//       for (int q = 0; q < 4; q++) {
//         int nx = dx[q] + now.x;
//         int ny = dy[q] + now.y;
//         if (nx >= 0 && nx < m && ny >= 0 && ny < n && visit[nx][ny] == false) {
//           int h = Math.max(height[nx][ny], now.height);
//           ans += Math.max(0, h - height[nx][ny]);
//           visit[nx][ny] = true;
//           minQ.add(new pair(nx, ny, h));
//         }
//       }

//     }
//     return ans;
//   }
// }

// public class l364 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     int[][] p = { { 12, 13, 0, 12 }, { 13, 4, 13, 12 }, { 13, 8, 10, 12 }, { 12, 13, 12, 12 }, { 13, 13, 13, 13 } };
//     Object a = test.trapRainWater(p);

//     System.out.println("Hello World");

//   }
// }
