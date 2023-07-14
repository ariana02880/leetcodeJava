// package lintcode;

// class Solution {
//   /**
//    * @param nums: an array of integers
//    * @param s: An integer
//    * @return: an integer representing the minimum size of subarray
//    */
//   public int minimumSize(int[] nums, int s) {
//       // write your code here
//       int sum[] = new int[nums.length+1];
//       sum[0]=0;
//       for(int i =0; i<= nums.length-1; i++){
//           sum[i+1] = sum[i] + nums[i];
//       }
//       int i=0; 
//       int j=1;
//       int result = Integer.MAX_VALUE;
//       for (;j<=sum.length-1;j++){
//           while (i<j && (sum[j]-sum[i])>=s){
//               result = Math.min(result,j-i);
//               i++;

//           }
//       }
//       if(result == Integer.MAX_VALUE)
//           return -1;
//       return result;

//   }
// }
// public class l406 {
//   public static void main(){

//     System.out.println("Ariana");
//   }
// }
