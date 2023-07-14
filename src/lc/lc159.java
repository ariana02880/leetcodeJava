// import java.util.HashMap;
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

// // delete the minima index, delete the character that we haven't seen it for a while.
// class Solution {
//   public int lengthOfLongestSubstringTwoDistinct(String s) {
//     int n = s.length();
//     if (n < 3) return n;

//     // sliding window left and right pointers
//     int left = 0;
//     int right = 0;
//     // hashmap character -> its rightmost position
//     // in the sliding window
//     HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

//     int max_len = 2;

//     while (right < n) {
//       // when the slidewindow contains less than 3 characters
//       hashmap.put(s.charAt(right), right++);

//       // slidewindow contains 3 characters
//       if (hashmap.size() == 3) {
//         // delete the leftmost character
//         int del_idx = Collections.min(hashmap.values());
//         hashmap.remove(s.charAt(del_idx));
//         // move left pointer of the slidewindow
//         left = del_idx + 1;
//       }

//       max_len = Math.max(max_len, right - left);
//     }
//     return max_len;
//   }
// }



// public class lc159 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		//int[] digits=new int[] {2,4,3,9};
// 		//int[] a=test.plusOne(digits);
// 		System.out.println("Hello World");
		

// 	}
// }
