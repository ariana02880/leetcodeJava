// package lintcode;
// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
// }





// //ans
// class Solution {
//    /**
//     * @param s: A string 
//     * @param p: A string includes "?" and "*"
//     * @return: is Match?
//     */
//    public boolean isMatch(String s, String p) {
//        if (s == null || p == null) {
//            return false;
//        }
       
//        boolean[][] memo = new boolean[s.length()][p.length()];
//        boolean[][] visited = new boolean[s.length()][p.length()];
//        return isMatchHelper(s, 0, p, 0, memo, visited);
//    }
   
//    private boolean isMatchHelper(String s, int sIndex,
//                                  String p, int pIndex,
//                                  boolean[][] memo,
//                                  boolean[][] visited) {
//        // ��� p ��pIdex��ʼ�ǿ��ַ����ˣ���ô s Ҳ����� sIndex �ǿղ���ƥ����
//        if (pIndex == p.length()) {
//            return sIndex == s.length();
//        }
       
//        // ��� s �� sIndex �ǿգ���ôp ����ȫ�� * 
//        if (sIndex == s.length()) {
//            return allStar(p, pIndex);
//        }
       
//        if (visited[sIndex][pIndex]) {
//            return memo[sIndex][pIndex];
//        }
       
//        char sChar = s.charAt(sIndex);
//        char pChar = p.charAt(pIndex);
//        boolean match;
       
//        if (pChar == '*') {
//            match = isMatchHelper(s, sIndex, p, pIndex + 1, memo, visited) ||
//                isMatchHelper(s, sIndex + 1, p, pIndex, memo, visited);
//        } else {
//            match = charMatch(sChar, pChar) &&
//                isMatchHelper(s, sIndex + 1, p, pIndex + 1, memo, visited);
//        }
       
//        visited[sIndex][pIndex] = true;
//        memo[sIndex][pIndex] = match;
//        return match;
//    }
   
//    private boolean charMatch(char sChar, char pChar) {
//        return (sChar == pChar || pChar == '?');
//    }
   
//    private boolean allStar(String p, int pIndex) {
//        for (int i = pIndex; i < p.length(); i++) {
//            if (p.charAt(i) != '*') {
//                return false;
//            }
//        }
//        return true;
//    }
// }


// public class l192 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int[] cand= {1,4,2,7,4,6,2};
		
// 		//Object a=test.combinationSum(cand, 7);
// 		System.out.println("Hello World");

// 	}
// }
