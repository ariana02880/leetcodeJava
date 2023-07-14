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
//////my
////class Solution {
////    public List<Integer> findAnagrams(String s, String p) {
////        // write your code here
////        if(s==null||s.length()==0){
////            return new ArrayList<>();
////        }
////        int[] cnts=new int[26];
////        int[] cntp=new int[26];
////        int size=p.length();
////        for(char aa:p.toCharArray()){
////            cntp[aa-'a']++;
////        }
////        for(int i=0;i<size;i++){
////            cnts[s.charAt(i)-'a']++;
////        }
////        
////        ArrayList<Integer> ans=new ArrayList<>();
////        if(isEqual(cnts,cntp))
////            ans.add(0);
////        int l=0,r=size;
////        while(r<s.length()){
////            cnts[s.charAt(l)-'a']--;
////            cnts[s.charAt(r)-'a']++;
////            if(isEqual(cnts,cntp))
////                ans.add(l+1);
////            l++;r++;
////        }
////        return ans;
////        
////    }
////    public boolean isEqual(int[]a, int[] b){
////        for(int i=0;i<26;i++){
////            if(a[i]-b[i]!=0)
////            return false;
////        }
////        return true;
////    }
////}
//
////way 2:
//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        // write your code here
//        if(s==null||s.length()==0||s.length()<p.length()){
//            return new ArrayList<>();
//        }
//        int[] det=new int[26];
//        ArrayList<Integer> ans=new ArrayList<>();
//        
//        for(int i=0;i<p.length();i++){
//            det[p.charAt(i)-'a']--;
//            det[s.charAt(i)-'a']++;
//        }
//        int sum=0;
//        for(int aa:det){
//            sum+=Math.abs(aa);
//        }
//        if(sum==0)
//            ans.add(0);
//        
//        for(int i=p.length();i<s.length();i++){
//            int l=i-p.length();
//            int r=i;
//            sum = sum - Math.abs(det[s.charAt(r)-'a']) - Math.abs(det[s.charAt(l)-'a']);
//            //new
//            det[s.charAt(r)-'a']++;
//            det[s.charAt(l)-'a']--;
//            sum = sum + Math.abs(det[s.charAt(r)-'a']) + Math.abs(det[s.charAt(l)-'a']);
//            if (sum == 0) {
//                ans.add(l + 1);
//            }
//        }
//        return ans;
//    }
//        
//}
//public class l647 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [] t= {0,1,3,5,75};
//		Object a=test.findAnagrams("abcabc","ac");
//		System.out.println("Hello World");
//
//	}
//}