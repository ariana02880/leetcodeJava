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
//	public String intToRoman(int num) {
//		char roman[] = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
//		int value[] = { 1000, 500, 100, 50, 10, 5, 1 };
//		String ans = "";
//		for (int i = 0; i < 7; i = i + 2) {
//			int temp = num / value[i];
//			if (temp < 4) {
//				for (int j = 1; j <= temp; j++)
//					ans = ans + roman[i];
//			}
//			else if (temp == 4) {
//				ans = ans + roman[i] + roman[i - 1];
//			}
//			else if (temp > 4 && temp < 9) {
//				ans = ans + roman[i - 1];
//				for (int j = 1; j <= temp - 5; j++)
//					ans += roman[i];
//			}
//			else if (temp == 9) {
//				ans = ans + roman[i] + roman[i - 2];
//			}
//			num = num % value[i];
//		}
//		return ans;
//	}
//}
//
//
//public class lc12 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}