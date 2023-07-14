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
//    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
//        if (node == null) {
//            return node;
//        }
//
//        // use bfs algorithm to traverse the graph and get all nodes.
//        ArrayList<UndirectedGraphNode> nodes = getNodes(node);
//
//        // copy nodes, store the old->new mapping information in a hash map
//        HashMap<UndirectedGraphNode, UndirectedGraphNode> mapping = new HashMap<>();
//        for (UndirectedGraphNode n : nodes) {
//            mapping.put(n, new UndirectedGraphNode(n.label));
//        }
//
//        // copy neighbors(edges)
//        for (UndirectedGraphNode n : nodes) {
//            UndirectedGraphNode newNode = mapping.get(n);
//            for (UndirectedGraphNode neighbor : n.neighbors) {
//                UndirectedGraphNode newNeighbor = mapping.get(neighbor);
//                newNode.neighbors.add(newNeighbor);
//            }
//        }
//
//        return mapping.get(node);
//    }
//
//    private ArrayList<UndirectedGraphNode> getNodes(UndirectedGraphNode node) {
//        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
//        HashSet<UndirectedGraphNode> set = new HashSet<>();
//
//        queue.offer(node);
//        set.add(node);
//        while (!queue.isEmpty()) {
//            UndirectedGraphNode head = queue.poll();
//            for (UndirectedGraphNode neighbor : head.neighbors) {
//                if (!set.contains(neighbor)) {
//                    set.add(neighbor);
//                    queue.offer(neighbor);
//                }
//            }
//        }
//
//        return new ArrayList<UndirectedGraphNode>(set);
//    }
//}
//public class l615 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [][] p= {{1,0}};
//		Object a=test.canFinish(2,p );
//		System.out.println("Hello World");
//
//	}
//}
