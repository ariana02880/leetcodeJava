// package lc;

// import java.util.TreeMap;

// class Solution {
//   public int oddEvenJumps(int[] A) {
//     TreeMap<Integer, Integer> map = new TreeMap<>();
//     boolean[] odd = new boolean[A.length];
//     boolean[] even = new boolean[A.length];
//     odd[A.length - 1] = true;
//     even[A.length - 1] = true;
//     map.put(A[A.length - 1], A.length - 1);
//     for (int i = A.length - 2; i >= 0; i--) {
//       Integer oddJump = map.ceilingKey(A[i]);
//       if (oddJump != null && even[map.get(oddJump)])
//         odd[i] = true;
//       Integer evenJump = map.floorKey(A[i]);
//       if (evenJump != null && odd[map.get(evenJump)])
//         even[i] = true;
//       // map add element
//       map.put(A[i], i);
//     }
//     int count = 0;
//     for (int i = 0; i < A.length; i++) {
//       if (odd[i])
//         count++;
//     }
//     return count;
//   }
// }

// public class lc975 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     // int a=test.longestUnivaluePath(root);
//     // System.out.println("Hello World");

//   }
// }
