//import java.lang.reflect.GenericDeclaration;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
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
////全部枚举 先固定左上角 然后固定 矩形高度 宽度：
////class Solution {
////    public int countCornerRectangles(int[][] grid) {
////    	int m=grid.length;
////    	int n=grid[0].length;
////    	int ans=0;
////    	for(int i=0;i<m;i++) {
////    		for(int j=0;j<n;j++) {
////    			if(grid[i][j]==1) {
////    				for(int h=1;h<m-i;h++) {
////    					if(grid[i+h][j]==1) {
////    						for(int w=1;w<n-j;w++) {
////    							if(grid[i+h][j+w]==1 &&grid[i][j+w]==1)
////    								ans++;
////    						}
////    					}
////    				}
////    			}
////    		}
////    	}
////    	return ans;
////    }
////}
////another one 
//class Solution {
//    public int countCornerRectangles(int[][] grid) {
//        int m=grid.length,n=grid[0].length;
//        int ans=0;
//        for(int i=0;i<m;i++) {
//        	for(int j=i+1;j<m;j++) {
//        		int cnt=0;
//        		for(int k=0;k<n;k++) {
//        			if(grid[i][k]==1&& grid[j][k]==1)
//        				cnt++;
//        		}
//        		ans+=(cnt-1)*cnt/2;
//        	}
//        }
//        return ans;
//    }
//}
//
//public class lc750 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[][]digits= {{1,1},{1,1}};
//		Object a=test.countCornerRectangles(digits);
//		System.out.println("Hello World");
//
//	}
//}
