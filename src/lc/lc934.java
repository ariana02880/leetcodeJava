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

// // DFS + BFS intuitive solution: https://leetcode.com/problems/shortest-bridge/discuss/3547779/Java-DFS-%2B-BFS-intuitive-solution
// // T O(n), S O(n);
// class Solution {
//     int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
//     public int shortestBridge(int[][] grid) {
//         int rows = grid.length, columns = grid[0].length, count = 0;
//         int[][] visited = new int[rows][columns];
//         int islandCount = 0;
//         Queue<Pair> queue = new ArrayDeque<>();
//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < columns; j++) {
//                 if(grid[i][j] == 1 && visited[i][j] == 0) {
//                     islandCount++;
//                     DFS(i, j, grid, visited, islandCount);
//                 }
//                 if(visited[i][j] == 2) queue.add(new Pair(i, j));
//             }
//         }
//         outer: while(!queue.isEmpty()) {
//             int size = queue.size();
//             for(int i = 0; i < size; i++) {
//                 Pair current = queue.poll();
//                 for(int j = 0; j < 4; j++) {
//                     int row = current.row + dx[j];
//                     int column = current.column + dy[j];
//                     if(!isSafe(row, column, grid) || visited[row][column] == 2) continue;
//                     if(visited[row][column] == 1)
//                       break outer;
//                     queue.add(new Pair(row, column));
//                     visited[row][column] = 2;
//                 }
//             }
//             count++;
//         }
//         return count;
//     }
//     public void DFS(int i, int j, int[][] grid, int[][] visited, int islandCount) {
//         if(!isSafe(i, j, grid) || visited[i][j] == islandCount || grid[i][j] == 0)
//           return;
//         visited[i][j] = islandCount;
//         for(int x = 0; x < 4; x++) {
//             int row = i + dx[x], column = j + dy[x];
//             DFS(row, column, grid, visited, islandCount);
//         }
//     }
//     public boolean isSafe(int i, int j, int[][] grid) {
//         int rows = grid.length, columns = grid[0].length;
//         if(i < 0 || i >= rows || j < 0 || j >= columns)
//           return false;
//         return true;
//     }
//     class Pair {

//         int row, column;
//         Pair(int row, int column) {
//             this.row = row;
//             this.column = column;
//         }
//     }
// }

// public class lc934 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     int[][] aa = { { 3, 1, 6 }, { -9, 5, 7 } };

//     int ans = test.maxIncreasingCells(aa);

//     System.out.println("Hello World");

//   }
// }