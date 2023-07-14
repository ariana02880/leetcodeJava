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
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        // write your code here
//        int []inDegree=new int[numCourses];
//        for(int[] aa:prerequisites){
//            inDegree[aa[0]]++;
//        }
//        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
//        Queue <Integer> q=new LinkedList<>();
//        for(int[] aa:prerequisites){
//            if(map.get(aa[1])==null){
//                map.put(aa[1],new ArrayList<>());
//            }
//            ArrayList<Integer> temp= map.get(aa[1]);
//            temp.add(aa[0]);
//            map.put(aa[1],temp);
//        }
//        for(int i=0;i<numCourses;i++){
//            if(inDegree[i]==0)
//                q.add(i);
//        }
//        
//        int ans=0;
//        while(!q.isEmpty()){
//            ans++;
//            int key=q.poll();
//            if(map.containsKey(key)) {
//            	ArrayList<Integer> now=map.get(key);
//                for(int i=0;i<now.size();i++)//delete all inDegree
//                {
//                    inDegree[now.get(i)]--;
//                    if(inDegree[now.get(i)]<=0){
//                        q.add(now.get(i));
//                    }
//                }
//            }
//            
//        }
//        return ans==numCourses;
//    }
//}
//public class l615 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [][] p= {{1,0}};
//		Object a=test.canFinish(2,p );
//		System.out.println("Hello World");
//
//	}
//}
