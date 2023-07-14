// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
// }


// class Solution {
//   public boolean isRobotBounded(String instructions) {
//   int[] cur = {0,0};
//   int dir = 0;
//   int[][] steps = {{0,1}, {1,0}, {0,-1}, {-1,0}};
//   for(int i = 0; i < instructions.length(); ++i) {
//       char ch = instructions.charAt(i);
//       if(ch == 'G') {
//           cur = new int[]{cur[0] + steps[dir][0], cur[1] + steps[dir][1]};
//       }
//       else if(ch == 'R') {
//           dir = (dir+1)%4;
//       }
//       else { // L
//           dir = (dir-1+4)%4;
//       }
//   }
//   return (cur[0] == 0 && cur[1] == 0) || dir != 0;
// }
// }



// public class lc1041 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }
