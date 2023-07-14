//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//
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
//	//my
//	public int numUniqueEmails2(String[] emails) {
//        Set<String> ans=new HashSet<String>();
//        for(String aa:emails){
//            String []temp=aa.split("@");
//            StringBuilder sb=new StringBuilder();
//            for(int i=0;i<temp[0].length();i++){
//                char ch=temp[0].charAt(i);
//                if(ch=='.')
//                    continue;
//                else if(ch=='+')
//                    break;
//                else
//                    sb.append(ch);
//            }
//            sb.append("@").append(temp[1]);
//            ans.add(sb.toString());
//        }
//        return ans.size();
//    }
//}
//
//
//public class lc929 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		String [] ariana= {"ddd.s.ds+23@syr.edu","ddd.s@syr.edu","hhhd.s.s@ww"};
//
//		int a=test.numUniqueEmails2(ariana);
//		
//		System.out.println("Hello World");
//
//	}
//}
//
