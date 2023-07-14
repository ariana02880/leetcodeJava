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
//    * @param height: A list of integer
//    * @return: The area of largest rectangle in the histogram
//    */
//   public int largestRectangleArea(int[] heights) {
//       // write your code here
//       Stack<Integer> idx = new Stack<>();
//       idx.push(0);
//       int ans = 0;
//       int[] my = new int[heights.length +1];
//       for(int i=0;i<heights.length;i++){
//         my[i]=heights[i];
//       }
//       my[heights.length] = 0;

//       for(int i=0;i<my.length;i++){
//         while( !idx.empty() && my[i]<= my[idx.peek()]){
//           int cur = idx.peek();
//           idx.pop();
//           ans = Math.max( ans, my[cur] * (idx.empty()? i : (i-idx.peek()-1 )));
//         }
//         idx.push(i);
//       }
//       return ans;
//   }
// }



// public class l122 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
	
// 		Object a=test.largestRectangleArea(new int[]{2,1,5,6,2,3});
// 		System.out.println("Hello World");

// 	}
// }
