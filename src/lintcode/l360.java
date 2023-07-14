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

// class Solution {
//   /**
//    * @param nums: A list of integers
//    * @param k: An integer
//    * @return: The median of the element inside the window at each moving
//    */
//   public List<Integer> medianSlidingWindow(int[] nums, int k) {
//       // write your code here
//       ArrayList<Integer> ans = new ArrayList<>();
//       PriorityQueue<Integer> maxQ = new PriorityQueue<>(nums.length, Collections.reverseOrder());
//       PriorityQueue<Integer> minQ = new PriorityQueue<>();
//       for(int i=0; i<nums.length; i++) {
//           if(i >= k) {
//               int remove = nums[i-k];
//               if(remove > maxQ.peek()){
//                   minQ.remove(remove);
//               }
//               else    
//                   maxQ.remove(remove);
//           }
//           maxQ.add(nums[i]);
//           minQ.add(maxQ.poll());
//           while(maxQ.size() < minQ.size()){
//               maxQ.add(minQ.poll());
//           }
//           if(i >= k-1 ){
//               ans.add(maxQ.peek());
//           }
//       }
//       return ans;
//   }
// }




// public class l360 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		TreeNode a=test.deserialize("3 9 20 # # 15 # # 90 # #");
// 		String b=test.serialize(a);
// 		System.out.println("Hello World");

// 	}
// }
