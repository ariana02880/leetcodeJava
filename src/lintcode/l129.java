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
////ans
//class Solution {
//    /**
//     * @param hashTable: A list of The first node of linked list
//     * @return: A list of The first node of linked list which have twice size
//     */
//    public ListNode[] rehashing(ListNode[] hashTable) {
//        // write your code here
//        if (hashTable.length <= 0) {
//            return hashTable;
//        }
//        int newcapacity = 2 * hashTable.length;
//        ListNode[] newTable = new ListNode[newcapacity];
//        for (int i = 0; i < hashTable.length; i++) {
//            while (hashTable[i] != null) {
//                int newindex
//                 = (hashTable[i].val % newcapacity + newcapacity) % newcapacity;
//                if (newTable[newindex] == null) {
//                    newTable[newindex] = new ListNode(hashTable[i].val);
//                   // newTable[newindex].next = null;
//                } else {
//                    ListNode dummy = newTable[newindex];
//                    while (dummy.next != null) {
//                        dummy = dummy.next;
//                    }
//                    dummy.next = new ListNode(hashTable[i].val);
//                }
//                hashTable[i] = hashTable[i].next;
//            }
//        }
//        return newTable;
//    }
//}
//
//public class l129 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] cand= {1,4,2,7,4,6,2};
//		
//		//Object a=test.combinationSum(cand, 7);
//		System.out.println("Hello World");
//
//	}
//}
