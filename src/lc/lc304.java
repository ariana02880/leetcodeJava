// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
// // Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }

// //class NumMatrix {
// //	private int dp[][];
// //    public NumMatrix(int[][] matrix) {
// //    	if (matrix.length==0 || matrix[0].length==0) 
// //			return;
// //    	dp=new int[matrix.length + 1][matrix[0].length + 1];
// //		for (int i = 1; i <= matrix.length; ++i) {
// //			for (int j = 1; j <= matrix[0].length; ++j) {
// //				dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + matrix[i - 1][j - 1];
// //			}
// //		}
// //    }
// //    
// //    public int sumRegion(int row1, int col1, int row2, int col2) {
// //    	return dp[row2 + 1][col2 + 1] - dp[row1][col2 + 1] - dp[row2 + 1][col1] + dp[row1][col1];
// //    }
// //}
// //faster
// class NumMatrix {
   
//    private int[][] dp;

//    public NumMatrix(int[][] matrix) {
//    	//this chunk is faster
//        if (null == matrix || 0 == matrix.length) {
//            return;
//        }
//        int m = matrix.length;
//        int n = matrix[0].length;
//        dp = new int[m + 1][n + 1];
//        //chunck end
       
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                dp[i][j] = 
//                    matrix[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
//            }
//        }
//    }
   
//    public int sumRegion(int row1, int col1, int row2, int col2) {
//        return dp[row2 + 1][col2 + 1] - dp[row2 + 1][col1] - dp[row1][col2 + 1] + dp[row1][col1];
//    }
// }
// public class lc304 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }