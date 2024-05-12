// package realProblem;
// // https://leetcode.com/discuss/interview-experience/1379020/google-phone-screen

// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.Map;
// import java.util.Queue;
// import java.util.Stack;

// class Solution {
//   public int countGroups(int[] arr) {
//     int n = arr.length;
//     Stack<Integer> stk = new Stack<>();
//     int cnt = 0;
//     for (int r = 0; r <= n; r++) {
//       int cur = (r == n) ? Integer.MAX_VALUE : arr[r];
//       while (!stk.isEmpty() && arr[stk.peek()] < cur) {
//         int j = stk.pop();
//         int l = stk.isEmpty() ? -1 : stk.peek();
//         cnt += (r - j) + (j - l) - 1;
//       }
//       stk.push(r);
//     }
//     return cnt;
//   }
// }

// public class aws1 {
//   public static void main(String arg[]) {

//     Solution s = new Solution();
//     int[] arr = { 100, 1, 5, 1, 100 };
//     int a = s.countGroups(arr);

//     System.out.println("Hello World");
//   }
// }
