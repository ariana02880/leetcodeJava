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
//////my slow dfs
////class Solution {
////	int [] colors;
////	boolean ans=true;
////    public boolean isBipartite(int[][] graph) {
////        int m=graph.length;
////        for(int i=0;i<m;i++) {//
////        	colors=new int[m];
////        	help(graph, i, 1);
////        	if(!ans)
////        		return ans;
////        }
////        
////        return ans==true;
////    }
////    public void help (int [][] graph,int cur,int c) {
////    	if(ans) {
////    		if(colors[cur]!=0) {
////        		ans=colors[cur]==c;
////        		return;
////        	}
////    		colors[cur]=c;
////        	for(int aa:graph[cur]) {
////        		help(graph, aa, -1*c);
////        	}
////    	}
////    	
////    }
////}
//
////my union-find//great
//class Solution {
//	int [] root;
//    public boolean isBipartite(int[][] graph) {
//        int m=graph.length;
//        root=new int[m];
//        for(int i=0;i<m;i++) root[i]=i;
//        for(int i=0;i<m;i++) {
//        	if(graph[i].length!=0) {
//        		int x=find(i),y=find(graph[i][0]);
//        		if(x==y) return false;
//        		for(int j=1;j<graph[i].length;j++) {
//        			int p=find(graph[i][j]);
//        			if(x==p) return false;
//        			root[p]=y;
//        		}
//        	}
//        	
//        }
//        return true;
//    }
//    public int find(int idx) {
//    	int ans=idx;
//    	while(root[ans]!=ans)
//    		ans=root[ans];
//    	while(idx!=ans) {
//    		int temp=root[idx];
//    		root[idx]=ans;
//    		idx=temp;
//    	}
//    	return ans;
//    }
//}
//public class lc785 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		int [][] graph={{1,2,3}, {0,2}, {0,1,3}, {0,2}};
//		int[][] g2={{},
//		            {2,4,6},
//		            {1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
//
//
//		Object a=test.isBipartite(g2);
//		System.out.println("Hello World");
//
//	}
//}
