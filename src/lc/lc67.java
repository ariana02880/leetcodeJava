//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
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
//	public String addBinary(String a, String b) {
//		String res = "";
//        int m = a.length() - 1, n = b.length() - 1, carry = 0;
//        while (m >= 0 || n >= 0) {
//            int p = (m >= 0 ? a.charAt(m--)- '0' : 0);
//            int q = n >= 0 ? b.charAt(n--)- '0' : 0;
//            int sum = p + q + carry;
//            Integer aa=sum%2;
//            res = aa.toString() + res;
//            carry = sum / 2;
//        }
//        return carry == 1 ? "1" + res : res;
//    }
//	//my
//	public String addBinary(String a, String b) {
//        int carry=0;
//        int m=a.length()-1,n=b.length()-1;
//        String ans="";
//        while(m>=0||n>=0){
//            int p= m>=0? a.charAt(m--)-'0':0;
//            int q= n>=0? b.charAt(n--)-'0':0;
//            int sum=p+q+carry;
//            carry=sum/2;
//            Integer aaa=sum%2;
//            ans=aaa.toString()+ans;
//        }
//        return (carry==1 ? "1"+ans:ans);
//    }
//}
//
//
//public class lc67 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		String a=test.addBinary("1010", "1011");
//		System.out.println("Hello World");
//
//	}
//}