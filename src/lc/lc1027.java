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
//////ans:
////class Solution {
////    public int longestArithSeqLength(int[] A) {
////    	List<Map<Integer, Integer>> table = new ArrayList<>();
////        table.add(new HashMap<>());
////
////        int max = 0;
////        for(int i = 1; i < A.length; ++i) {
////            Map<Integer, Integer> cur = new HashMap<>();
////            for(int j = 0; j < i; ++j) {
////                int diff = A[i]-A[j];
////                Map<Integer, Integer> mapj = table.get(j);
////                int curmax = mapj.getOrDefault(diff, 1) + 1;
////                cur.put(diff, curmax);
////                max = Math.max(max, curmax);
////            }
////            table.add(cur);
////        }
////        return max;
////    }
////}
////my:
//class Solution {
//  public int longestArithSeqLength(int[] A) {
//		int m=A.length;
//	  	List<Map<Integer,Integer>> table=new ArrayList<>();
//	  	table.add(new HashMap<>());
//	  	int ans=0;
//	  	for(int i=1;i<m;i++) {
//	  		Map<Integer, Integer> temp=new HashMap<>();
//	  		for(int j=0;j<i;j++) {
//	  			int diff=A[j]-A[i];
//	  			Map<Integer,Integer> tableM=table.get(j);
//	  			int cur=tableM.getOrDefault(diff, 1)+1;
//	  			temp.put(diff, cur);
//	  			ans=Math.max(ans, cur);
//	  		}
//	  		table.add(temp);
//	  	}
//	  	return ans;
//	  }
//}
//
//public class lc1027 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [] digits= {9,4,7,2,10};
//		Object a=test.longestArithSeqLength(digits);
//		System.out.println("Hello World");
//
//	}
//}
