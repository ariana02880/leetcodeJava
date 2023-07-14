// package lc;
// import java.lang.*;
// import java.io.*;

// class Solution {
//   public ListNode plusOne(ListNode head) {
//       // sentinel head
//       ListNode sentinel = new ListNode(0);
//       sentinel.next = head;
//       ListNode notNine = sentinel;

//       // find the rightmost not-nine digit
//       while (head != null) {
//           if (head.val != 9) {
//               notNine = head;
//           }
//           head = head.next;
//       }

//       // increase this rightmost not-nine digit by 1
//       notNine.val++;
//       notNine = notNine.next;

//       // set all the following nines to zeros
//       while (notNine != null) {
//           notNine.val = 0;
//           notNine = notNine.next;
//       }

//   return sentinel.val != 0 ? sentinel : sentinel.next;
// }
// }



// public class lc369 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.simplifyPath("/asdf/..///dfasf/s../s");
// 		System.out.println("Hello World");

// 	}
// }
