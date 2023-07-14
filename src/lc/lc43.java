// package lc;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// // Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }

// class Solution {
// 	public String multiply(String num1, String num2) {
//     int m = num1.length(), n = num2.length();
// 		int k = m + n - 2;
// 		int add[] = new int[n + m];
// 		for (int i = 0; i < m; i++) {
// 			for (int j = 0; j < n; j++) {
// 				add[k - i - j] += (num1.charAt(i)-'0') * (num2.charAt(j) - '0');
// 			}
// 		}
	
// 		int carry = 0;
// 		int i;
// 		for (i = 0; i < m + n; i++) {
// 			add[i] += carry;
// 			carry = add[i] / 10;
// 			add[i] = add[i] % 10;
// 		}
// 		i=i-1;
// 		while (add[i] == 0 && i>0)
// 			i--;
// 		String ans = "";
// 		if (i < 0)
// 			return "0";
// 		while (i >= 0) {
// 			ans=ans+(add[i--]);
// 		}
// 		return ans;
//    }
// }


// public class lc43 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.multiply("2","3");
// 		System.out.println("Hello World");

// 	}
// }