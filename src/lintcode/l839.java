//package lintcode;
//package lc;
//import java.lang.*;
//import java.io.*;
//// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
//}
////Definition for a binary tree node.
//class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
//}
//
//
//
//
//
////my
//
//
//class Solution {
//    public List<Interval> mergeTwoInterval(List<Interval> list1, List<Interval> list2) {
//        // write your code here
//        ArrayList<Interval> ans=new ArrayList<>();
//        if(list1.size()==0&&list2.size()==0){
//            return ans;
//        }
//        int i=0,j=0;
//        while(i<list1.size() && j<list2.size()){
//            if(list1.get(i).start<list2.get(j).start) {
//                help(ans,list1.get(i++));
//            }
//            else{
//                help(ans,list2.get(j++));
//            }
//        }
//        while(i<list1.size()){
//            help(ans,list1.get(i++));
//        }
//        while(j<list2.size()){
//            help(ans,list2.get(j++));
//        }
//        ans.add(last);
//        return ans;
//    }
//    public Interval last=null;
//    public void help(ArrayList<Interval> ans,Interval a){
//        if(last==null){
//            last=new Interval(a.start, a.end);
//            return;
//        }
//        if(last.end>=a.start){
//            last.end=Math.max(a.end,last.end);
//        }
//        else{
//            ans.add(last);
//            last=a;
//        }
//        
//    }
//}
//
//
//public class l839 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[]cand= {2,1,3,1,4};
//		ArrayList<Interval> list1=new ArrayList<>();
//		list1.add(new Interval(2, 3));
//		list1.add(new Interval(30,40));
//		ArrayList<Interval> list2=new ArrayList<>();
//		list2.add(new Interval(2,30));
//		list2.add(new Interval(50,60));
//
//		
//		Object a=test.mergeTwoInterval(list1,list2);
//		System.out.println("Hello World");
//
//	}
//}
