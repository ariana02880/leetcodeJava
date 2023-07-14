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
//	public String toLowerCase(String str) {
//        char ans[]=str.toCharArray();
//        for (int i=0;i<ans.length;i++) {
//            if (ans[i] >= 'A' && ans[i] <= 'Z') 
//                ans[i] += 32;
//        }
//        return new String(ans);//ans.toString();
//    }
//	public boolean canConstruct(String ransomNote, String magazine) {
//        return (magazine.indexOf(ransomNote)==-1)? false: true;
//    }
//}
//
//
//public class lc709 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.toLowerCase("HHUJig");
//		System.out.println("Hello World");
//
//	}
//}