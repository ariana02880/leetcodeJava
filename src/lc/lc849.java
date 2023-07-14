// package lc;

// import com.sun.org.glassfish.gmbal.ParameterNames;

// import javafx.scene.Parent;
// import sun.reflect.generics.tree.Tree;

// import java.lang.*;
// import java.io.*;


// class Solution {
//   public int maxDistToClosest(int[] seats) {
//       int N = seats.length;
//       int[] left = new int[N], right = new int[N];
//       Arrays.fill(left, N);
//       Arrays.fill(right, N);

//       for (int i = 0; i < N; ++i) {
//           if (seats[i] == 1) 
//               left[i] = 0;
//           else if (i > 0) 
//               left[i] = left[i-1] + 1;
//       }

//       for (int i = N-1; i >= 0; --i) {
//           if (seats[i] == 1) 
//               right[i] = 0;
//           else if (i < N-1) 
//               right[i] = right[i+1] + 1;
//       }

//       int ans = 0;
//       for (int i = 0; i < N; ++i)
//           if (seats[i] == 0)
//               ans = Math.max(ans, Math.min(left[i], right[i]));
//       return ans;
//   }
// }



// public class lc849 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }
