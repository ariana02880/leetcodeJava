//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import com.sun.swing.internal.plaf.metal.resources.metal_zh_HK;
//
//import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
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
////my ans
//class Solution {
//    public int mincostTickets(int[] days, int[] costs) {
//    	int m=days.length;
//        int[] dp=new int[366];
//        for(int i=0;i<m;i++) {
//        	dp[days[i]]=days[i];
//        }
//        int size=days[m-1]+1;
//        for(int i=1;i<size;i++){
//        	if(dp[i]==0)
//        		dp[i]=dp[i-1];
//        	else{
//        		dp[i]=Math.min(dp[i-1]+costs[0],
//            			Math.min((i-7)>=0? dp[i-7]+costs[1]:dp[0]+costs[1], 
//            					(i-30)>=0?dp[i-30]+costs[2]: dp[0]+costs[2]));
//        	}
//        	
//        }
//        return dp[size-1];
//    }
//}
//
//////ans here
////class Solution {
////    public int mincostTickets(int[] days, int[] costs) {
////    	int m=days.length;
////        int[] dp=new int[366];
////        for(int i=0;i<m;i++) {
////        	dp[days[i]]=days[i];
////        }
////        int size=days[m-1]+1;
////        for(int i=1;i<366;i++){
////        	if(dp[i]==0)
////        		dp[i]=dp[i-1];
////        	else{
////        		dp[i] = dp[i - 1] + costs[0];
////        	      dp[i] = Math.min(dp[i], dp[Math.max(0, i - 7)] + costs[1]);
////        	      dp[i] = Math.min(dp[i], dp[Math.max(0, i - 30)] + costs[2]);
////        	}
////        	
////        }
////        return dp[365];
////    }
////}
//public class lc983 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		int p[]= {1,4,6,7,8};
//		int costs[]= {7,2,15};
//
//		Object a=test.mincostTickets(p,costs);
//		System.out.println("Hello World");
//
//	}
//}
