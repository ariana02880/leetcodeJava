// package lc;

// import java.lang.*;
// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Deque;
// import java.util.List;
// import java.io.*;


// // class Solution {
// //     public int[] findBuildings(int[] heights) {
// //         int n = heights.length;
// //         List<Integer> list = new ArrayList<>();
        
// //         for (int i=n-1; i>=0; i--) {
// //             if (i == n-1) {
// //                 list.add(i);
// //             }
// //             if (list.size() !=0 && heights[i] > heights[list.get(list.size()-1)] ) {
// //                 list.add(i);
// //             }
// //         }
// //         Collections.sort(list);
// //         // Push elements from list to answer array.
// //         int[] answer = new int[list.size()];
// //         for (int i = 0; i < list.size(); ++i) {
// //             answer[i] = list.get(i);
// //         }
        
// //         return answer;
// //     }
// // }

// //Time O(n), Space O(n)
// class Solution {
//     public int[] findBuildings(int[] heights) {
//         Deque<Integer> s = new ArrayDeque<>();
//         s.offerFirst(heights.length - 1);
//         for (int i = heights.length - 2; i >= 0; i--) 
//             if (heights[i] > heights[s.peekFirst()]) 
//             s.offerFirst(i);
//         int[] res = new int[s.size()];
//         for (int i = 0; i < res.length; i++) 
//             res[i] = s.pollFirst();
//         return res;
//     }
// }


// public class lc1762 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		int[] input = {4,2,3,1};
// 		Object a=test.findBuildings(input);
// 		System.out.println("Hello World");

// 	}
// }
