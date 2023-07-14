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
//	public String reverseWords(String s) {
//		String temp[]=s.trim().split(" ");
//        StringBuilder sb=new StringBuilder();
//        for(String aa:temp){
//            int n=aa.length()-1;
//            for(int i=0;i<aa.length();i++){
//                sb.append((char)aa.charAt(n-i));
//            }
//            sb.append(' ');
//        }
//        return sb.toString().trim();
//    }
//}
//
//
//public class lc557 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}