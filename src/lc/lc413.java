//import java.util.ArrayList;
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
//	public int numberOfArithmeticSlices(int[] A) { 
//        int cnt=2;
//        int ans=0;
//        for(int i=2;i<A.length;i++){
//            if(A[i]-A[i-1]==A[i-1]-A[i-2])
//                cnt++;
//            else{
//                if(cnt>2)
//                    ans+=(cnt-2)*(cnt-1)*0.5;
//                cnt=2;
//            }
//        }
//        if(cnt>2)
//            ans+=(cnt-2)*(cnt-1)*0.5;
//        return ans;
//    }
//}
//
//
//public class lc413 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}