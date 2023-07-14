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
//class ValidWordAbbr {
//    /*
//    * @param dictionary: a list of words
//    
//    */
//    public HashSet<String> ans=new HashSet<>();
//    public ValidWordAbbr(String[] dictionary) {
//        // do intialization if necessary
//        for(String aa:dictionary){
//            if(aa.length()<=2)
//                ans.add(aa);
//            else{
//                int cnt=aa.length()-2;
//                ans.add(new String(""+aa.charAt(0)+cnt+aa.charAt(aa.length()-1)));
//            }
//            
//        }
//    }
//    public boolean isUnique(String word) {
//        // write your code here
//        if(word.length()<=2)
//            return !ans.contains(word);
//        else{
//            int cnt=word.length()-2;
//            String target=""+word.charAt(0)+cnt+word.charAt(word.length()-1);
//            return !ans.contains(target);
//        }
//    }
//}
//
///**
// * Your ValidWordAbbr object will be instantiated and called as such:
// * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
// * boolean param = obj.isUnique(word);
// */
//
//public class l180 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [] t= {0,1,3,5,75};
//		Object a=test.binaryRepresentation("0.5");
//		System.out.println("Hello World");
//
//	}
//}
