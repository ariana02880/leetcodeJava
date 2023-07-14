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
///*
////Definition for a Node.
//class Node {
// public int val;
// public Node left;
// public Node right;
// public Node next;
//
// public Node() {}
//
// public Node(int _val,Node _left,Node _right,Node _next) {
//     val = _val;
//     left = _left;
//     right = _right;
//     next = _next;
// }
//};
//*/
//class Solution {
// public Node connect(Node root) {
//     Queue<Node> q=new LinkedList<>();
//     if(root==null)
//         return null;
//     q.add(root);
//     while(!q.isEmpty()){
//         int size=q.size();
//         for(int i=0;i<size;i++){
//             Node temp=q.remove();
//             Node n=null;
//             if(i<size-1)
//                 n=q.peek();
//             temp.next=n;
//             if(temp.left!=null) q.add(temp.left);
//             if(temp.right!=null) q.add(temp.right);
//         }
//     }
//     return root;
// }
//}
//
//public class lc {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
//
