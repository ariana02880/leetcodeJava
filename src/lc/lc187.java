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
////18%
////class Solution {
////    public List<String> findRepeatedDnaSequences(String s) {
////        Map<String,Integer> map=new HashMap<>();
////        List<String> ans=new ArrayList<>();
////        for(int i=0;i<=s.length()-10;i++){
////            String temp=s.substring(i,i+10);
////            map.put(temp,map.getOrDefault(temp,0)+1);
////        }
////        
////        for(String key:map.keySet()){
////            if(map.get(key)>=2)
////                ans.add(key);
////        }
////        return ans;
////    }
////}
//
////62%
//class Solution {
//    public List<String> findRepeatedDnaSequences(String s) {
//    	HashSet<String> seen = new HashSet<String>();
//        List<String> ans = new ArrayList<String>();
//        
//        for(int i = 0; i < s.length()-9; i++) {
//			// We only look at substring of tens, and iterate through string one by one
//			
//            String currSeq = s.substring(i, i+10);
//			
//			// If we have seen this substring before, add it if it already hasnt been
//			
//            if(seen.contains(currSeq) && !ans.contains(currSeq)) 
//            	ans.add(currSeq);
//            seen.add(currSeq);
//            
//            
//        }
//        
//        return ans;
//    }
//}
//
//
//public class lc {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
