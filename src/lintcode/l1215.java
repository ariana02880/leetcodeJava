// package lintcode;
// public class Solution {
//   /**
//    * @param n: an integer 
//    * @return: the number of '1's in the first N number in the magical string S
//    */
//   public int magicalString(int n) {
//       // write your code here
//       if (n==0)
//           return 0;
//       int[] ans = new int[n+3];
//       int i=0; int j=1;
//       ans[0]=1;
//       int ansCount =0 ;
//       while(j<=n-1){
//           ans[j]= change(ans[j-1]);
//           i++;
//           if( ans[i] == 2) {
//               j++;
//               ans[j]=ans[j-1];
//               j++;
//           }
//           else {
//               j++;
//           }
          
//       }

//       for(int q=0;q<ans.length;q++){
//           if(ans[q]==1){
//               ansCount ++;
//           }
//       }
      
//   return ansCount;

//   }


//   public int change(int a){
//       return a==1? 2 : 1;
//   }
// }
// public class l1215 {
  
// }
