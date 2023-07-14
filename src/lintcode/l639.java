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
////my
//class Solution {
//    public String[] wordsAbbreviation(String[] dict) {
//        // write your code here
//        if (dict == null) {
//            return null;
//        }
//
//        String[] ans = new String[dict.length];
//        Map<String, Integer> count = new HashMap<>();
//        int round = 1;
//
//        for (int i = 0; i < dict.length; i++) {
//            ans[i] = getAbbr(dict[i], round);
//            count.put(ans[i], count.getOrDefault(ans[i], 0) + 1); 
//        }
//
//        while (true) {
//            boolean unique = true;
//            round++;
//            for (int i = 0; i < dict.length; i++) {
//                if (count.get(ans[i]) > 1) {
//                    ans[i] = getAbbr(dict[i], round);
//                    count.put(ans[i], count.getOrDefault(ans[i], 0) + 1);
//                    unique = false;
//                }
//            }
//            if (unique) {
//                break;
//            }
//        }
//        return ans;
//    }
//
//    String getAbbr(String s, int p) { 
//        if (p + 2 >= s.length()) {
//            return s;
//        }
//        String ans;
//        ans = s.substring(0, p) + (s.length() - 1 - p) + s.charAt(s.length() - 1);
//        return ans;
//    }
//}
//public class l639 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		String [] t= {"internal","internet","interval"};
//		Object a=test.wordsAbbreviation(t);
//		System.out.println("Hello World");
//
//	}
//}
