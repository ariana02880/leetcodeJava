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
//class Node {
//    public int val;
//    public List<Node> neighbors;
//
//    public Node() {}
//
//    public Node(int _val,List<Node> _neighbors) {
//        val = _val;
//        neighbors = _neighbors;
//    }
//};
//class Solution {
//    public Node cloneGraph(Node node) {
//        return help(node, new HashMap<>());
//    }
//    public Node help(Node n, Map<Integer, Node> m) {
//    	if(m.containsKey(n.val))
//    		return m.get(n.val);
//    	Node temp=new Node(n.val,new ArrayList<Node>());
//    	m.put(n.val, temp);
//    	for(Node aa:n.neighbors) {
//    		temp.neighbors.add( help(aa, m));
//    	}
//    	return temp;
//    }
//}
//public class lc133 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
