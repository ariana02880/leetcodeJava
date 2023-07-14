//import java.util.ArrayList;
//import java.util.Arrays;
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
//////ans:
////class Solution {
////    public int findLongestChain(int[][] pairs) {
////    	Arrays.sort(pairs, (a,b) -> a[0]==b[0]? a[1]-b[1] : a[0]-b[0]);
////        
////        int i, j, max = 0, n = pairs.length;
////        int dp[] = new int[n];
////      
////        for (i = 0; i < n; i++) 
////        	dp[i] = 1;
////        
////        for (i = 1; i < n; i++)
////            for (j = 0; j < i; j++)
////                if (pairs[j][1] < pairs[i][0] && dp[i] < dp[j] + 1)
////                    dp[i] = dp[j] + 1;
//// 
////        for (i = 0; i < n; i++) 
////        	if (max < dp[i]) max = dp[i];
////        
////        return max;
////    }
////}
//
////my
//class Solution {
//    public int findLongestChain(int[][] pairs) {
//    	int m=pairs.length;
//        int []dp=new int[m];
//        Arrays.sort(pairs, (a,b)->a[0]==b[0]? a[1]-b[1]:a[0]-b[0]);
//        for(int i=0;i<m;i++)
//        	dp[i]=1;
//        for(int i=1;i<m;i++) {
//        	for(int j=i-1;j>=0;j--) {
//        		if(pairs[i][0]>pairs[j][1])
//        			dp[i]=Math.max(dp[i], dp[j]+1);
//        	}
//        }
//        int ans=0;
//        for(int i=0;i<m;i++)
//        	ans=Math.max(ans, dp[i]);
//        return ans;
//    }
//}
//public class lc646 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[][]digits= {{1,2},{2,3},{3,4}};
//		Object a=test.findLongestChain(digits);
//		System.out.println("Hello World");
//
//	}
//}
