// package lc;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
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


// class Solution {
//   public int maximumPopulation(int[][] logs) {
//       int a[]=new int[101];
//       for(int i=0;i<logs.length;i++)
//       {
//           a[logs[i][0] - 1950]++;
//           a[logs[i][1] - 1950]--;
//       }
//       for(int i=1;i<a.length;i++)
//       {
//           a[i]=a[i]+a[i-1];
//       }
//       int max=0;
//       int index=0;
//       for(int i=0;i<a.length;i++)
//       {
//           if(a[i]>max)
//           {
//           index=i+1950;
//           max=a[i];
//           }
//       }
//       return (index);
//   }
// }




// public class lc1854 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
//     int [][] aa = {{1950,1961},{1960,1971},{1970,1981}};

// 		int a = test.maximumPopulation(aa);
// 		System.out.println("Hello World");

// 	}
// }