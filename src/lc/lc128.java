// package lc;
// import java.lang.*;
// import java.util.HashSet;
// import java.util.Set;
// import java.io.*;


// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Set<Integer> num_set = new HashSet<Integer>();
//         for (int num : nums) {
//             num_set.add(num);
//         }

//         int longestStreak = 0;

//         for (int num : num_set) {
//             if (!num_set.contains(num-1)) {
//                 int currentNum = num;
//                 int currentStreak = 1;

//                 while (num_set.contains(currentNum+1)) {
//                     currentNum += 1;
//                     currentStreak += 1;
//                 }

//                 longestStreak = Math.max(longestStreak, currentStreak);
//             }
//         }

//         return longestStreak;
//     }
// }

// public class lc128 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
//         int [] input = {100,4,200,3,2,1};
		
// 		Object a=test.longestConsecutive(input);
// 		System.out.println("Hello World");

// 	}
// }
