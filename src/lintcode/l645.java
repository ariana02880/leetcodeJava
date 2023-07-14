//package lintcode;
//package lc;
//import java.lang.*;
//import java.io.*;
//// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
//}
////Definition for a binary tree node.
//class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
//}
//
//
//
//
//
////my
//class Solution extends Relation {
//    /**
//     * @param n a party with n people
//     * @return the celebrity's label or -1
//     */
//    public int findCelebrity(int n) {
//        // Write your code here
//        int start=0;
//        for(int i=1;i<n;i++){
//            if(knows(start,i))
//                start=i;
//        }
//        for(int i=0;i<n;i++){
//            if(start!=i && knows(start,i))//not me + know one
//            return -1;
//            if(start!=i && !knows(i,start))//not me + one does not know 
//            return -1;
//        }
//        return start;
//    }
//}
//public class l645 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.isNumber("1      ");
//		System.out.println("Hello World");
//
//	}
//}
