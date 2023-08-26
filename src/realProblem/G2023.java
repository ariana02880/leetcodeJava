// package realProblem;
// // There is a robot at location (0, 0) of a 10x10 input of tiles. Each tile can be one of 8 different colors: (C1, C2 … C8). 

// import java.util.HashMap;
// import java.util.Map;

// // There is a star at a known location (marked -1) on the input. You can program the robot by giving it a lookup table of color 
// // to direction. The robot will sense the color of the tile it is currently on, and move in the direction (North, South, East, or West) 
// // specified by the lookup table you provided. Output a table that guides the robot to the star, if such a table is possible.

// class Solution {
//     private HashMap<String, int[]> ans = new HashMap<>();
//     private int GRID_SIZE;
//     String[] dirString = new String[] { "North", "South", "West", "East" }; // North, East, South, West
//     static int[] dx = { -1, 0, 1, 0 };
//     static int[] dy = { 0, 1, 0, -1 };
//     boolean isPossible = false;

//     private boolean isValid(int x, int y) {
//         return x >= 0 && x < GRID_SIZE && y >= 0 && y < GRID_SIZE;
//     }

//     public Map<String, String> kEmptySlots(String[][] input, int size) {
//         GRID_SIZE = size;
//         boolean[][] visited = new boolean[GRID_SIZE][GRID_SIZE];
//         dfs(input, 0, 0, visited);
//         if (isPossible) {
//             return changeToAns();
//         }
//         return null;
//     }

//     private HashMap<String, String> changeToAns() {
//         HashMap<String, String> res = new HashMap<>();
//         // Iterating through all elements in the HashMap using keys
//         for (String key : ans.keySet()) {
//             int[] value = ans.get(key);
//             if (value[0] == 0 && value[1] == 1) {
//                 res.put(key, "East");
//             } else if (value[0] == 0 && value[1] == -1) {
//                 res.put(key, "West");
//             } else if (value[0] == 1 && value[1] == 0) {
//                 res.put(key, "South");
//             } else if (value[0] == -1 && value[1] == 0) {
//                 res.put(key, "North");
//             }
//         }
//         return res;
//     }

//     public void dfs(String[][] input, int x, int y, boolean[][] visited) {
//         if (input[x][y].equals("-1")) {
//             System.out.println("Star found!");
//             isPossible = true;
//             return;
//         }
//         visited[x][y] = true;
//         String color = input[x][y];
//         int newX, newY;

//         if (ans.containsKey(color)) {
//             int[] newD = ans.get(color);
//             // Move the robot in the specified direction

//             dfs(input, newD[0], newD[1], visited);

//             // If the star is found, you can terminate the search
//             // Otherwise, backtrack by moving the robot in the opposite direction
//         } else {
//             for (int direction = 0; direction < 4; direction++) {
//                 newX = x + dx[direction];
//                 newY = y + dy[direction];
//                 if (isValid(newX, newY) && !visited[newX][newY]) {
//                     ans.put(input[newX][newY], new int[] { newX, newY });
//                     dfs(input, newX, newY, visited);

//                     ans.remove(input[newX][newY]);
//                     visited[x][y] = false; // Backtrack
//                 }
//             }

//         }

//     }
// }

// public class G2023 {
//     public static void main(String arg[]) {
//         Solution test = new Solution();
//         int[] aa = { 3, 1, 4, 2, 7, 5, 6 };
//         int ans = test.kEmptySlots(aa, 2);
//         System.out.println("Hello World");
//     }
// }