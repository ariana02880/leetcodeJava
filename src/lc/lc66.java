//import java.util.HashMap;
//import com.sun.javafx.image.IntPixelAccessor;
//
// // Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
//}
//
// //Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
////my
//class Solution2 {
//    public int[] plusOne(int[] digits) {
//        int n=digits.length;
//        int carry=0;
//        for(int i=n-1;i>=0;i--){
//           if( (++digits[i])==10){
//               carry=1;
//               digits[i]=0;
//           }
//            else
//                return digits;
//        }
//        int[] ans=new int[n+1];
//        ans[0]=1;
//        return ans;
//    }
//}
//class Solution {
//    public int[] plusOne(int[] digits) {
//        int n = digits.length;
//    	//Ò»°ãÇé¿ö
//        for (int i = n - 1; i >= 0; i--){
//            if (digits[i] < 9){
//                digits[i]++;
//                return digits;
//            } else {
//                digits[i] = 0;
//            }
//        }
//
//        int[] newNumber = new int[n + 1];
//        newNumber[0] = 1;
//        return newNumber;
//    }
//}
//
//
//
//public class lc66 {
//public static void main(String arg[]) {
//		Solution2 test=new Solution2();
//		
//		int[] digits=new int[] {2,9,9,9};
//		int[] a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
