// package lc;

// import java.lang.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.PriorityQueue;
// import java.util.Queue;
// import java.io.*;

// class Solution {
//     public int numSquares(int n) {
//         ArrayList<Integer> sq = new ArrayList<Integer>();
//         for (int i=1; i*i <=n; i++) {
//             sq.add(i*i);
//         }
//         Queue<Integer> pq = new LinkedList<>();
//         pq.add(n);
//         int level = 0;
//         while(!pq.isEmpty()) {
//             int size = pq.size();
//             level ++;
//             for (int i=0;i<size; i++) {
//                 int new_root = pq.poll();
//                 for(Integer square: sq) {
//                     if (new_root < square) {
//                         continue;
//                     } if (new_root == square) {
//                         return level;
//                     } else {
//                         pq.add(new_root - square);
//                     }
//                 }
//             }
//         }
//         return level;
//     }
// }

// public class lc279 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     int a = test.numSquares(12);

//     System.out.println("Hello World");



//     List<Boolean> list = new ArrayList<>(); 
//     list.add(true);  
//     list.add(Boolean.parseBoolean("True"));  
//     list.add(Boolean.TRUE);  
//     System.out.print(list.size());  
//     System.out.print(list.get(1) instanceof Boolean);  

//   }
// }

