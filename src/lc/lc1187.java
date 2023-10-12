// package lc;

// import java.lang.*;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.PriorityQueue;
// import java.util.TreeMap;
// import java.io.*;

// // Time complexity: O(NlogN).
// //Space complexity: O(N).


// // Ariana
// // O(m⋅n⋅logn)
// class Solution {
//     public int makeArrayIncreasing(int[] arr1, int[] arr2) {
//         Map<Integer, Integer> dp = new HashMap<>();
//         Arrays.sort(arr2);
//         int n = arr2.length;
//         dp.put(-1, 0);

//         for (int i = 0; i < arr1.length; i++) {
//             Map<Integer, Integer> newDp = new HashMap<>();
//             for (int prev : dp.keySet()) {
//                 if (arr1[i] > prev) {
//                     newDp.put(arr1[i], Math.min(newDp.getOrDefault(arr1[i], Integer.MAX_VALUE), dp.get(prev)));
//                 }
//                 int idx = bisectRight(arr2, prev);
//                 if (idx < n) {
//                     newDp.put(arr2[idx], Math.min(newDp.getOrDefault(arr2[idx], Integer.MAX_VALUE), 1 + dp.get(prev)));
//                 }
//             }
//             dp = newDp;
//         }
        
//         int answer = Integer.MAX_VALUE;
//         for (int value : dp.values()) {
//             answer = Math.min(answer, value);
//         }
        
//         return answer == Integer.MAX_VALUE ? -1 : answer;
//     }
    
//     private static int bisectRight(int[] arr, int value) {
//         int left = 0, right = arr.length;
//         while (left < right) {
//             int mid = (left + right) / 2;
//             if (arr[mid] <= value) {
//                 left = mid + 1;
//             } else {
//                 right = mid;
//             }
//         }
//         return left;
//     }
// }
// public class lc1187 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     int[] arr1 = {1,5,3,6,7}, arr2 = {1,6,3,3};


//     Object a = test.makeArrayIncreasing(arr1, arr2);

//     System.out.println("Hello World");

//   }
// }
