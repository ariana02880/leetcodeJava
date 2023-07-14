//package lc;
//import java.lang.*;
//import java.io.*;
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
////my Dijkstra's Algorithm
//class Solution {
//    int[] dist;
//    int [][] map;
//    public int networkDelayTime(int[][] times, int N, int K) {
//        map=new int[N+1][N+1];
//        for(int i=0;i<=N;i++) {
//        	for(int j=0;j<=N;j++)
//        		map[i][j]=-1;
//        }
//        dist=new int[N+1];
//        Arrays.fill(dist, Integer.MAX_VALUE);
//        dist[K]=0;
//        for(int [] aa:times) {
//        	map[aa[0]][aa[1]]=aa[2];
//        }
//        
//        Queue<Integer> qq = new LinkedList<>();
//        qq.add(K);
//        while(!qq.isEmpty()) {
//        	for(int idx=qq.size()-1;idx>=0;idx--) {
//        		int u=qq.remove();
//            	for(int i=1;i<=N;i++) {
//            		if(map[u][i]!=-1 && dist[i]> dist[u]+map[u][i]) {
//            			qq.add(i);
//            			dist[i]=dist[u]+map[u][i];
//            		}
//            	}
//        	}        	
//        }
//        int ans=0;
//        for(int i=1;i<=N;i++) {
//        	ans=Math.max(ans, dist[i]);
//        }
//        return ans==Integer.MAX_VALUE? -1: ans;
//    }
//}
//public class lc743 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[][]times= {{1,2,2},{1,3,4},
//				{2,1,1},{2,3,5},
//				{3,1,3},{3,2,6}};
//		int n=3;
//		int k=1;
//		Object a=test.networkDelayTime(times,n,k);
//		System.out.println("Hello World");
//
//	}
//}
