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
//	 //my
//	public ListNode findMid(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null&& fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//    public ListNode reverse(ListNode head) {//一定会返回一个新的头节点
//        ListNode newnew = null;
//        while (head != null) {
//            ListNode tt = head.next;
//            head.next = newnew;
//            newnew = head;
//            head = tt;
//        }
//        return newnew;
//    }
//    public void reorderList(ListNode head) {
//        if (head==null)
//            return;
//        ListNode mid = findMid(head);
//        ListNode t2 = mid.next;
//        t2 = reverse(t2);
//        mid.next = null;
//
//        ListNode t1 = head;
//        while (t1 != null&& t2 != null) {
//            ListNode nn = t1.next;
//            t1.next = t2;
//            t2 = t2.next;
//            t1.next.next = nn;
//            t1 = nn;
//        }
//    }
//}
//
//
//public class lc143 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}