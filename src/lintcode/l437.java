// package lintcode;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;


// class Solution {
//   /**
//    * @param pages: an array of integers
//    * @param k: An integer
//    * @return: an integer
//    */
//   public int copyBooks(int[] pages, int k) {
//       // write your code here
//       int l = 0;
//       int r = getSum(pages);
//       while(l+1 < r) {
//           int mid = l+(r-l)/2;
//           if(howManyPeople(pages,mid) <= k ){
//               r=mid;
//           }
//           else{
//               l=mid;
//           }

//       }
//       if(howManyPeople(pages,l) <= k){
//           return l;
//       }
//       return r;
//   }
//   public int howManyPeople(int[] pages, int mid){
//       int cnt = 0;
//       int time = 0;
//       for(int aa: pages){
//           if (aa > mid) {
//                 return Integer.MAX_VALUE;
//             }
//           if(time + aa > mid){
//               cnt++;
//               time = 0;
//           }
//           time += aa;
//       }
//       return cnt+1;
//   }
//     private int getSum(int[] pages) {
//       int sum = 0;
//       for (int page : pages) {
//           sum += page;
//       }
//       return sum;
//   }
// }

// public class l437 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
//     int[] pages = {3,2,4};
//     int k= 2;
// 		Object a=test.copyBooks(pages, k);
// 		System.out.println("Hello World");

// 	}
// }