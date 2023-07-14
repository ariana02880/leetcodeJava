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
////
//////my dfs
////class Solution {
////	public HashMap<String,Boolean> done;
////    public boolean wordBreak(String s, Set<String> dict) {
////        // write your code here
////    	done=new HashMap<>();
////    	done.put("", true);
////    	return help(s, dict,done);
////        
////    }
////    public boolean help(String s, Set<String> dict,HashMap<String,Boolean> done) {
////    	if(done.containsKey(s)){
////            return true;
////        }
////        if (dict == null || dict.isEmpty()) {
////            return false;
////        }
////        for(int len=1;len<=s.length();len++){
////            String s1=s.substring(0,len);
////            String s2= s.substring(len,s.length());
////            if(dict.contains(s1)){
////                if(wordBreak(s2,dict)){
////                    return true;
////                }
////            }
////        }
////        return false;
////    }
////
////}
//
////ans
//class Solution {
//    private int getMaxLength(Set<String> dict) {
//        int maxLength = 0;
//        for (String word : dict) {
//            maxLength = Math.max(maxLength, word.length());
//        }
//        return maxLength;
//    }
//
//    public boolean wordBreak(String s, Set<String> dict) {
//        if (s == null || s.length() == 0) {
//            return true;
//        }
//
//        int maxLength = getMaxLength(dict);
//        boolean[] canSegment = new boolean[s.length() + 1];
//
//        canSegment[0] = true;
//        for (int i = 1; i <= s.length(); i++) {
//            canSegment[i] = false;
//            for (int lastWordLength = 1;
//                     lastWordLength <= maxLength && lastWordLength <= i;
//                     lastWordLength++) {
//                if (!canSegment[i - lastWordLength]) {
//                    continue;
//                }
//                String word = s.substring(i - lastWordLength, i);
//                if (dict.contains(word)) {
//                    canSegment[i] = true;
//                    break;
//                }
//            }
//        }
//
//        return canSegment[s.length()];
//    }
//}
//public class l107 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
////		String s="lintcode";
////		HashSet<String> ss= new HashSet<>();
////		ss.add("de");
////		ss.add("ding");
////		ss.add("co");ss.add("code"); ss.add("lint");
//		
//		
//		String s="a";
//		HashSet<String> ss= new HashSet<>();
//		ss.add("a");
//		Object a=test.wordBreak(s, ss);
//		System.out.println("Hello World");
//
//	}
//}
