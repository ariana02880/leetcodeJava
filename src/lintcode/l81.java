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

// public class Solution {
//   /**
//    * @param nums: A list of integers
//    * @return: the median of numbers
//    */
//   public int[] medianII(int[] nums) {
//       // write your code here
//       if(nums.length == 0) return nums;
//       PriorityQueue<Integer> maxQ = new PriorityQueue<>(nums.length, Collections.reverseOrder());
//       PriorityQueue<Integer> minQ = new PriorityQueue<>(nums.length);
//       int[] ans = new int[nums.length];
//       int index = 0;
//       for(int a: nums) {
//           if(minQ.isEmpty()){
//               minQ.add(a);
//               ans[index] = a;
//           }
//           else {
//               int top = minQ.peek();
//               if(a < top){
//                   maxQ.add(a);
                  
//               }
//               else {
//                   minQ.poll();
//                   maxQ.add(top);
//                   minQ.add(a);
//               }
//               balance(maxQ, minQ);
//               ans[index] = maxQ.peek();
//           }
//           index++;
//       }
//       return ans;
//   }
//   private void balance (PriorityQueue<Integer> maxQ, PriorityQueue<Integer> minQ) {
//       while(maxQ.size() > minQ.size()+1) {
//           int top = maxQ.peek();
//           maxQ.poll();
//           minQ.add(top);
//       }
//   }
// }



// public class l81 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		TreeNode a=test.deserialize("3 9 20 # # 15 # # 90 # #");
// 		String b=test.serialize(a);
// 		System.out.println("Hello World");

// 	}
// }
