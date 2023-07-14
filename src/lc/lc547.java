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
//////my union find
////class Solution {
////	private int[] root;
////    public int findCircleNum(int[][] M) {
////        int m=M.length;
////        root=new int[m];
////        int ans=m;
////        for(int i=0;i<m;i++)
////        	root[i]=i;
////        for(int i=0;i<m;i++) {
////        	for(int j=i+1;j<m;j++) {
////        		if(M[i][j]==1) {
////        			int p=getRoot(i);
////            		int q=getRoot(j);
////            		if(p!=q) {
////            			ans--;
////            			root[p]=q;
////            		}
////        		}
////        		
////        	}
////        }
////        return ans;
////    }
////    public int getRoot(int i) {
////    	while(root[i]!=i)
////    		i=root[i];
////    	return i;
////    }
////}
//
////my dfs 100%
//class Solution {
//  public int findCircleNum(int[][] M) {
//      int m=M.length;
//      boolean [] visited=new boolean[m];
//      int ans=0;
//      for(int i=0;i<m;i++) {
//    	  if(!visited[i]) {
//    		  help(M, visited,i);
//    		  ans++;
//    	  }
//      }
//      return ans;
//  }
//  public void help(int [][]m,boolean [] visited,int idx ) {
//	  visited[idx]=true;
//	  for(int i=0;i<m.length;i++) {
//		  if(!visited[i] &&m[idx][i]==1) {
//			  help(m, visited, i);
//		  }
//	  }
//  }
//  
//}
//public class lc547 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [][]digits= {{1,1,0},
//				{1,1,0},
//				{0,0,1}};
//		Object a=test.findCircleNum(digits);
//		System.out.println("Hello World");
//
//	}
//}
