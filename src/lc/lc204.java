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
////�����
//class Solution {
//    public int countPrimes(int n) {
//        Boolean [] prime=new Boolean[n];
//        Arrays.fill(prime,true);
//        int ans=0;
//        for(int i=2;i<n;i++){
//            if(prime[i]==true){
//                ans++;
//                for(int j=i;j*i<n;j++){
//                    prime[i*j]=false;
//                }
//            }
//        }
//        return ans;
//    }
//}
////ans:
//class Solution {
//    public int countPrimes(int n) {
//        int count = 0;
//    boolean[] notPrime = new boolean[n];
//    
//    //mark off notPrimes, only need to try possible factors 2...sqrt(n)
//    for(int i = 2; i <= (int)Math.sqrt(n); i++) {
//        for (int j = i*i; j < n; j+=i) 
//        	notPrime[j]=true;
//    }
//    
//    //now count primes
//    for(int i = 2; i < n; i++) {
//        if(notPrime[i]==false) 
//        	count++;
//    }
//    
//    return count;
//    }
//}
//public class lc {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
