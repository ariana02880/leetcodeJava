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
//////ans
////class Solution {
////    public boolean sequenceReconstruction(int[] org, int[][] seqs) {
////        // write your code here
////        Map<Integer, List<Integer>> graph = new HashMap<>();
////        Map<Integer, Integer> indegree = new HashMap<>();
////        
////        // build up the map
////        for (int[] seq : seqs) {
////            for (int i = 0; i < seq.length; i++) {
////                graph.putIfAbsent(seq[i], new ArrayList<Integer>());
////                indegree.putIfAbsent(seq[i], 0);
////                if (i > 0) {
////                    graph.get(seq[i - 1]).add(seq[i]);
////                    indegree.put(seq[i], indegree.get(seq[i]) + 1);
////                }
////            }
////        }
////        if (org.length != indegree.size()) {
////            return false;
////        }
////        
////        // classical BFS
////        Queue<Integer> queue = new LinkedList<>();
////        for (int key : indegree.keySet()) {
////            if (indegree.get(key) == 0) {
////                queue.add(key);
////            }
////        }
////    
////        int index = 0;
////        while (queue.size() == 1) {
////            int cur = queue.poll();
////            if (org[index++] != cur) {
////                return false;
////            }
////            for (int neighbor : graph.get(cur)) {
////                indegree.put(neighbor, indegree.get(neighbor) - 1);
////                if (indegree.get(neighbor) == 0) {
////                    queue.add(neighbor);
////                }
////            }
////        }
////        return index == org.length;
////    }
////}
//
////my
//class Solution {
//
//    public boolean sequenceReconstruction(int[] org, int[][] seqs) {
//        // write your code here
//        HashMap<Integer,Integer> inDegree=new HashMap<>();
//        Queue<Integer> q=new LinkedList<>();
//        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
//        int ans=0;
//        
//        for(int [] aa:seqs){
//            for(int i=0;i<aa.length;i++){
//                inDegree.putIfAbsent(aa[i], 0);
//                if(i>0){
//                    inDegree.put(aa[i],inDegree.getOrDefault(aa[i],0)+1);
//                    map.putIfAbsent(aa[i-1],new ArrayList<>());
//                    map.get(aa[i-1]).add(aa[i]);
//                }
//                
//            }
//            
//            
//        }
////        if(org.length!=inDegree.size()){
////            return false;
////        }
//        for(int key:inDegree.keySet()){
//            if(inDegree.get(key)==0){
//                q.add(key);
//            }
//        }
//        
//        while(q.size()==1){
//            int key=q.poll();
//            if(org[ans]!=key){
//                return false;
//            }
//            ans++;
//            if(map.get(key)!=null){
//                for(int k: map.get(key)){
//                    inDegree.put(k,inDegree.get(k)-1);
//                    if(inDegree.get(k)==0){
//                        q.add(k);
//                    }
//                }
//            }
//            
//        }
//        return ans==org.length;
//        
//    }
//}
//public class l605 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//
//		int [][] p= {{5,3,2,1}};
//		int [] q= {5,3,2,1};
//		Object a=test.sequenceReconstruction(q, p);
//		System.out.println("Hello World");
//
//	}
//}
