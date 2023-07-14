// package lc;

// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
// }

// class Solution {
//   class uf {
//       public int [] father;
//       uf(int n){
//           father = new int[n];
//           for( int i = 0;i<n ;i++){
//               father[i] = i;
//           }
//       }
//       int find(int idx) {
//           int ans=idx;
//           int temp = idx;
//           while(father[temp] != temp){
//               temp = father[temp];
//           }
//           ans = temp;
//           while(father[idx] != idx) {
//               father[idx] = ans;
//               idx = father[idx];
//           }
//           return ans;
//       }
//       boolean canMerge (int x,int y){
//           int ansX = find(x);
//           int ansY = find(y);
//           if(ansX !=ansY){
//               father[ansX] = ansY;
//               return true;
//           }
//           return false;
//       }
//   }
//   public int countComponents(int n, int[][] edges) {
//       int count = n ;
//       uf unionFind = new uf(n);
//       for (int i=0;i<edges.length; i++){

//               if(unionFind.canMerge(edges[i][0], edges[i][1])){
//                   count --;
//               }
          
//       }
//       return count;
//   }
// }


// public class lc323{
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		int A[]= {-1,-2,2,4};
// 		Object a=test.canReorderDoubled(A);
// 		System.out.println("Hello World");

// 	}
// }
