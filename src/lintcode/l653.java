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
//	void dfs(String num, int target, int start, String str, long sum, long lastF, List<String> ans) {
//        if (start == num.length()) {
//            if (sum == target) {
//                ans.add(str);
//            }
//            return;
//        }
//        for (int i = start; i < num.length(); i++) {
//            long x = Long.parseLong(num.substring(start, i + 1));
//
//            if (start == 0) {
//                dfs(num, target, i + 1, "" + x, x, x, ans);
//            } else {
//                dfs(num, target, i + 1, str + "*" + x, sum - lastF + lastF * x, lastF * x, ans);
//                dfs(num, target, i + 1, str + "+" + x, sum + x, x, ans);
//                dfs(num, target, i + 1, str + "-" + x, sum - x, -x, ans);
//            }
//            if (x == 0) {
//                break;
//            }
//        }
//    }
//
//    public List<String> addOperators(String num, int target) {
//        // Write your code here
//        List<String> ans = new ArrayList<>();
//        dfs(num, target, 0, "", 0, 0, ans);
//        return ans;
//    }
//}
//public class l653 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//
//		Object a=test.addOperators("003", 3);
//		System.out.println("Hello World");
//
//	}
//}
