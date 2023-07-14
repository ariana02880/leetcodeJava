// package lc;
// import java.lang.*;
// import java.io.*;


// class Solution {
//   public boolean backspaceCompare(String S, String T) {
//       return build(S).equals(build(T));
//   }

//   public String build(String S) {
//       Stack<Character> ans = new Stack();
//       for (char c: S.toCharArray()) {
//           if (c != '#')
//               ans.push(c);
//           else if (!ans.empty())
//               ans.pop();
//       }
//       return String.valueOf(ans);
//   }
// }


// public class lc844 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.reverseVowels("hello");
// 		System.out.println("Hello World");

// 	}
// }
