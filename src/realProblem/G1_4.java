////687
//
//
//import java.util.HashMap;
//
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
////my
//class Solution {
//	public int helper(TreeNode root, int val) {
//		if (root==null || root.val != val)
//			return 0;
//		return 1 + Math.max(helper(root.left, root.val), helper(root.right, root.val));
//	}
//	
//	public int longestUnivaluePath(TreeNode root) {
//		if (root==null)
//			return 0;
//		int ans = Math.max(longestUnivaluePath(root.left), longestUnivaluePath(root.right));
//		return Math.max(ans, helper(root.left, root.val) + helper(root.right, root.val));
//
//	}
//}
//
////class Solution {
////    /**
////     * Use a one element array to pass in and out is a common technique for handling tree questions.
////     */
////	public int dfs(TreeNode root, int[] result) {
////        int leftPath = root.left == null ? 0 : dfs(root.left, result);
////        int rightPath = root.right == null ? 0 : dfs(root.right, result);
////        int leftResult = (root.left != null && root.left.val == root.val) ? leftPath + 1 : 0;
////        int rightResult = (root.right != null && root.right.val == root.val) ? rightPath + 1 : 0;
////        result[0] = Math.max(result[0], leftResult + rightResult);
////        return Math.max(leftResult, rightResult);
////    }
////    public int longestUnivaluePath(TreeNode root) {
////        int[] result = new int[1];
////        if (root != null) {
////            dfs(root, result);
////        }
////        return result[0];
////}
//
//public class G1_4 {
//	public static void main(String arg[]) {
//		TreeNode root=new TreeNode(23);
//		
//		Solution test=new Solution();
//		int a=test.longestUnivaluePath(root);
//		System.out.println("Hello World");
//	}
//}
