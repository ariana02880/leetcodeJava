// import java.util.HashMap;

// //首先1不能直接到3，必须经过2，同理的有4到6，7到9，1到7，2到8，3到9，还有就是对角线必须经过5，
// //例如1到9，3到7等。建立一个二维数组 jumps，用来记录两个数字键之间是否有中间键，
// //然后再用一个一位数组 visited 来记录某个键是否被访问过，然后用递归来解，
// //先对1调用递归函数，在递归函数中，遍历1到9每个数字 next，然后找他们之间是否有 jump 数字，
// //如果 next 没被访问过，并且 jump 为0，或者 jump 被访问过，对 next 调用递归函数。
// //数字1的模式个数算出来后，由于 1,3,7,9 是对称的，所以乘4即可，然后再对数字2调用递归函数，
// //2,4,6,9 也是对称的，再乘4，最后单独对5调用一次，然后把所有的加起来就是最终结果了，参见代码如下：

// class Solution {
//   private int[][] jumps;
//   private boolean[] visited;

//   public int numberOfPatterns(int m, int n) {
//     jumps = new int[10][10];
//     jumps[1][3] = jumps[3][1] = 2;
//     jumps[4][6] = jumps[6][4] = 5;
//     jumps[7][9] = jumps[9][7] = 8;
//     jumps[1][7] = jumps[7][1] = 4;
//     jumps[2][8] = jumps[8][2] = 5;
//     jumps[3][9] = jumps[9][3] = 6;
//     jumps[1][9] = jumps[9][1] = jumps[3][7] = jumps[7][3] = 5;
//     visited = new boolean[10];
//     int count = 0;
//     count += DFS(1, 1, 0, m, n) * 4; // 1, 3, 7, 9 are symmetrical
//     count += DFS(2, 1, 0, m, n) * 4; // 2, 4, 6, 8 are symmetrical
//     count += DFS(5, 1, 0, m, n);
//     return count;
//   }

//   private int DFS(int num, int len, int count, int m, int n) {
//     if (len >= m)
//       count++; // only count if moves are larger than m
//     len++;
//     if (len > n)
//       return count;
//     visited[num] = true;
//     for (int next = 1; next <= 9; next++) {
//       int jump = jumps[num][next];
//       if (!visited[next] && (jump == 0 || visited[jump])) {
//         count = DFS(next, len, count, m, n);
//       }
//     }
//     visited[num] = false; // backtracking
//     return count;
//   }
// }

// public class lc351 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     // int[] digits=new int[] {2,4,3,9};
//     // int[] a=test.plusOne(digits);
//     System.out.println("Hello World");

//   }
// }
