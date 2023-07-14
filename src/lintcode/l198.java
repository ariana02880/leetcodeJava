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
////ans
//class Solution {
//    /**
//     * @param A an integer array
//     * @return a long integer
//     */
//    long fac(int numerator) {
//        long now = 1;
//        for (int i = 1; i <= numerator; i++) {
//            now *= (long) i;
//        }
//        return now;
//    }   
//    long generateNum(HashMap<Integer, Integer> hash) {
//        long denominator = 1;
//        int sum = 0;
//        for (int val : hash.values()) {
//            if(val == 0 )    
//                continue;       
//            denominator *= fac(val);
//            sum += val; 
//        }       
//        if(sum==0) {
//            return sum; 
//        }       
//        return fac(sum) / denominator;
//    }   
//
//    public long permutationIndexII(int[] A) {
//        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
//
//        for (int i = 0; i < A.length; i++) {
//            if (hash.containsKey(A[i]))
//                hash.put(A[i], hash.get(A[i]) + 1);
//            else {      
//                hash.put(A[i], 1);
//            }           
//        }       
//        long ans = 0;
//        for (int i = 0; i < A.length; i++) {
//            HashMap<Integer, Integer> flag = new HashMap<Integer, Integer>(); 
//
//            for (int j = i + 1; j < A.length; j++) {
//                if (A[j] < A[i] && !flag.containsKey(A[j])) {
//                    flag.put(A[j], 1);
//                    hash.put(A[j], hash.get(A[j])-1);
//                    ans += generateNum(hash);
//                    hash.put(A[j], hash.get(A[j])+1);
//                }
//
//            }
//            hash.put(A[i], hash.get(A[i])-1);
//        }
//        return ans + 1;
//    }
//}
//
//public class l198 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [][] p= {{1,0}};
//		//int[]A= {1,6,5,3,1};
//		int[]A= {3,2,1};
//		Object a=test.permutationIndexII(A);
//		System.out.println("Hello World");
//
//	}
//}
