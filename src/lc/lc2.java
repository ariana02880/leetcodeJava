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
//
//
//
//class Solution2 {
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode ans=new ListNode(-1);
//        ListNode tt=ans;
//        int carry=0;
//        while(l1!=null||l2!=null){
//            int a1=l1==null? 0:l1.val;
//            int a2=l2==null? 0:l2.val;
//            int sum=a1+a2+carry;
//            carry=sum>=10? 1:0;
//            tt.next=new ListNode(sum%10);
//            if(l1!=null)
//                l1=l1.next;
//            if(l2!=null)
//                l2=l2.next;
//        }
//        return ans.next;
//    }
//}
//
//
//public class lc2 {
//	public static void main(String arg[]) {
////		int[] aa= {2,7,11,15};
////		int [] ans=Solution.twoSum(aa,9);
//		System.out.println("Hello World");
//	}
//
//}
