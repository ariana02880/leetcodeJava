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
//////ans:
////class Solution {
////    public boolean canReorderDoubled(int[] A) {
////        // count[x] = the number of occurrences of x in A
////        Map<Integer, Integer> count = new HashMap();
////        for (int x: A)
////            count.put(x, count.getOrDefault(x, 0) + 1);
////
////        // B = A as Integer[], sorted by absolute value
////        Integer[] B = new Integer[A.length];
////        for (int i = 0; i < A.length; ++i)
////            B[i] = A[i];
////        Arrays.sort(B, Comparator.comparingInt(Math::abs));
////
////        for (int x: B) {
////            // If this can't be consumed, skip
////            if (count.get(x) == 0) continue;
////            // If this doesn't have a doubled partner, the answer is false
////            if (count.getOrDefault(2*x, 0) <= 0) return false;
////
////            // Write x, 2*x
////            count.put(x, count.get(x) - 1);
////            count.put(2*x, count.get(2*x) - 1);
////        }
////
////        // If we have written everything, the answer is true
////        return true;
////    }
////}
//class Solution {
//    public boolean canReorderDoubled(int[] A) {
//        Map<Integer, Integer> map=new HashMap<>();
//        for(int aa:A)
//        	map.put(aa, map.getOrDefault(aa, 0)+1);
//        Integer []B=new Integer[A.length];
//        for(int i=0;i<A.length;i++){
//        	B[i]=A[i];
//        }
//        Arrays.sort(B, Comparator.comparingInt(Math::abs));
//        for(int x:B) {
//        	if(map.get(x)==0) continue;
//        	if(map.getOrDefault(2*x, 0)<=0)
//        		return false;
//        	map.put(x, map.get(x)-1);
//        	map.put(2*x, map.get(2*x)-1);
//        }
//        return true;
//    }
//}
//public class lc954{
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		int A[]= {-1,-2,2,4};
//		Object a=test.canReorderDoubled(A);
//		System.out.println("Hello World");
//
//	}
//}
