// package lintcode;
// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
// }





// //ans
// class Solution {
//    /**
//     * @param n an integer
//     * @return the nth prime number as description.
//     */
//    public int nthUglyNumber(int n) {
//        // Write your code here
//        Queue<Long> Q = new PriorityQueue<Long>();
//        HashSet<Long> inQ = new HashSet<Long>();
//        Long[] primes = new Long[3];
//        primes[0] = Long.valueOf(2);
//        primes[1] = Long.valueOf(3);
//        primes[2] = Long.valueOf(5);
//        for (int i = 0; i < 3; i++) {
//            Q.add(primes[i]);
//            inQ.add(primes[i]);
//        }
//        Long number = Long.valueOf(1);
//        for (int i = 1; i < n; i++) {
//            number = Q.poll();
//            for (int j = 0; j < 3; j++) {
//                if (!inQ.contains(primes[j] * number)) {
//                    Q.add(number * primes[j]);
//                    inQ.add(number * primes[j]);
//                }
//            }
//        }
//        return number.intValue();
//    }
// };


// public class l4 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		

// 		Object a=test.nthUglyNumber(5);
// 		System.out.println("Hello World");

// 	}
// }
