// package lc;

// import java.util.TreeMap;



// class Solution {
//   private int[] array;
//   private int[] original;

//   Random rand = new Random();

//   private int randRange(int min, int max) {
//       return rand.nextInt(max - min) + min;
//   }

//   private void swapAt(int i, int j) {
//       int temp = array[i];
//       array[i] = array[j];
//       array[j] = temp;
//   }

//   public Solution(int[] nums) {
//       array = nums;
//       original = nums.clone();
//   }
  
//   public int[] reset() {
//       array = original;
//       original = original.clone();
//       return original;
//   }
  
//   public int[] shuffle() {
//       for (int i = 0; i < array.length; i++) {
//           swapAt(i, randRange(i, array.length));
//       }
//       return array;
//   }
// }



// public class lc384 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     // int a=test.longestUnivaluePath(root);
//     // System.out.println("Hello World");

//   }
// }
