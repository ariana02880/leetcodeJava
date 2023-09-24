// package lc;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.PriorityQueue;
// // Definition for singly-linked list.
// class State{
//     public int x;
//     public int y;
//     public int dis;
//     public String path;
//     State(int row, int col, int distance, String pathS) {
//         x = row;
//         y = col;
//         dis = distance;
//         path = pathS;
//     }
// }
// class Solution {
//     private int[][]dir = {{0,-1}, {0, 1}, {-1,0}, {1,0}};
//     private String[] dirS = {"l", "r", "u", "d"};
//     private PriorityQueue<State> pq = new PriorityQueue<>((a,b) -> {
//         if (a.dis != b.dis) {
//             return a.dis - b.dis;
//         } else {
//             return a.path.compareTo(b.path);
//         }
//     });
//     public String findShortestWay(int[][] maze, int[] ball, int[] hole) {
//         pq.add(new State(ball[0], ball[1], 0, ""));
//         boolean[][] seen = new boolean[maze.length][maze[0].length];
//         while(!pq.isEmpty()) {
//             State cur = pq.remove();
//             int curX = cur.x;
//             int curY = cur.y;
//             if (seen[curX][curY]) {
//                 continue;
//             }
//             if (curX == hole[0] && curY == hole[1]) {
//                 return cur.path;
//             }
//             seen[curX][curY] = true;
            
//             for (State s: getNei(curX, curY, maze, hole)) {
//                 pq.add(new State(curX, curY, cur.dis + s.dis, cur.path + s.path));
//             }
//         }
//         return "impossible";
//     }
//     private List<State> getNei (int x, int y, int[][] maze, int[] hole) {
//         List<State> ans = new ArrayList<>();
//         int idx = 0;
//         for (int[] d: dir) {
//             int newX = x;
//             int newY = y;
//             int distance = 0;
//             String dString = dirS[idx++]; // should be one char

//             while (isValid(newX + d[0],newY + d[1], maze)) {
//                 if (newX==hole[0] && newY == hole[1]) {
//                     break;
//                 }
//                 distance++;
//                 newX += d[0];
//                 newY += d[1];
//             }
//             ans.add(new State(newX, newY, distance, dString));
//         }
//         return ans;
//     }
//     private boolean isValid(int x, int y, int[][] maze) {
//         if(x>=0 && y>=0 && x<maze.length && y< maze[0].length && maze[x][y]==0) {
//             return true;
//         }
//         return false;
//     }
// }

// public class lc499 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
//         int[][] maze = {{0,0,0,0,0,0,0},{0,0,1,0,0,1,0},{0,0,0,0,1,0,0},{0,0,0,0,0,0,1}};
//         int[] ball = {0,4}, hole = {3,5};
		
// 		Object a=test.findShortestWay(maze, ball, hole);
// 		System.out.println("Hello World");

// 	}
// }