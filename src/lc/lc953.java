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
//    public boolean isAlienSorted(String[] words, String order) {
//    	if(words.length==0)
//    		return true;
//        Map<Character,Integer> map=new HashMap<>();
//        for(int i=0;i<order.length();i++){
//            map.put(order.charAt(i),i);
//        }
//        int cur=map.get(words[0].charAt(0));
//        for(int i=1;i<words.length;i++){
//            int temp=map.get(words[i].charAt(0));
//            if(cur>temp)
//            	return false;
//            else if(cur==temp) {
//            	int m=words[i-1].length();
//            	int n=words[i].length();int j=1;
//            	while(j<m&&j<n) {
//            		if(map.get(words[i-1].charAt(j)) >map.get(words[i].charAt(j)))
//            			return false;
//            		j++;
//            	}
//            	if(m>n)
//            		return false;
//            }
//            cur=temp;
//        }
//        return true;
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
