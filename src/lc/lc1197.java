// package lc;
// import java.lang.*;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Map;
// import java.util.Queue;
// import java.util.Set;
// import java.io.*;

// // Ariana BFS wrong
// class Solution {
//     class Point {
//         int x;
//         int y;
//         Point(int a, int b) {
//             x=a;
//             y=b;
//         }
//     }
//     public static final int[] dx = {1, 1, -1, -1, 2, 2, -2, -2};
//     public static final int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};
    
//     public int minKnightMoves(int x, int y) {
//         Point source = new Point(0,0);
//         Point destination = new Point(x,y);
//         return shortestPath(source, destination);
//     }
//     public int shortestPath( Point source, Point destination) {
//         Queue<Point> queue = new LinkedList<>();
//         queue.offer(source);
//         int level = 0;
//         Set<Point> visited = new HashSet<>();
//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             for (int cur=0; cur < size; cur++) {
//                 Point point = queue.poll();
//                 visited.add(point);
//                 if (point.x == destination.x && point.y == destination.y) {
//                     return level;
//                 }

//                 for (int i = 0; i < 8; i++) {
//                     int adjX = point.x + dx[i];
//                     int adjY = point.y + dy[i];
//                     Point np = new Point(adjX, adjY);
//                     if (visited.contains(np)){
//                         continue;
//                     }
//                     queue.offer(np);
//                 }
//             }
            
//             level++;
//         }   
//         return -1;
//     }
// }


// // //Correct
// // class Solution {
// //     public static final int[][] dirs = {{-2,-1},{-2,1},{2,-1},{2,1},{-1,-2},{-1,2},{1,-2},{1,2}};
// //     public int minKnightMoves(int x, int y) {
// //        x = Math.abs(x); y = Math.abs(y);
// //        Set<Pair<Integer, Integer>> set = new HashSet<>();
// //        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
// //        q.add(new Pair(0,0));
// //        int level = 0;
// //        while(!q.isEmpty()){
// //            int size = q.size();
// //            for (int k = 0; k < size; k++) {
// //                Pair<Integer, Integer> p = q.remove();
// //                if(p.equals(new Pair(x,y))) return level;
// //                int i = p.getKey();
// //                int j = p.getValue();
// //                for(int[] d : dirs){
// //                    Pair<Integer, Integer> p1 = new Pair(i +d[0], j + d[1]);
// //                    if(!set.contains(p1) && p1.getValue() >=-4 && p1.getKey() >= -4){
// //                        set.add(p1);
// //                        q.add(p1);
// //                    }
// //                }
// //             }
// //             level++;

// //        }   
// //        return level;  
// //    }
// // }

// public class lc1197 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a =test.minKnightMoves(2,1);



// 		System.out.println("Hello World");

// 	}
// }
