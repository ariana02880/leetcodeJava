
// package realProblem;

// import java.util.Arrays;

// class Solution {

//   public int shortestLengthToCover(int[] input) {
//     if(input.length ==0) {
//       return -1;
//     }
//     Arrays.sort(input);
//     int left = input[0];
//     int right = input[input.length-1];
//     int ans = 0;
//     while(left< right) {
//       int mid = left +  (right-left)/2;
//       if (canCover(mid, input)) {
//         ans = mid - left;
//         right = mid -1;
//       } else {
//         left = mid +1;
//       }
//     }
//     if (canCover(left, input)) {
//       return left - input[0];
//     } 
//     if (canCover(right, input)) return right - input[0];

//     return ans;
//   }
// // O(n): input size
//   private boolean canCover(int mid, int[] input) {
//     int start = -1;
//     int coverAns =mid-input[0];
//     int end = input[input.length -1];
//     for ( int i=0 ;i <input.length ; i++) {
//       if ( input[i] > mid) {
//         start = input[i];
//         return (end - start) <= coverAns ? true : false;
//       }
//     }
//     return true;
    
//   }
// }

// public class ms_3 {
//   public static void main(String arg[]) {

//     Solution s = new Solution();


//     int [] input= {0,44,32,30,42,18,34,16,35};

//     int ans = s.shortestLengthToCover(input);

//     System.out.println("Hello World");
//   }

  
// }
