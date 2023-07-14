// import java.util.HashMap;
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

// /**
//  * The read4 API is defined in the parent class Reader4.
//  *     int read4(char[] buf4);
//  */

// public class Solution extends Reader4 {
//   /**
//    * @param buf Destination buffer
//    * @param n   Number of characters to read
//    * @return    The number of actual characters read
//    */
//   private int pointer = 0;
//   private int len = 0;
//   private char[] temp = new char[4];

//   public int read(char[] buf, int n) {
//       int index = 0;
//       while (index < n) {
//           if (pointer == 0) {
//               len = read4(temp);
//           }
//           if (len == 0) {
//               break;
//           }
//           while (index < n && pointer < len) {
//               buf[index] = temp[pointer];
//               index++;
//               pointer++;
//           }
//           if (pointer >= len) {
//               pointer = 0;
//           }
//       }
//       return index;
//   }
// }

// public class lc158 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		//int[] digits=new int[] {2,4,3,9};
// 		//int[] a=test.plusOne(digits);
// 		System.out.println("Hello World");
		

// 	}
// }
