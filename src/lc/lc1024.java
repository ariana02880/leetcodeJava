// package lc;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// import sun.net.www.content.text.plain;
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

// class Solution {
//    public int videoStitching(int[][] clips, int T) {
//    	int m=clips.length;
//        int [] dp=new int[m];
//        Arrays.sort(clips, (a,b)->a[0]==b[0]? a[1]-b[1]:a[0]-b[0]);
//        if(clips[0][0]!=0) return -1;
//        for(int i=0;i<m;i++) {
//        	if(clips[i][0]==0)
//        		dp[i]=1;
//        	else
//        		dp[i]=Integer.MAX_VALUE;
//        }
       	
//        for(int i=1;i<m;i++) {
//        	for(int j=0;j<i;j++) {
//        		if(clips[i][0]<=clips[j][1])
//        			dp[i]=dp[j]==Integer.MAX_VALUE? dp[i] :Math.min(dp[j]+1, dp[i]);
//        	}
//        }
//        int ans=Integer.MAX_VALUE;
//        for(int i=0;i<m;i++) {
//        	if(clips[i][1]>=T) {
//        		ans=Math.min(ans, dp[i]);
//        	}
//        }
//        return ans==Integer.MAX_VALUE? -1: ans;
       
//    }
// }
// public class lc1024 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		int[][]input= {{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},
// 				{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}};
// 		int[][]input2= {{0,4},{2,8}};
// 		int[][] input3={{11,28},{35,40},{28,38},{0,10},{37,39},{40,40},{18,34},{32,38},{14,36},{33,36}};


		
// 		Object a=test.videoStitching(input3,8);
// 		System.out.println("Hello World");

// 	}
// }
