//package lintcode;
//package lc;
//import java.lang.*;
//import java.io.*;
//// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
//}
////Definition for a binary tree node.
//class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
//}
//
//
//
//
//
////ans
//class Solution {
//    /**
//     * Get all distinct N-Queen solutions
//     * @param n: The number of queens
//     * @return: All distinct solutions
//     * For example, A string '...Q' shows a queen on forth position
//     */
//    List<List<String>> solveNQueens(int n) {
//        List<List<String>> results = new ArrayList<>();
//        if (n <= 0) {
//            return results;
//        }
//        
//        search(results, new ArrayList<Integer>(), n);
//        return results;
//    }
//    
//    /*
//     * results store all of the chessboards
//     * cols store the column indices for each row
//     */
//    private void search(List<List<String>> results,
//                        List<Integer> cols,
//                        int n) {
//        if (cols.size() == n) {
//            results.add(drawChessboard(cols));
//            return;
//        }
//        
//        for (int colIndex = 0; colIndex < n; colIndex++) {
//            if (!isValid(cols, colIndex)) {
//                continue;
//            }
//            cols.add(colIndex);
//            search(results, cols, n);
//            cols.remove(cols.size() - 1);
//        }
//    }
//    
//    private List<String> drawChessboard(List<Integer> cols) {
//        List<String> chessboard = new ArrayList<>();
//        for (int i = 0; i < cols.size(); i++) {
//            StringBuilder sb = new StringBuilder();
//            for (int j = 0; j < cols.size(); j++) {
//                sb.append(j == cols.get(i) ? 'Q' : '.');
//            }
//            chessboard.add(sb.toString());
//        }
//        return chessboard;
//    }
//    
//    private boolean isValid(List<Integer> cols, int column) {
//        int row = cols.size();
//        for (int rowIndex = 0; rowIndex < cols.size(); rowIndex++) {
//            if (cols.get(rowIndex) == column) {
//                return false;
//            }
//            if (rowIndex + cols.get(rowIndex) == row + column) {
//                return false;
//            }
//            if (rowIndex - cols.get(rowIndex) == row - column) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
//
//public class l33 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//
//		Object a=test.solveNQueens(4);
//		System.out.println("Hello World");
//
//	}
//}
