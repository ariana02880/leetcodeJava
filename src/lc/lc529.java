//package lc;
//
//import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;
//
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
////my 
//class Solution {
//	int [][] dir= {{-1,-1},{-1,0},{-1,1},
//			{0,-1},{0,1},
//			{1,-1},{1,0},{1,1}};
//	int m, n;
//    public char[][] updateBoard(char[][] board, int[] click) {
//        m=board.length;
//    	n=board[0].length;
//    	int i=click[0],j=click[1];
//        if(board[ i][ j]=='M') {
//        	board[ i][ j]='X';
//        }
//        else {
//        	help(i, j, board);
//        }
//        return board;
//    }
//    public void help(int i,int j,char [][] board) {
//    	int cnt=0,x,y;
//    	for(int k=0;k<8;k++) {
//    		x=i+dir[k][0];
//			y=j+dir[k][1];
//			if(x>=0&& x<m &&y>=0&& y<n) {
//				if(board[x][y]=='M')
//					cnt++;
//			}
//    	}
//    	if(cnt==0) {
//    		board[i][j]='B';
//    		for(int k=0;k<8;k++) {
//        		x=i+dir[k][0];
//    			y=j+dir[k][1];
//    			if(x>=0&& x<m &&y>=0&& y<n &&board[x][y] == 'E') {
//    				help(x, y, board);
//    			}
//        	}
//    	}
//    	else
//    		board[i][j]=(char) ('0'+cnt);
//    }
//}
//public class lc529 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		char [][] aa={{'E','E','E','E','E'},
//		              {'E','E','M','E','E'},
//		              {'E','E','E','E','E'},
//		              {'E','E','E','E','E'}};
//		int[] bb={3,0};
//		Object a=test.updateBoard(aa,bb);
//		System.out.println("Hello World");
//
//	}
//}
