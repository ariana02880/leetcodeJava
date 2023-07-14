//package lintcode;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
//
//import com.sun.beans.util.Cache;
//
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
//
//
////lintcode 1563????? why
//class Solution {
//    public int dx[]={0,0,1,-1};
//    public int dy[]={1,-1,0,0};
//    public boolean visited[][];
//    public int ans=Integer.MAX_VALUE;
//    
//    public int shortestPath(int[][] targetMap) {
//        // Write your code here
//        visited= new boolean[targetMap.length][targetMap[0].length];
//
//        dfs(targetMap,0,0,0);
//        return ans;
//    }
//    
//    public void dfs(int[][] targetMap,int x,int y,int temp){
//        if(targetMap[x][y]==2){
//            ans=Math.min(ans,temp);
//            return;
//        }
//
//        for(int i=0;i<4;i++){
//            int a1=x+dx[i];
//            int a2=y+dy[i];
//            if(a1>=targetMap.length||a1<0||a2>=targetMap[0].length||a2<0||targetMap[a1][a2]==1||visited[a1][a2]==true)
//            continue;
//            
//            visited[a1][a2]=true;
//            dfs(targetMap,a1,a2,temp+1);
//            visited[a1][a2]=false;
//        }
//        
//    }
//}
//public class l1563 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		int [][] tc={{0,0,0},{0,0,1},{0,0,2}};
//		Object a=test.shortestPath(tc);
//		System.out.println("Hello World");
//
//	}
//}