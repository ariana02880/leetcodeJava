//import java.util.HashMap;
//import java.util.HashSet;
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
//	//my
//	public int myAtoi2(String str) {
//		if(str.isEmpty())
//            return 0;
//        Boolean positive=true;
//        int base=0,n=str.length(),i=0;
//        while(i<n&& str.charAt(i)==' ')
//            i++;
//        if(i<n&& (str.charAt(i)=='+'|| str.charAt(i)=='-'))//********
//            positive=(str.charAt(i++)=='+')? positive:false;
//        while(i<n&& str.charAt(i)>='0'&& str.charAt(i)<='9'){
//            if(base>Integer.MAX_VALUE/10 || 
//               (base==Integer.MAX_VALUE/10 &&str.charAt(i)-'0'>7))
//                return (positive==true)? Integer.MAX_VALUE:Integer.MIN_VALUE;
//            base=10*base+(str.charAt(i++)-'0');
//        }
//        return (positive==true)? base:base*(-1);
//    }
//}
//
//
//public class lc8 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int a=test.myAtoi2("2147483646");
//		System.out.println("Hello World");
//
//	}
//}