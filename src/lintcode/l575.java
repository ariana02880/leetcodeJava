
// package lintcode;

// import java.util.Comparator;
// import java.util.PriorityQueue;
// import java.util.Stack;

// // class Solution {
// //   /**
// //    * @param s: an expression includes numbers, letters and brackets
// //    * @return: a string
// //    */
// //   public String expressionExpand(String s) {
// //       // write your code here
// //       Stack<Integer> nums = new Stack<> ();
// //       Stack<String> data = new Stack<> ();
// //       int i=0;
// //       int nowN = 0;
// //       String temp = "";
// //       while(i < s.length()){
// //           if(s.charAt(i) == '['){
// //               nums.push(nowN);
// //               data.push(temp);
// //               nowN = 0; temp = "";
// //           }
// //           else if(s.charAt(i) >='0' && s.charAt(i) <='9'){
// //               nowN = nowN*10 + (s.charAt(i)-'0');
// //           }
// //           else if(s.charAt(i) == ']'){
// //               int cnt = nums.pop();
// //               String current = data.pop();
// //               for(int j = 0;j<cnt;j++){
// //                   current += temp;
// //               }
// //               temp = current;
// //           }
// //           else{
// //               temp += s.charAt(i);
// //           }
// //           i++;

// //       }
// //       return data.isEmpty() ? temp : data.peek();

// //   }
// // }

// class Solution {
//   /**
//    * @param s: an expression includes numbers, letters and brackets
//    * @return: a string
//    */
//   public String expressionExpand(String s) {
//     // write your code here
//     if (s == null || s.length() == 0) {
//       return "";
//     }
//     return dfs(s, 0).res;
//   }

//   class returnType {
//     public String res;
//     public int idx;

//     returnType(int a, String b) {
//       idx = a;
//       res = b;
//     }
//   }

//   public returnType dfs(String s, int start) {
//     int cnt = 0;
//     String ans = "";
//     if (start >= s.length()) {
//       return new returnType(0, ans);
//     }
//     for (int i = start; i < s.length(); i++) {
//       if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
//         cnt = cnt * 10 + (s.charAt(i) - '0');
//       } else if (s.charAt(i) == '[') {
//         returnType now = dfs(s, i + 1);
//         String repeat = now.res;
//         i = now.idx;
//         for (int j = 0; j < cnt; j++) {
//           ans += repeat;
//         }
//         cnt = 0;
//       } else if (s.charAt(i) == ']') {
//         return new returnType(i, ans);
//       } else {
//         ans += s.charAt(i);
//       }
//     }
//     return new returnType(0, ans);
//   }
// }

// public class l575 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

//     Object a = test.expressionExpand("3[2[ad]3[pf]]xyz");

//     System.out.println("Hello World");

//   }
// }
