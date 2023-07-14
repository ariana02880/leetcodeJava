//import java.util.HashMap;
//import com.sun.javafx.image.IntPixelAccessor;
// // Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
//}
// //Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
//
//class Solution {
//	public int read4(char[] buf) {
//		return 34;
//	}
//	public int read(char[] buf, int n) {
//        if(n == 0)
//            return 0;
//        int read = 0;
//        char[] buffer4 = new char[4];
//        while(true)
//        {
//            int r = read4(buffer4);
//            for(int i = 0;i<r && read<n;i++)
//            {
//                buf[read++]= buffer4[i];
//            }
//            if(r != 4||read>=n)
//                break;
//        }
//        return read;
//    }
//	
//}
//
//public class lc157 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		//int[] digits=new int[] {2,4,3,9};
//		//int[] a=test.plusOne(digits);
//		System.out.println("Hello World");
//		
//
//	}
//}
