// package lc;
// import java.lang.*;
// import java.util.HashMap;
// import java.util.PriorityQueue;
// import java.io.*;

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         int[] ans = new int[k];
//         HashMap<Integer, Integer> map = new HashMap<>();
//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
//             (a,b) -> map.get(b) - map.get(a)
//         );
//         for (int aa: nums) {
//             map.put(aa, map.getOrDefault(aa,0) +1);
//         }
//         maxHeap.addAll(map.keySet());

//         // print the ans:
//         for ( int i=0; i<k-1; i++) {
//             ans[i] = maxHeap.poll();
//         }
//         return ans;
        
//     }
// }

// public class lc347 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		int [] aa = {1,1,1,2,2,3};
// 		Object a=test.topKFrequent(aa, 2);
        
// 		System.out.println("Hello World");

// 	}
// }
