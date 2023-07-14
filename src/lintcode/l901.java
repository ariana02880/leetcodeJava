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
//    public List<Integer> closestKValues(TreeNode root, double target, int k) {
//        List<Integer> values = new ArrayList<>();
//        
//        if (k == 0 || root == null) {
//            return values;
//        }
//        
//        Stack<TreeNode> lowerStack = getStack(root, target);
//        Stack<TreeNode> upperStack = new Stack<>();
//        upperStack.addAll(lowerStack);
//        if (target < lowerStack.peek().val) {
//            moveLower(lowerStack);
//        } else {
//            moveUpper(upperStack);
//        }
//        
//        for (int i = 0; i < k; i++) {
//            if (lowerStack.isEmpty() ||
//                   !upperStack.isEmpty() && target - lowerStack.peek().val > upperStack.peek().val - target) {
//                values.add(upperStack.peek().val);
//                moveUpper(upperStack);
//            } else {
//                values.add(lowerStack.peek().val);
//                moveLower(lowerStack);
//            }
//        }
//
//        return values;
//    }
//    
//    private Stack<TreeNode> getStack(TreeNode root, double target) {
//        Stack<TreeNode> stack = new Stack<>();
//        
//        while (root != null) {
//            stack.push(root);
//            
//            if (target < root.val) {
//                root = root.left;
//            } else {
//                root = root.right;
//            }
//        }
//        
//        return stack;
//    }
//    
//    public void moveUpper(Stack<TreeNode> stack) {
//        TreeNode node = stack.peek();
//        if (node.right == null) {
//            node = stack.pop();
//            while (!stack.isEmpty() && stack.peek().right == node) {
//                node = stack.pop();
//            }
//            return;
//        }
//        
//        node = node.right;
//        while (node != null) {
//            stack.push(node);
//            node = node.left;
//        }
//    }
//    
//    public void moveLower(Stack<TreeNode> stack) {
//        TreeNode node = stack.peek();
//        if (node.left == null) {
//            node = stack.pop();
//            while (!stack.isEmpty() && stack.peek().left == node) {
//                node = stack.pop();
//            }
//            return;
//        }
//        
//        node = node.left;
//        while (node != null) {
//            stack.push(node);
//            node = node.right;
//        }
//    }
//}
//
//
//public class l901 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//
////		Object a=test.closestKValues(root, target, k)(4);
//		System.out.println("Hello World");
//
//	}
//}
