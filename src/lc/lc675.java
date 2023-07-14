// package lc;

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.PriorityQueue;
// import java.util.Queue;
// import java.util.Set;



// class Solution {
//   class Point {
//       public int x =0;
//       public int y =0;
//       Point(int a, int b) {
//           x=a;
//           y=b;
//       }
//   }
//   class PointPQ {
//       public int x =0;
//       public int y =0;
//       public int val =0;
//       PointPQ(int a, int b, int c) {
//           x=a;
//           y=b;
//           val = c;
//       }
//   }
//   public class arianaComparator implements Comparator<PointPQ> {
//       public int compare(PointPQ x, PointPQ y) {
//         if (x.val > y.val) {
//           return 1;
//         } else if (x.val == y.val)
//           return 0;
//         else {
//           return -1;
//         }
//       }
//     }
//   public int[][] dir = {{0,1},{-1,0},{1,0},{0,-1}};

  
//   public int cutOffTree(List<List<Integer>> forest) {
//       int m = forest.size(), n = forest.get(0).size(), res = 0, row = 0, col = 0;
//       PriorityQueue<PointPQ> pq = new PriorityQueue<>(new arianaComparator());
//       for(int i=0; i<m; i++)
//           for(int j=0; j<n; j++)
//               if(forest.get(i).get(j) > 1)
//                   pq.add(new PointPQ(i,j,forest.get(i).get(j)) );
      

//       while (!pq.isEmpty()) {
//           PointPQ target = pq.poll();
//           int cnt = helper(forest, row, col, target.val);
//           if (cnt == -1) 
//               return -1;
//           res += cnt;
//           row = target.x;
//           col = target.y;
//       }
//       return res;
//   }
  
//   //BFS
//   public int helper(List<List<Integer>> forest, int row, int col, int target) {
//       if (forest.get(row).get(col) == target) 
//           return 0;
//       int m = forest.size(), n = forest.get(0).size(), cnt = 0;
//       Queue<Point> q = new LinkedList<>();
//       q.add(new Point(row,col));
//       int[][] visited = new int[m][n];

//       while (!q.isEmpty()) {
//           ++cnt;
//           for (int i = q.size(); i > 0; --i) {
//               Point now = q.poll();
//               for (int k = 0; k < 4; ++k) {
//                   int x = now.x + dir[k][0], y = now.y + dir[k][1];
                  
//                   if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y] == 1 || forest.get(x).get(y) == 0) continue;
//                   if (forest.get(x).get(y) == target) 
//                       return cnt;
//                   visited[x][y] = 1;
//                   q.add(new Point(x,y));
//               }
//           }
//       }
//       return -1;
//   }
// }





// public class lc675 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		List<List<Integer>> forest = new ArrayList<>();

//     List<Integer> a1 = new ArrayList<>();
//     a1.add(1);
//     a1.add(2);
//     a1.add(3);
//     List<Integer> a2 = new ArrayList<>();
//     a2.add(0);
//     a2.add(0);
//     a2.add(4);
//     List<Integer> a3 = new ArrayList<>();
//     a3.add(7);
//     a3.add(6);
//     a3.add(5);

//     forest.add(a1);
//     forest.add(a2);
//     forest.add(a3);

// 		Object a=test.cutOffTree(forest);
// 		System.out.println("Hello World");

// 	}
// }