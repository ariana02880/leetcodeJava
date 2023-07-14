//import java.util.HashMap;
//
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
//
//
//class Solution {
//	public String licenseKeyFormatting(String S, int K) {
//		StringBuilder sb = new StringBuilder();
//        for(int i = S.length() - 1; i >= 0; i--){
//            if(S.charAt(i) != '-')
//                sb.append(sb.length() % (K + 1) == K ? '-' : "").append(S.charAt(i));
//        }
//        return sb.reverse().toString().toUpperCase();
//	}
//}
//class Solution2 {
//    public String licenseKeyFormatting(String S, int K) {
//        StringBuilder sb=new StringBuilder();
//        for(int i=S.length()-1;i>=0;i--){
//            if(S.charAt(i)!='-'){
//                sb.append(sb.length()%(K+1)==K ? "-":"" ).append(S.charAt(i));
//            }
//        }
//        return sb.reverse().toString().toUpperCase();
//    }
//}
//
//public class G1_5 {
//public static void main(String arg[]) {
//		Solution test=new Solution();
//		String a=test.licenseKeyFormatting("2-5g-3-J",2);
//		System.out.println("Hello World");
//
//	}
//}
