
// package lintcode;

// class Solution {
//   /**
//    * @param s: a string
//    * @return: an integer
//    */
//   public int lengthOfLongestSubstring(String s) {
//       // write your code here
//       if(s.length() ==  0){
//           return 0;
//       }
//       boolean charArray [] = new boolean[26];
//       char charS[] = s.toCharArray();
//       int result = Integer.MIN_VALUE;
//       for(int i=0 , j=0; j<s.length() ;j++){
//           while(i<= j && charArray[charS[j] - 'a']== true){
//               charArray[charS[j] - 'a'] = false;
              
//               i++;

//           }
//           if(i<=j){
//               charArray[charS[j] - 'a'] = true;
//           }
//           result = Math.max(result, j-i +1);
//       }
//       if(result ==  Integer.MIN_VALUE)
//           return 1;
//       return result;
//   }
// }

// public class Solution2 {
//   /**
//    * @param s: a string
//    * @return: an integer
//    */
//   public int lengthOfLongestSubstring(String s) {
//       // write your code here
//       if(s.length() ==  0){
//           return 0;
//       }
//       char charS[] = s.toCharArray();
//       int result = Integer.MIN_VALUE;
//       for(int i=0 , j=0; j<s.length() ;j++){
//           while(i<= j && hasChar(s,i,j-1,j)){
//               i++;

//           }
//           result = Math.max(result, j-i +1);
//       }
//       if(result ==  Integer.MIN_VALUE)
//           return 1;
//       return result;
//   }

//   public boolean hasChar(String s, int start, int end, int target){
//       char temp[]= s.toCharArray();
//       for(int i=start; i<=end ;i++){
//           if(temp[i] == temp[target]){
//               return true;
//           }
//       }
//       return false;
//   }
// }



// public class l384 {
  
// }
