// package lc;
// import java.util.Arrays;

// // Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
// }



// class Solution {
//   public int coinChange(int[] coins, int amount) {
//     int max = amount + 1;
//     int[] dp = new int[amount + 1];
//     Arrays.fill(dp, max);
//     dp[0] = 0;
//     for (int i = 1; i <= amount; i++) {
//       for (int j = 0; j < coins.length; j++) {
//         if (coins[j] <= i) {
//           dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
//         }
//       }
//     }
//     return dp[amount] > amount ? -1 : dp[amount];
//   }
// }




// public class lc322{
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		int A[]= {1,2,5};
// 		Object a=test.coinChange(A,11);
// 		System.out.println("Hello World");

// 	}
// }
