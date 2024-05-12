// package realProblem;

// class Solution {
//   public String geString(String message, int i) {
//     if (i <= 4) return "...";
//     if (message.length() <= i) return message;
//     String[] splitArray = message.split(" ");
//     int maxLen = i-4;
//     String ans = "";
//     int cur = 0;
//     for ( int idx=0; idx< splitArray.length; idx++) {
//       cur+= splitArray[idx].length();
//       if (cur > maxLen) {
//         return ans + "...";
//       }
//       ans += splitArray[idx] + " ";
//       cur ++; // space
//     }
//     return "";
//   }
// }

// public class ms_1 {
//   public static void main(String arg[]) {

//     Solution s = new Solution();
//     String message = "And now here is my secret";
//     String message2 = "There is an animal with four legs";
//     String message3 = "super dog";
//     String message4 = "how are you";

//     String ans = s.geString(message4, 6);

//     System.out.println("Hello World");
//   }

  
// }
