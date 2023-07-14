// import java.util.HashMap;

// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

// import com.sun.javafx.image.IntPixelAccessor;

// // Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
// }

// //Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }

// public class Solution {
//   public int trap(int[] height) {
//       int res = 0, mx = 0, n = height.length;
//       int[] l = new int[n];
//       int[] r = new int[n];
//       for (int i = 0; i < n; ++i) {
//           l[i] = mx;
//           mx = Math.max(mx, height[i]);
//       }
//       mx = 0;
//       for (int i = n-1; i >= 0; i--) {
//           r[i] = mx;
//           mx = Math.max(mx, height[i]);
//       }
      
//       for( int i=0; i<n; i++) {
//           if( height[i] < Math.min(l[i], r[i]) ){
//               res += Math.min(l[i], r[i]) - height[i];
//           }
//       }
//       return res;
//   }
// }


// public class lc42 {
// public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int[] digits=new int[] {2,0,2};
// 		int a=test.trap(digits);
// 		System.out.println("Hello World");

// 	}
// }
