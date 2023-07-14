//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
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
//	public List<String> restoreIpAddresses(String s) {
//        List<String> ans=new ArrayList<String>();
//        helper(s,0,"",ans);
//        return ans;
//    }
//    public void helper(String left,int times, String out,List<String >ans){
//        if(times==4){
//            if(left.isEmpty())
//                ans.add(out);
//            return;
//        }
//        for(int i=1;i<4;i++){
//            if(left.length()<i){
//                break;
//            }
//            int val=Integer.parseInt(left.substring(0,i));
//            if(val>255|| i != String.valueOf(val).length())
//                continue;
//            helper(left.substring(i),times+1,out+left.substring(0,i)+(times==3?"":"."),ans);
//        }
//    }
//}
//
//
//public class lc93 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		List<String> a=test.restoreIpAddresses("225511135");
//		System.out.println("Hello World");
//
//	}
//}