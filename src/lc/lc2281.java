// package lc;

// import java.util.Arrays;
// import java.util.Stack;

// class Solution {
//     public int totalStrength(int[] strength) {
//         int mod = (int)1e9 + 7, n = strength.length;
        
//         // Get the first index of the non-larger value to strength[i]'s right.
//         Stack<Integer> stack = new Stack<>();
//         int rightIndex[] = new int[n];
//         Arrays.fill(rightIndex, n);
//         for (int i = 0; i < n; ++i) {
//             while (!stack.isEmpty() && strength[stack.peek()] >= strength[i]) {
//                 rightIndex[stack.pop()] = i;
//             }
//             stack.add(i);
//         }
        
//         // Get the first index of the smaller value to strength[i]'s left.
//         int leftIndex[] = new int[n];
//         Arrays.fill(leftIndex, -1);
//         stack.clear();
//         for (int i = n - 1; i >= 0; --i) {
//             while (!stack.isEmpty() && strength[stack.peek()] > strength[i])
//                 leftIndex[stack.pop()] = i;
//             stack.add(i);
//         }

//         // Get the prefix sum of the prefix sum array of strength.
//         long answer = 0;
//         long[] presumOfPresum = new long[n + 2];
//         for (int i = 0; i < n; ++i)
//             presumOfPresum[i + 2] = (presumOfPresum[i + 1] + strength[i]) % mod;
//         for (int i = 1; i <= n; ++i)
//             presumOfPresum[i + 1] = (presumOfPresum[i + 1] + presumOfPresum[i]) % mod;
        
//         // For each element in strength, we get the value of R_term - L_term.
//         for (int i = 0; i < n; ++i) {
//             // Get the left index and the right index.
//             int leftBound = leftIndex[i], rightBound = rightIndex[i];

//             // Get the leftCount and rightCount (marked as L and R in the previous slides)
//             int leftCount = i - leftBound, rightCount = rightBound - i;
            
//             // Get posPresum and negPresum.
//             long negPresum = (presumOfPresum[i + 1] - presumOfPresum[i - leftCount + 1]) % mod;
//             long posPresum = (presumOfPresum[i + rightCount + 1] - presumOfPresum[i + 1]) % mod;

//             // The total strength of all subarrays that have strength[i] as the minimum.
//             answer = (answer + (posPresum * leftCount - negPresum * rightCount) % mod * strength[i] % mod) % mod;
//         }

//         return (int)(answer + mod) % mod;
//     }
// }

// public class lc2281 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		int[] input = {1,3,1,2};
// 		Object a=test.totalStrength(input);
// 		System.out.println("Hello World");

// 	}
// }