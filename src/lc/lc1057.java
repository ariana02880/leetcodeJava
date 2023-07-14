//package lc;
//import java.lang.*;
//import java.io.*;
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
//////my
////class Solution {
////	public int help(int[] a,int []b) {
////		return Math.abs(a[0]-b[0])+Math.abs(a[1]-b[1]);
////	}
////    public int[] assignBikes(int[][] workers, int[][] bikes) {
////        PriorityQueue<int []> pQueue=new PriorityQueue<>(
////        		(a,b)->{
////        			int m1=help(workers[a[0]],bikes[a[1]]);
////        			int m2=help(workers[b[0]],bikes[b[1]]);
////        			if(m1==m2) {
////        				if(a[0]==b[0])
////        					return a[1]-b[1];
////        				return a[0]-b[0];
////        			}
////        			return m1-m2;
////        		}
////        		);
////        for(int i=0;i<workers.length;i++) {
////        	for(int j=0;j<bikes.length;j++) {
////        		pQueue.add(new int [] {i,j});
////        	}
////        }
////        boolean[] taken=new boolean[bikes.length];
////        int[] ans=new int[workers.length];
////        Arrays.fill(ans, -1);
////        while(!pQueue.isEmpty()) {
////        	int[] temp= pQueue.poll();
////        	if(ans[temp[0]]==-1 && taken[temp[1]]==false) {
////        		ans[temp[0]]=temp[1];
////        		taken[temp[1]]=true;
////        	}
////        }
////        return ans;
////    }
////}
//
//class Solution {
//    class Pair {
//        int val;
//        int index_worker;
//        int index_bike;
//        public Pair(int val, int index_worker, int index_bike) {
//            this.val = val;
//            this.index_worker = index_worker;
//            this.index_bike = index_bike;
//        }
//    }
//    
//    class ComparePair implements Comparator<Pair> {
//        public int compare(Pair a, Pair b) {
//            if(a.val != b.val) {
//                return a.val - b.val;
//            } else if(a.index_worker != b.index_worker) {
//                return a.index_worker - b.index_worker;
//            } else {
//                return a.index_bike - b.index_bike;
//            }
//        }
//    }
//    
//    public int[] assignBikes(int[][] workers, int[][] bikes) {
//        int n = workers.length, m = bikes.length;
//        int[] res = new int[n];
//        PriorityQueue<Pair> pq = new PriorityQueue<>(n, new ComparePair());
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//                int dist = Math.abs(workers[i][0] - bikes[j][0]) + Math.abs(workers[i][1] - bikes[j][1]);
//                pq.add(new Pair(dist, i, j));
//            }
//        }
//        boolean[] visited_w = new boolean[n];
//        boolean[] visited_b = new boolean[m];
//        for(int i = 0; i < n; i++) {
//            Pair pair = pq.poll();
//            while(visited_w[pair.index_worker] || visited_b[pair.index_bike])
//                pair = pq.poll();
//            res[pair.index_worker] = pair.index_bike;
//            visited_w[pair.index_worker] = true;
//            visited_b[pair.index_bike] = true;
//        }
//        return res;
//    }
//}
//public class lc {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
//
//
