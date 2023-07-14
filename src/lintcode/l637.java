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
////ans:
//class Solution {
//    public boolean validWordAbbreviation(String word, String abbr) {
//        // write your code here
//        int t1=0,t2=0;
//        while(t1<word.length()&& t2<abbr.length() ){
//            if(word.charAt(t1)==abbr.charAt(t2)){
//                t1++;t2++;
//            }
//            else if(abbr.charAt(t2)>'0'&&abbr.charAt(t2)<='9'){
//                int start=t2;
//                while(t2<abbr.length()&& Character.isDigit(abbr.charAt(t2))){
//                    t2++;
//                }
//                t1+=Integer.valueOf(abbr.substring(start,t2));
//            }
//            else
//            return false;
//        }
//        return t1==word.length() &&t2==abbr.length();
//    }
//}
//public class l637 {
//	public static void main(String arg[]) {
//		Solution s1=new Solution();
////		"internationalization"
////		"i12iz4n"
//		Object ans=s1.validWordAbbreviation("a", "01");
//		System.out.println("Hello World");
//	}
//	
//}
