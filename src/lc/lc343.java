//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import sun.awt.image.IntegerComponentRaster;
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
//class Solution {
////	public int integerBreak(int n) {
////        List<Integer> dp=new ArrayList<Integer>();
////        dp.add(0);//{0,0,1,2,4,6,9};
////        dp.add(0);
////        dp.add(1);
////        dp.add(2);
////        dp.add(4);
////        dp.add(6);
////        dp.add(9);
////        for(int i=7;i<=n;i++)
////        {
////            dp.add(3*dp.get(i-3));
////        }
////        return dp.get(n);
////    }
//	public int integerBreak(int n) {
//	    if (n == 2)
//	        return 1;
//	    if (n == 3)
//	        return 2;
//	        
//	    int[] dp = new int[n+1];
//	    dp[2] = 2;
//	    dp[3] = 3;
//	    dp[4] = 4;
//	    for (int i = 5; i <= n; i++) {
//	            dp[i] = dp[i-3] * 3;
//	        }    
//	    
//	        return dp[n];
//	    }
//}
//
//
//public class lc343 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.integerBreak(10);
//		System.out.println("Hello World");
//
//	}
//}