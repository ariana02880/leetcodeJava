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
//////ans
////class Solution {
////    public int lengthOfLongestSubstring(String s) {
////        	int n = s.length(), ans = 0;
////			Map<Character, Integer> map = new HashMap<>(); // current index of character
////			// try to extend the range [i, j]
////			for (int j = 0, i = 0; j < n; j++) {
////			    if (map.containsKey(s.charAt(j))) {
////			        i = Math.max(map.get(s.charAt(j)), i);
////			    }
////			    ans = Math.max(ans, j - i + 1);
////			    map.put(s.charAt(j), j + 1);
////			}
////			return ans;
////    }
////}
//
////my
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//    	Map<Character, Integer> map=new HashMap<>();    	
//    	int ans=0;
//    	int left=0;
//        for(int i=0;i<s.length();i++) {
//        	Character aa=s.charAt(i);
//        	if(map.containsKey(aa)) {
//        		left=Math.max(left, map.get(aa));
//        	}
//        	ans=Math.max(ans, i-left+1);
//        	map.put(aa, i+1);
//        }
//        return ans;
//    }
//}
//public class lc3 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		String s=" a cc ";
//		Object a=test.lengthOfLongestSubstring(s);
//		System.out.println("Hello World");
//
//	}
//}
