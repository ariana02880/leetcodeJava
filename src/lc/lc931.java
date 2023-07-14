//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import com.sun.accessibility.internal.resources.accessibility;
//
//import sun.util.locale.provider.FallbackLocaleProviderAdapter;
// // Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
//}
// //Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
////my dp 
//class Solution {
//    public int minFallingPathSum(int[][] A) {
//    	int m=A.length,n=A[0].length;
//    	int [][] dp=new int[m+1][n+2];
//    	for(int i=0;i<m+1;i++) {
//    		dp[i][0]=Integer.MAX_VALUE;
//    		dp[i][n+1]=Integer.MAX_VALUE;
//    	}
//    	for(int i=0;i<m;i++) {
//    		for(int j=1;j<n+1;j++) {
//    			dp[i][j]=A[i][j-1];
//    		}
//    	}
//    
//    	for(int i=1;i<m+1;i++) {
//    		for(int j=1;j<n+1;j++) {
//    			dp[i][j]=dp[i][j]+ Math.min(dp[i-1][j-1], Math.min(dp[i-1][j],dp[i-1][j+1] ));
//    		}
//    	}
//    	
//    	int ans=Integer.MAX_VALUE;
//    	for(int j=0;j<n+1;j++) {
//    		ans=Math.min(ans, dp[m][j]);
//    	}
//    	return ans;
//    	
//    }
//}
//
//public class lc931 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [][]digits= {{1,2,3},{4,5,6},{7,8,9}};
//		Object a=test.minFallingPathSum(digits);
//		System.out.println("Hello World");
//
//	}
//}
