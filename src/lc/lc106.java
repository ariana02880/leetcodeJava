//package lc;
//import java.lang.*;
//import java.io.*;
// // Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
//}
// //Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
//
////my
//class Solution {
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        return help(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
//    }
//    public TreeNode help(int[] in,int l,int r, int[] post,int start,int end){
//        if(r<l|| end<start)
//            return null;
//        int mid=post[end];
//        TreeNode temp=new TreeNode(mid);
//        int idx=find(in,mid);
//        temp.left= help(in,l,idx-1,post,start,start+idx-l-1);
//        temp.right=help(in,idx+1,r,post,start+idx-l,end-1);
//        return temp;
//    }
//    public int find (int[] in, int target){
//        for(int i=0;i<in.length;i++){
//            if(target==in[i])
//                return i;
//        }
//        return -1;
//    }
//}
//public class lc106 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] in= {1,9,2,3,15,20,7};
//		int [] po= {1,2,9,15,7,20,3};
//		Object a=test.buildTree(in,po);
//		System.out.println("Hello World");
//
//	}
//}
