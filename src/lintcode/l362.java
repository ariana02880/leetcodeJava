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
//    * @param nums: A list of integers.
//    * @param k: An integer
//    * @return: The maximum number inside the window at each moving.
//    */
//   public List<Integer> maxSlidingWindow(int[] nums, int k) {
//       // write your code here
//       List<Integer> ans = new ArrayList<>();
//       Deque<Integer> dq = new ArrayDeque<>();
//       if (nums.length == 0) {
//           return ans;
//       }
//       for(int i=0;i<k-1;i++){
//           inQueue(dq,nums[i]);
//       }
//       for(int i=k-1 ; i<nums.length;i++){
//           inQueue(dq,nums[i]);
//           ans.add(dq.peekFirst());
//           outQueue(dq,nums[i-k+1]);
//       }
//       return ans;
//   }
//   public void inQueue(Deque<Integer> dq, int num){
//       while(!dq.isEmpty() && dq.peekLast() < num){
//           dq.pollLast();
//       }
//       dq.offer(num);
//   }
//   public void outQueue(Deque<Integer> dq, int num){
//       if(!dq.isEmpty() && dq.peekFirst() == num){
//           dq.pollFirst();
//       }
//   }
// }



// public class l362 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		String [] t= {"internal","internet","interval"};
// 		Object a=test.wordsAbbreviation(t);
// 		System.out.println("Hello World");

// 	}
// }
