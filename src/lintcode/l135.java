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
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        // write your code here
//        ArrayList<List<Integer>> ans=new ArrayList<>();
//        if (candidates == null || candidates.length == 0){
//            return ans;
//        }
//        
//        Arrays.sort(candidates);
//        dfs(candidates,target,ans,new ArrayList<>(),0,0);
//        return ans;
//    }
//    public HashSet<ArrayList<Integer>> mp=new HashSet<>();
//    public void dfs(int[] candidates, int target,ArrayList<List<Integer>> ans,ArrayList<Integer> path,int start,int cur){
//        if(target==cur){
//            Collections.sort(path);
//            if(!mp.contains(path))
//                ans.add(new ArrayList<>(path));
//            mp.add(new ArrayList<>(path));
//            return;
//        }
//
//        for(int i=start;i<candidates.length;i++){
//            if(cur+candidates[i]<=target){
//                path.add(candidates[i]);
//                dfs(candidates,target,ans,path,i,cur+candidates[i]);
//                path.remove(path.size()-1);
//            }
//            else{
//                break;
//            }
//        }
//    }
//}
//
//
//public class l135 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] cand= {1,4,2,7,4,6,2};
//		
//		Object a=test.combinationSum(cand, 7);
//		System.out.println("Hello World");
//
//	}
//}
