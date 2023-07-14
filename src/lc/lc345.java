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
//class Solution {
//    public String reverseVowels(String s) {
//    	int i=0;int j=s.length()-1;
//    	if(s.length()==0)
//    		return "";
//    	char [] ans=s.toCharArray();
//    	while(i<j) {
//    		while(i<j && !isV(ans[i])) i++;
//    		while(i<j&& !isV(ans[j])) j--;
//    		if(i<j) {
//    			Character temp=s.charAt(i);
//        		ans[i++]=ans[j];
//        		ans[j--]=temp;
//    		}    		
//    	}
//    	return new String(ans);
//    }
//    public boolean isV(Character c){
//        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
//        		c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
//        	return true;
//        return false;
//    }
//}
//
//public class lc345 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.reverseVowels("hello");
//		System.out.println("Hello World");
//
//	}
//}
