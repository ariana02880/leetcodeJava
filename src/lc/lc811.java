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
//////my 42%
////class Solution {
////    public List<String> subdomainVisits(String[] cpdomains) {
////        Map<String,Integer> map=new HashMap<>();
////        List<String> ans=new ArrayList<>();
////        for(String ss:cpdomains){
////            String[] s1=ss.split(" ",2);
////            int num=Integer.valueOf(s1[0]);
////            String[] s2=s1[1].split("\\.");
////            for(int i=0;i<s2.length;i++){
////                String newS="";
////                for(int j=i;j<s2.length;j++){
////                    if(j==s2.length-1)
////                        newS+=s2[j];
////                    else
////                        newS+=s2[j]+".";
////                }
////                map.put(newS,map.getOrDefault(newS,0)+num);
////            }
////        }
////        
////        for(String key:map.keySet()){
////            String temp=map.get(key)+" "+key;
////            ans.add(temp);
////        }
////        return ans;
////    }
////}
//
//
//public class lc811 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		String[] cpdomains= {"9001 discuss.leetcode.com"};
//		Object a=test.kth_amazing_number(10);
//		System.out.println("Hello World");
//
//	}
//}
