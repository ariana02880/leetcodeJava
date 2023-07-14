//import java.util.HashMap;
//
//import com.sun.javafx.image.IntPixelAccessor;
//
// // Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
//}
//
// //Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
//
//
//
//
//class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        if(root==null)
//        	return null;
//        TreeNode temp=root.left;
//        root.left=invertTree(root.right);
//        root.right=invertTree(temp);
//        return root;
//    }
//}
//
//
//
//public class lc226 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		int a=test.longestUnivaluePath(root);
//		System.out.println("Hello World");
//
//	}
//}
