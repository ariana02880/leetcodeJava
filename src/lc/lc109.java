//package lc;
//
//import javax.sound.sampled.LineListener;
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
//
//////ans:
////class Solution {
////
////  private ListNode findMiddleElement(ListNode head) {
////    ListNode prevPtr = null;
////    ListNode slowPtr = head;
////    ListNode fastPtr = head;
////    // Iterate until fastPr doesn't reach the end of the linked list.
////    while (fastPtr != null && fastPtr.next != null) {
////      prevPtr = slowPtr;
////      slowPtr = slowPtr.next;
////      fastPtr = fastPtr.next.next;
////    }
////    // Handling the case when slowPtr was equal to head.
////    if (prevPtr != null) {
////      prevPtr.next = null;
////    }
////    return slowPtr;
////  }
////
////  public TreeNode sortedListToBST(ListNode head) {
////    // If the head doesn't exist, then the linked list is empty
////    if (head == null) {
////      return null;
////    }
////    // Find the middle element for the list.
////    ListNode mid = this.findMiddleElement(head);
////    // The mid becomes the root of the BST.
////    TreeNode node = new TreeNode(mid.val);
////    // Base case when there is just one element in the linked list
////    if (head == mid) {
////      return node;
////    }
////    // Recursively form balanced BSTs using the left and right halves of the original list.
////    node.left = this.sortedListToBST(head);
////    node.right = this.sortedListToBST(mid.next);
////    return node;
////  }
////}
////my
//class Solution {
//    public TreeNode sortedListToBST(ListNode head) {
//    	if(head==null)
//    		return null;
//    	ListNode mid=help(head);
//    	TreeNode nn=new TreeNode(mid.val);
//    	if(mid!=head) {
//    		nn.left=sortedListToBST(head);
//    		nn.right=sortedListToBST(mid.next);
//    	}
//    	return nn;
//    }
//    public ListNode help(ListNode head) {
//    	ListNode t1=head,t2=head;
//    	ListNode pre=null;
//        while(t2!=null&& t2.next!=null ) {
//        	pre=t1;
//        	t1=t1.next;
//        	t2=t2.next.next;
//        }
//        if(pre!=null)
//        	pre.next=null;
//        return t1;
//    }
//}
//public class lc109 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		ListNode digits=new ListNode(-3);
//		ListNode t1=new ListNode(0);
//		ListNode t2=new ListNode(5);
//		ListNode t3=new ListNode(10);
//		digits.next=t1;t1.next=t2;t2.next=t3;
//		Object a=test.sortedListToBST(digits);
//		System.out.println("Hello World");
//
//	}
//}
