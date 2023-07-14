//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
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
//	public int minimumTotal(List<List<Integer>> triangle) {
//        int n = triangle.size();
//        List<Integer> dp=new ArrayList<Integer>(triangle.get(triangle.size()-1));
//        for (int i = n - 2; i >= 0; --i) {
//            for (int j = 0; j <= i; ++j) {
//                dp.set(j, Math.min(dp.get(j), dp.get(j+1)) + triangle.get(i).get(j));
//            }
//        }
//        return dp.get(0);
//    }
//}
//
//
//public class lc120 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}