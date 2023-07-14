//package lc;
//
//import com.sun.org.glassfish.gmbal.ParameterNames;
//
//import javafx.scene.Parent;
//import sun.reflect.generics.tree.Tree;
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
//class Solution {
//	private Map<TreeNode, TreeNode> m=new HashMap<>();
//    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
//        parent(root);
//        Set<TreeNode> visited=new HashSet<>();
//        List<Integer> ans=new ArrayList<>();
//        help(target,K,visited,ans);
//        return ans;
//    }
//    public void parent(TreeNode root) {
//    	if(root==null)
//    		return;
//    	if(root.left!=null) 
//    		m.put(root.left, root);
//    	if(root.right!=null) 
//    		m.put(root.right, root);
//    	parent(root.left);
//    	parent(root.right);
//    }
//    public void help(TreeNode target, int K,Set<TreeNode> visited,List<Integer> ans) {
//    	if(target==null)
//    		return;
//    	if(visited.contains(target))
//    		return;
//    	visited.add(target);
//    	if(K==0) {
//    		ans.add(target.val);
//    		return;
//    	}
//    	help(target.left, K-1, visited, ans);
//    	help(target.right, K-1, visited, ans);
//    	if(m.containsKey(target))
//    		help(m.get(target), K-1, visited, ans);
//    }
//}
//public class lc863 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
