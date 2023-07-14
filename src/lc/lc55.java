// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.List;

// import com.sun.javafx.image.IntPixelAccessor;

// // Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
// }

// //Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }

// // time over--- bad
// class Solution {
//   public boolean canJumpFromPosition(int position, int[] nums) {
//       if (position == nums.length - 1) {
//           return true;
//       }

//       int furthestJump = Math.min(position + nums[position], nums.length - 1);
//       for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
//           if (canJumpFromPosition(nextPosition, nums)) {
//               return true;
//           }
//       }

//       return false;
//   }

//   public boolean canJump(int[] nums) {
//       return canJumpFromPosition(0, nums);
//   }
// }


// //memoization
// enum Index {
//   GOOD, BAD, UNKNOWN
// }

// class Solution {
//   Index[] memo;

//   public boolean canJumpFromPosition(int position, int[] nums) {
//       if (memo[position] != Index.UNKNOWN) {
//           return memo[position] == Index.GOOD ? true : false;
//       }

//       int furthestJump = Math.min(position + nums[position], nums.length - 1);
//       for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
//           if (canJumpFromPosition(nextPosition, nums)) {
//               memo[position] = Index.GOOD;
//               return true;
//           }
//       }

//       memo[position] = Index.BAD;
//       return false;
//   }

//   public boolean canJump(int[] nums) {
//       memo = new Index[nums.length];
//       for (int i = 0; i < memo.length; i++) {
//           memo[i] = Index.UNKNOWN;
//       }
//       memo[memo.length - 1] = Index.GOOD;
//       return canJumpFromPosition(0, nums);
//   }
// }


// public class lc55 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		int a=test.longestUnivaluePath(root);
// 		System.out.println("Hello World");

// 	}
// }
