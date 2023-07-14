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



// //ans
// public class Solution {
//   /**
//    * @param n: An integer
//    * @param edges: a list of undirected edges
//    * @return: true if it's a valid tree, or false
//    */
//   class unionFind{
//       public int[] father;
//       unionFind(int n){
//           father = new int[n];
//           for(int i=0;i<n;i++){
//               father[i] = i;
//           }
//       }
//       public int findFather(int index){
//           int id = index;
//           while(id != father[id]){
//               id = father[id];
//           }
//           int result=id;
//           id = index;
//           while( id != father[id]){
//               int temp = father[id];
//               father[id] = result;
//               id=temp;
//           }
//           return result;
//       }
//       public void union(int a, int b){
//           int fatherA = findFather(a);
//           int fatherB = findFather(b);
//           father[fatherA] = fatherB;
//       }
//   }
//   public boolean validTree(int n, int[][] edges) {
//       // write your code here
//       if( n == 0 ){
//           return false;
//       }
//       int count = n;
//       unionFind uf= new unionFind(n);
//       for(int i=0;i<edges.length;i++){
//           int a = edges[i][0];
//           int b = edges[i][1];
//           if(uf.findFather(a) == uf.findFather(b)){
//               return false;
//           }
//           else {
//               uf.union(a,b);
//               count--;
//           }
//       }
//       if( count != 1){
//           return false;
//       }
//       return true;

//   }
// }

// public class l178 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
		
// 		Point[] t= {new Point(0,0),new Point(1,1),new Point(1,0),new Point(0,1)};
// 		Object a=test.numIslands2(2,2,t);
// 		System.out.println("Hello World");

// 	}
// }
