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
////class Solution {
////	public String convert(String s, int numRows) {
////		if (numRows <= 1) 
////			return s;
////        String res = "";
////        int size = 2 * numRows - 2;
////        for (int i = 0; i < numRows; ++i) {
////            for (int j = i; j < s.length(); j += size) {
////                res += s.toCharArray()[j];
////                int tmp = j + size - 2 * i;
////                if (i != 0 && i != numRows - 1 && tmp < s.length()) 
////                	res += s.toCharArray()[tmp];
////            }
////        }
////        return res;
////	}
////	//my
////	public String convert2(String s, int numRows) {
////        if(numRows<=1)
////            return s;
////        String ans="";
////        for(int i=0;i<numRows;i++){
////            int group=2*numRows-2;
////            for(int j=i;j<s.length();j=j+group){
////                ans+=s.toCharArray()[j];
////                int temp=j+group-2*i;
////                if(i>=1&& i<numRows-1 && temp<s.length())
////                    ans+=s.toCharArray()[temp];
////            }
////        }
////        return ans;
////    }
////}
//class Solution {
//    public String convert(String s, int numRows) {
//    	String ans="";
//        if(numRows<=1)
//            return s;
//        for(int r=0;r<numRows&& r<s.length();r++){
//            int cur=r;
//            int flag=-1;
//            while(cur<s.length()){
//                flag*=-1;
//                if(r==0||r==numRows-1){
//                    ans+=s.charAt(cur);
//                    cur+=(2*numRows-2);
//                    continue;
//                }
//                if(flag==1){
//                    ans+=s.charAt(cur);
//                    cur+=(2*numRows-2)-2*r;
//                    continue;
//                }
//                else{
//                    ans+=s.charAt(cur);
//                    cur+=2*r;
//                    continue;
//                }   
//            }            
//        }
//        return ans;
//    }
//}
//
//public class lc6 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		String ss="PAYPALISHIRING";
//		String a=test.convert(ss,4);
//		System.out.println("Hello World");
//
//	}
//}
//
