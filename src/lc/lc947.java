// import java.util.HashMap;
// import com.sun.javafx.image.IntPixelAccessor;
// // Definition for singly-linked list.

// // union find

// class Solution {
//   private final Map<Integer, String> rows = new HashMap<>();
//   private final Map<Integer, String> cols = new HashMap<>();
//   private Map<String, String> union;
//   private int rootsTotal = 0;
//   private int stonesTotal = 0;

//   public int removeStones(int[][] stones) {
//       union = new HashMap<>();
//       height = new HashMap<>();

//       stonesTotal = stones.length;
//       rootsTotal = stones.length;
//       for (int[] stone : stones) {
//           int i = stone[0];
//           int j = stone[1];
//           String index = i + " " + j;
//           union.put(index, index);
//           if (rows.putIfAbsent(i, index) != null) {
//               union(index, rows.get(i));
//           }
//           if (cols.putIfAbsent(j, index) != null) {
//               union(index, cols.get(j));
//           }
//       }
//       return stonesTotal - rootsTotal;
//   }

//   private String root(String i) {
//       while (union.get(i) != i) {
//           i = union.get(i);
//       }
//       return i;
//   }

//   private void union(String i, String j) {
//       if (!connected(i, j)) {
//           String rootI = root(i);
//           String rootJ = root(j);
//           union.put(rootI, rootJ);
//           rootsTotal--;
//       }
//   }

//   private boolean connected(String i, String j) {
//       String rootI = root(i);
//       String rootJ = root(j);
//       return rootI.equals(rootJ);
//   }
// }





// public class lc947 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		//int[] digits=new int[] {2,4,3,9};
// 		//int[] a=test.plusOne(digits);
// 		System.out.println("Hello World");
		

// 	}
// }
