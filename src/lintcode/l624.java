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
//    public int minLength(String s, Set<String> dict) {
//        Queue<String> queue = new LinkedList<>();
//        Set<String> calcSet = new HashSet<>();
//        int res = s.length();
//        calcSet.add(s);
//        queue.offer(s);
//        while (!queue.isEmpty()) {
//            String str = queue.poll();
//            res = Math.min(res, str.length());
//            StringBuilder sb = new StringBuilder(str);
//            for (String word : dict) {
//                int i = -1;
//                while ((i = sb.indexOf(word, i + 1)) != -1) {
//                    sb.delete(i, i + word.length());
//                    if (!calcSet.contains(sb.toString())) {
//                        queue.offer(sb.toString());
//                        calcSet.add(sb.toString());
//                    }
//                    sb.insert(i, word);
//                }
//            }
//        }
//        return res;
//    }
//}
//
//public class l624 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		String s="ccdaabcdbb";
//		HashSet<String>set=new HashSet<>();
//		set.add("ab");
//		set.add("cd");
//		Object a=test.minLength(s, set);
//		System.out.println("Hello World");
//
//	}
//}
