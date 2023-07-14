// package lintcode;
// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
// }



// //ans: 
// class ConnectingGraph3 {
//   /**
//    * @param a: An integer
//    * @param b: An integer
//    * @return: nothing
//    */
//   private int cnt;
//   private int[] end;
//   public ConnectingGraph3(int n) {
//       // initialize your data structure here.
//       end=new int[n+1];
//       end[0]=0;
//       for (int i=1;i<=n;i++){
//           end[i]=i;
//       }
//       cnt=n;
//   }
  
//   public void connect(int a, int b) {
//       // write your code here
//       int endA=find(a);
//       int endB=find(b);
//       if(endA != endB){
//           end[endA] = endB;
//           cnt--;
//       }
//   }
//   private int find(int a){
//       int x=a;
//       while(end[x]!=x){
//           x=end[x];
//       }
//       int result = x;
//       int y=a;
//       while(end[y]!=y){
//           int temp = end[y];
//           end[y]=result;
//           y=end[temp];
//       }
//       return result;

//   }

//   /**
//    * @return: An integer
//    */
//   public int query() {
//       // write your code here
//       return cnt;
//   }
// }



// public class l591 {
// 	public static void main(String arg[]) {
	
// 		System.out.println("Hello World");

// 	}
// }
