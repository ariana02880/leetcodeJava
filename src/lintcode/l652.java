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
//class Solution {
//    public List<List<Integer>> getFactors(int n) {
//        // write your code here
//        dfs(2,n);
//        return ans;
//    }
//    public void dfs(int start,int remain){
//        if(remain==1){
//            if(path.size()>1)
//                ans.add(new ArrayList<>(path));
//            return;
//        }
//        for(int i=start;i<=remain;i++){
//            if(i>remain/i){
//                break;
//            }
//            if(remain%i==0){
//                path.add(i);
//                dfs(i,remain/i);
//                path.remove(path.size()-1);
//            }
//        }
//        path.add(remain);
//        dfs(remain,1);
//        path.remove(path.size()-1);
//    }
//    public ArrayList<List<Integer>> ans= new ArrayList<>();
//    public ArrayList<Integer> path=new ArrayList<>();
//}
//public class l652 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
////		String s="lintcode";
////		HashSet<String> ss= new HashSet<>();
////		ss.add("de");
////		ss.add("ding");
////		ss.add("co");ss.add("code"); ss.add("lint");
//		
//		
//		String s="a";
//		HashSet<String> ss= new HashSet<>();
//		ss.add("a");
//		Object a=test.getFactors(8);
//		System.out.println("Hello World");
//
//	}
//}
