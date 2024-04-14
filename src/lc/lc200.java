// package lc;


// import java.lang.*;
// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Queue;
// import java.util.Set;
// import java.io.*;
// // // DFS
// // class Solution {
// //     int[][] dirs = {{0,1}, {1,0}, {-1,0}, {0,-1}};
// //     private void helper (int i, int j, char[][]grid) {
// //         if (i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j] == '1') {
// //             grid[i][j]= '0';
// //             for (int[] dir: dirs) {
// //                 helper(i+dir[0], j+dir[1], grid);
// //             }
// //         }
// //     }
// //     public int numIslands(char[][] grid) {
// //         int m = grid.length;
// //         int n = grid[0].length;
// //         int num_island = 0;
// //         for (int i=0 ;i <m;i++) {
// //             for ( int j=0; j<n; j++) {
// //                 if (grid[i][j] == '1') {
// //                     helper(i,j, grid);
// //                     num_island++;
// //                 }
// //             }
// //         }
// //         return num_island;
// //     }
// // }

// // Ariana BFS
// class Coordinate {
//     int x, y;
//     public Coordinate(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }
// }

// public class Solution {
//     /**
//      * @param grid a boolean 2D matrix
//      * @return an integer
//      */
//     int[] deltaX = {0, 1, -1, 0};
//     int[] deltaY = {1, 0, 0, -1};
//     public int numIslands(char[][] grid) {
//         if (grid == null || grid.length == 0) {
//             return 0;
//         }
//         if (grid[0] == null || grid[0].length == 0) {
//             return 0;
//         }
        
//         int islands = 0;
//         int n = grid.length, m = grid[0].length;
//         boolean[][] visited = new boolean[n][m];
        
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (grid[i][j] == '1' && !visited[i][j]) {
//                     bfs(grid, i, j, visited);
//                     islands++;
//                 }
//             }
//         }
        
//         return islands;
//     }
    
//     private void bfs(char[][] grid, int x, int y, boolean[][] visited) {
//         Queue<Coordinate> queue = new ArrayDeque<>();
//         queue.offer(new Coordinate(x, y));
//         visited[x][y] = true;
        
//         while (!queue.isEmpty()) {
//             Coordinate coor = queue.poll();
//             for (int direction = 0; direction < 4; direction++) {
//                 int newX = coor.x + deltaX[direction];
//                 int newY = coor.y + deltaY[direction];
//                 if (!isVaild(grid, newX, newY, visited)) {
//                     continue;
//                 }
//                 queue.offer(new Coordinate(newX, newY));
//                 visited[newX][newY] = true;
//             }
//         }
//     }
    
//     private boolean isVaild(char[][] grid, int x, int y, boolean[][] visited) {
//         int n = grid.length, m = grid[0].length;
//         if (x < 0 || x >= n || y < 0 || y >= m) {
//             return false;
//         }
//         if (visited[x][y]) {
//             return false;
//         }
//         return grid[x][y] == '1';
//     }
// }

// public class lc200 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
//         int[][] final_state = new int[2][3];
//         final_state[0][0]=1;
//         final_state[0][1]=2;
//         final_state[0][2]=3;
        
//         final_state[1][0]=4;
//         final_state[1][1]=0;
//         final_state[1][2]=5;
		
// 		Object a=test.slidingPuzzle(final_state);
// 		System.out.println("Hello World");

// 	}
// }
