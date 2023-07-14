//package lc;
//import java.lang.*;
//import java.sql.Array;
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
////    public String[] reorderLogFiles(String[] logs) {
////        Arrays.sort(logs, (log1, log2) -> {
////            String[] split1 = log1.split(" ", 2);
////            String[] split2 = log2.split(" ", 2);
////            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
////            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
////            if (!isDigit1 && !isDigit2) {
////                int cmp = split1[1].compareTo(split2[1]);
////                if (cmp != 0) 
////                	return cmp;
////                return split1[0].compareTo(split2[0]);
////            }
////            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
////        });
////        return logs;
////    }
////}
//
////my
//class Solution {
//    //my
//    public String[] logSort(String[] logs) {
//        // Write your code here
//    		Arrays.sort(logs,(log1,log2)->{
//            String l1[]=log1.split(" ",2);
//            String l2[]=log2.split(" ",2);
//            boolean d1=Character.isDigit(l1[1].charAt(0));
//            boolean d2=Character.isDigit(l2[1].charAt(0));
//            if(!d1 &&! d2){
//                int cmp=l1[1].compareTo(l2[1]);
//                if(cmp!=0)
//                    return cmp;
//                return l1[0].compareTo(l2[0]);
//            }
//            if(d1==false)
//            return -1;
//            else
//            return 1;
//        });
//        return logs;
//    }
//}
//public class lc937 {
//	public static  void main(String arg[]) {
//		String a1="a";
//		String a2="A".toLowerCase();
//		int cmp= a1.compareTo(a2);
//		
//		
//		Solution test=new Solution();
//		String[] digits= {"g1 Act car","a8 act zoo"};
//		Object a=test.logSort(digits);
//		System.out.println("Hello World");
//	}
//}
