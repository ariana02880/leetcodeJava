// package realProblem;


// class Solution {
//     public int binarySearch(int[] input) {
//         int left = 0;
//         int right = input.length -1;
//         int ans = input.length;
//         while(left +1 < right) {
//             int mid = left + (right - left) /2;
//             if (input[mid] == 0 ) {
//                 left = mid +1;
//             } else {
//                 ans = mid;
//                 right = mid -1;
//             }
//         }
//         if(input[left]  == 1) {
//             return left;
//         }
//         if (input[right] == 1) {
//             return right;
//         }
//         // if (left == 0 && right == 0) {
//         //     return right+1;
//         // }
//         return ans == input.length ? -1 : ans;
//     }
// }

// public class tiktok1 {
//     public static void main(String arg[]) {

//         int[] aa = {0,1,1,1};
//         Solution s = new Solution();
//         int ans = s.binarySearch(aa);

//         System.out.println("Hello World");
//     }
// }
