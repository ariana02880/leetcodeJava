//package lc;
//import java.lang.*;
//import java.io.*;
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
//    public int romanToInt(String s) {
//        Map<Character, Integer> hashmap=new HashMap<>();
//        hashmap.put('I', 1);
//        hashmap.put('V', 5);
//        hashmap.put('X', 10);
//        hashmap.put('L', 50);
//        hashmap.put('C', 100);
//        hashmap.put('D', 500);
//        hashmap.put('M', 1000);
//        int ans=0;
//        for(int i=0;i<s.length();i++) {
//        	int cur=hashmap.get(s.charAt(i));
//        	if(i==s.length()-1|| hashmap.get(s.charAt(i+1))<=hashmap.get(s.charAt(i))) {
//        		ans+=cur;
//        	}
//        	else
//        		ans-=cur;
//        }
//        return ans;
//        
//
//    }
//}
//public class lc13 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
