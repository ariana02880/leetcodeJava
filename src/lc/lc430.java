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
//
//class Node {
// public int val;
// public Node prev;
// public Node next;
// public Node child;
//
// public Node() {}
//
// public Node(int _val,Node _prev,Node _next,Node _child) {
//     val = _val;
//     prev = _prev;
//     next = _next;
//     child = _child;
// }
//};
////my correct
////deep copy:
//class Solution {
//	 private Node ans=new Node();
//	 Node t1=ans;
//	 public Node flatten(Node head) {
//		 if(head == null) return head;
//	     help(head);
//	     ans.next.prev=null;
//	     return ans.next;
//	 }
//	 public void help(Node head){
//	     if(head==null)
//	         return;
//	     Node nn=new Node(head.val,t1,null,null);
//	     t1.next=nn;
//	     t1=t1.next;
//	     if(head.child!=null){
//	    	 Node tt=head.child;
//	    	 head.child=null;
//	         help(tt);
//	     }
//	     help(head.next);
//	 }
//}
//////shallow copy: my:100%
////class Solution {
////    public Node flatten(Node head) {
////        Node cur=head;
////        while(cur!=null) {
////        	if(cur.child!=null) {
////        		Node nn=cur.next;
////        		cur.next=flatten(cur.child);
////        		cur.child=null;
////        		cur.next.prev=cur;
////        		while(cur.next!=null)
////        			cur=cur.next;
////        		cur.next=nn;
////        		if(nn!=null)
////        			nn.prev=cur;
////        	}
////        	cur=cur.next;
////        }
////        return head;
////    }
////}
//public class lc430 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Node t1=new Node(1,null,null,null);
//		Node t2=new Node(2,null,null,null);
//		Node t3=new Node(3,null,null,null);
//		Node t20=new Node(20,null,null,null);
//		Node t5=new Node(5,null,null,null);
//		t1.next=t2;t2.next=t3;t20.next=t5;
//		t2.child=t20;
//		Object a=test.flatten(t1);
//		System.out.println("Hello World");
//
//	}
//}
