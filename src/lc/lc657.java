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
//	public boolean judgeCircle(String moves) {
//        int cnt1 = 0, cnt2 = 0;
//        for (char move : moves.toCharArray()) {
//            if (move == 'U') ++cnt1;
//            else if (move == 'D') --cnt1;
//            else if (move == 'L') ++cnt2;
//            else if (move == 'R') --cnt2;
//        }
//        return cnt1 == 0 && cnt2 == 0;
//    }
//}
//
//
//public class lc657 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}