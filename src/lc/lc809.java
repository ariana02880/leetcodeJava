// package lc;
// import java.lang.*;
// import java.io.*;


// class Solution {
//   public int expressiveWords(String s, String[] words) {
//       int ans = 0;
//       for(String w: words){
//           if(isStretchy(s,w)) {
//               ans++;
//           }
//       }
//       return ans;
      
//   }
//   public boolean isStretchy (String s, String t) {
//       int m = s.length();
//       int n = t.length();
//       int j = 0;
//       for(int i = 0;i < m ;i++){
//           if(j<n && s.charAt(i) == t.charAt(j)){
//               j++;
//           }
//           else if(i-1 >= 0 && 
//                   i+1 < m && 
//                   s.charAt(i) == s.charAt(i-1) && 
//                   s.charAt(i) == s.charAt(i+1)){
//               continue;
//           }
//           else if(i-2 >= 0 &&
//                   s.charAt(i) == s.charAt(i-1) &&
//                  s.charAt(i-1) == s.charAt(i-2)){
//               continue;
//           }
//           else{
//               return false;
//           }
//       }
//       return j == n;
//   }
// }


// public class lc809 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int[][]times= {{1,2,2},{1,3,4},
// 				{2,1,1},{2,3,5},
// 				{3,1,3},{3,2,6}};
// 		int n=3;
// 		int k=1;
// 		Object a=test.networkDelayTime(times,n,k);
// 		System.out.println("Hello World");

// 	}
// }
