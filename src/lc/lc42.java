// package lc;


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

// class Solution {
//   public int trap(int[] height) {
//       int res = 0, mx = 0, n = height.length;
//       int[] l = new int[n];
//       int[] r = new int[n];
//       // left, the greatest data
//       for (int i = 0; i < n; ++i) {
//           l[i] = mx;
//           mx = Math.max(mx, height[i]);
//       }
//       mx = 0;
//       for (int i = n-1; i >= 0; i--) {
//           r[i] = mx;
//           mx = Math.max(mx, height[i]);
//       }
      
//       for( int i=0; i<n; i++) {
//           if( height[i] < Math.min(l[i], r[i]) ){
//               res += Math.min(l[i], r[i]) - height[i];
//           }
//       }
//       return res;
//   }
// }


// public class lc42 {
// public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int[] digits=new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
// 		int a=test.trap(digits);
// 		System.out.println("Hello World");

// 	}
// }
