//package lc;
//
//import com.sun.accessibility.internal.resources.accessibility;
//
//import jdk.nashorn.internal.runtime.FindProperty;
//
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
//	Map<Character, Integer> Index=new HashMap<>();
//    Set<Character> small=new HashSet<>() ;
//    public String smallestEquivalentString(String A, String B, String S) {
//        for(int i=0;i<A.length();i++) {
//        	if(!Index.containsKey(A.charAt(i)) && !Index.containsKey(B.charAt(i)) ) {
//        		Character res= Math.min(A.charAt(i), B.charAt(i));
//        		Index.put(A.charAt(i),small.size());
//        		small.add(A.charAt(i));
//        	}
//        }
//    }
//    public boolean find(Character a) {
//    	return ;
//    }
//}
//public class lc {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
