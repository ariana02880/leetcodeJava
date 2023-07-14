//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
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
//////递归 没有用记忆化：
////class Solution {
////    public boolean stoneGame(int[] piles) {
////        return score(piles, 0, piles.length-1)>0;
////    }
////    public int score(int[] piles,int l,int r) {
////    	if(l==r)
////    		return piles[l];
////    	return Math.max(piles[l]-score(piles, l+1, r), 
////    			piles[r]-score(piles, l, r-1));
////    }
////}
//
////加上记忆化：
//class Solution {
//  public boolean stoneGame(int[] piles) {
//      int n=piles.length;
//      int[][] dp= new int[n][n];
//      for(int i=0;i<n;i++)
//    	  dp[i][i]=piles[i];
//      
//      for(int l=2;l<=n;l++) {
//    	  for(int i=0;i<=n-l;i++) {
//    		  int j=i+l-1;
//    		  dp[i][j]=Math.max(piles[i]-dp[i+1][j], 
//    				  piles[j]-dp[i][j-1]);
//    	  }
//      }
//      return dp[0][n-1]>0;
//      
//  }
//
//}
//
//public class lc877 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [] digits={5,3,14,5};
//		Object a=test.stoneGame(digits);
//		System.out.println("Hello World");
//
//	}
//}
