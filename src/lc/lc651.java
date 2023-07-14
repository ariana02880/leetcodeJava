//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
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
//
////my 注意N<4的情况：
//class Solution {
//    public int maxA(int N) {
//        int []dp=new int[N];
//        if(N<=4)
//        	return N;
//        for(int i=0;i<=3;i++) {
//        	dp[i]=i+1;
//        }
//        	
//        for(int i=4;i<N;i++) {
//        	dp[i]=dp[i-1]+1;
//        	for(int x=1;x<=i-2;x++)
//        		dp[i]=Math.max(dp[i], dp[i-2-x]*(x+1));
//        }
//        return dp[N-1];
//    }
//}
//
//public class lc651 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.maxA(7);
//		System.out.println("Hello World");
//
//	}
//}
//
