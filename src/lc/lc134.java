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
//////ans
////class Solution {
////	  public int canCompleteCircuit(int[] gas, int[] cost) {
////	    int n = gas.length;
////
////	    int total_tank = 0;
////	    int curr_tank = 0;
////	    int starting_station = 0;
////	    for (int i = 0; i < n; ++i) {
////	      total_tank += gas[i] - cost[i];
////	      curr_tank += gas[i] - cost[i];
////	      // If one couldn't get here,
////	      if (curr_tank < 0) {
////	        // Pick up the next station as the starting one.
////	        starting_station = i + 1;
////	        // Start with an empty tank.
////	        curr_tank = 0;
////	      }
////	    }
////	    return total_tank >= 0 ? starting_station : -1;
////	  }
////}
//
//class Solution {
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//    	int n=gas.length;
//    	int start=0;
//    	int tatal=0;
//    	int cur=0;
//    	for(int i=0;i<n;i++) {
//    		tatal+=gas[i]-cost[i];
//    		cur+=gas[i]-cost[i];
//    		if(cur<0) {
//    			cur=0;
//    			start=i+1;
//    		}
//    	}
//        return tatal>=0? start: -1;
//    }
//}
//public class lc134 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
