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
////my
//class Solution {
//    public int openLock(String[] deadends, String target) {
//        // Write your code here
//        HashSet<String> deadSet= new HashSet<>();
//        Queue<String> q=new LinkedList<>();
//        for(String aa:deadends){
//            if(aa==target)
//                return -1;
//            deadSet.add(aa);
//        }
//        HashSet<String> visited=new HashSet<>();
//        int ans=-1;
//        q.add("0000");
//        visited.add("0000");
//        while(!q.isEmpty()){
//            int size=q.size();
//            ans++;
//            
//                
//            for(int i=0;i<size;i++){
//                String cs=q.poll();
//                if (cs.equals(target)) {
//                    return ans;
//                }
//                for(int j=0;j<4;j++){
//                    String ns=cs.substring(0,j)+(cs.charAt(j)-'0'+1 +10)%10+ cs.substring(j+1);
//                    if(!deadSet.contains(ns)&&!visited.contains(ns)){
//                        visited.add(ns);
//                        q.add(ns);
//                    }
//                    
//                    ns=cs.substring(0,j)+(cs.charAt(j)-'0'-1 +10)%10+ cs.substring(j+1);
//                    if(!deadSet.contains(ns)&&!visited.contains(ns)){
//                        visited.add(ns);
//                        q.add(ns);
//                    }
//                }
//            }
//        }
//        
//        return -1;
//    }
//}
//
//public class l796 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		String [] t= {"2110","2000","0000","2111","1110"};
//		String end="0012";
//		Object a=test.openLock(t,end);
//		System.out.println("Hello World");
//
//	}
//}
