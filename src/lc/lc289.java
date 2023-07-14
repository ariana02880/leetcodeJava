// import java.util.HashMap;
// import com.sun.javafx.image.IntPixelAccessor;
// // Definition for singly-linked list.

// class Solution {
//   public void gameOfLife(int[][] board) {

//     // Neighbors array to find 8 neighboring cells for a given cell
//     int[] neighbors = { 0, 1, -1 };

//     int rows = board.length;
//     int cols = board[0].length;

//     // Create a copy of the original board
//     int[][] copyBoard = new int[rows][cols];

//     // Create a copy of the original board
//     for (int row = 0; row < rows; row++) {
//       for (int col = 0; col < cols; col++) {
//         copyBoard[row][col] = board[row][col];
//       }
//     }

//     // Iterate through board cell by cell.
//     int[] x = new int[] { -1, -1, -1, 0, 1, 1, 1, 0 };
//     int[] y = new int[] { -1, 0, 1, 1, 1, 0, -1, -1 };

//     for (int row = 0; row < rows; row++) {
//       for (int col = 0; col < cols; col++) {

//         // For each cell count the number of live neighbors.
//         int liveNeighbors = 0;

//         for (int i = 0; i < 8; i++) {
//           int r = (row + x[i]);
//           int c = (col + y[i]);

//           // Check the validity of the neighboring cell.
//           // and whether it was originally a live cell.
//           // The evaluation is done against the copy, since that is never updated.
//           if ((r < rows && r >= 0) && (c < cols && c >= 0) && (copyBoard[r][c] == 1)) {
//             liveNeighbors += 1;
//           }

//         }

//         // Rule 1 or Rule 3
//         if ((copyBoard[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
//           board[row][col] = 0;
//         }
//         // Rule 4
//         if (copyBoard[row][col] == 0 && liveNeighbors == 3) {
//           board[row][col] = 1;
//         }
//       }
//     }
//   }
// }





// public class lc289 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     int[] digits = new int[] { 2, 4, 3, 9 };
//     int[] a = test.plusOne(digits);
//     System.out.println("Hello World");

//   }
// }
