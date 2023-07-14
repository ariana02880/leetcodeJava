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
//
////my
//class Solution {
//    /**
//     * @param s: the string that represents a number
//     * @return: whether the string is a valid number
//     */
//    public boolean isNumber(String s) {
//        // write your code here
//        char []str=(s.trim()+" ").toCharArray();
//        int i=0;
//        int npoint=0;
//        int nnum=0;
//        int len= (s.trim()).length();
//        if(len==0)
//            return false;
//        while(i<len){
//            if(str[i]=='+'||str[i]=='+'){
//                i++;
//            }
//            while(str[i]=='.'|| Character.isDigit(str[i])){
//                if(str[i]=='.')
//                    npoint++;
//                if(Character.isDigit(str[i]))
//                    nnum++;
//                i++;
//            }
//            if(npoint>1)
//                return false;
//            if(nnum<=0)
//                return false;
//            if(str[i]=='e'){
//                while(i<len){
//                    if(str[i]=='+'||str[i]=='+'){
//                        i++;
//                    }
//                    if(!Character.isDigit(str[i]))
//                    return false;
//                }
//            }
//            
//        }
//        return i==len;
//    }
//}
//public class l417 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.isNumber("1      ");
//		System.out.println("Hello World");
//
//	}
//}
