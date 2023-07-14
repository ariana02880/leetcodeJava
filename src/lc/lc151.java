//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
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
//	public String reverseWords(String s) {
//        if(s.length()==0)
//            return s;
//        String temp[]=s.trim().split("\\s+");
//        //分隔符设为"\\s+"，这其实是一个正则表达式，\\s表示空格字符，+表示可以有一个或多个空格字符
//        StringBuilder ans=new StringBuilder();
//        for(int i=temp.length-1;i>0;i--){
//            ans.append(temp[i]).append(' ');
//        }
//        return ans+temp[0];
//    }
//	//faster
//	public String reverseWords2(String s) {
//        String[] words = s.trim().split(" +");
//        Collections.reverse(Arrays.asList(words));
//        return String.join(" ", words);
//    }
//}
//
//
//public class lc151 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		String a=test.reverseWords2("the sky is blue");
//		System.out.println("Hello World");
//
//	}
//}