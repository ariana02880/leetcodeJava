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
//////my
//class Solution {
//
//    public int addDigits(int num) {
//        // write your code here
//        ArrayList<Integer> nums;
//        while(num!=0){
//        	nums=new ArrayList<>();
//            while(num!=0){
//                nums.add(num%10);
//                num=num/10;
//            }
//            if(nums.size()==1)
//                return nums.get(0);
//            for(int i=0;i<nums.size();i++){
//                num+=nums.get(i);
//            }
//            
//        }
//        return 0;
//    }
//    
//}
//public class l569 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [] t= {0,1,3,5,75};
//		Object a=test.addDigits(38);
//		System.out.println("Hello World");
//
//	}
//}
