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





// //my
// class Solution {
//    public StringBuilder sb=new StringBuilder(); 
//    public String serialize(TreeNode root) {
//        // write your code here
//        help1(root);
//        return sb.toString().trim();
//    }
//    public void help1(TreeNode root){
//        if(root==null){
//            sb.append("#");
//            sb.append(" ");
//            return;
//        }
//        sb.append(Integer.toString(root.val));
//        sb.append(" ");
//        help1(root.left);
//        help1(root.right);
//    }
   
//    public TreeNode t;
//    public int idx=0;
//    public TreeNode deserialize(String data) {
//        if(data==null||data.length()==0)
//            return null;
//        String[] d=data.split(" ");
//        t=help2(d);
//        return t;
//    }
//    public TreeNode help2(String[] data){
//        if(idx>=data.length){
//            return null;
//        }
//        if(data[idx].equals("#")){
//            idx++;
//            return null;
//        }
//        TreeNode nt=new TreeNode(Integer.valueOf(data[idx]));
//        idx++;
//        nt.left=help2(data);
//        nt.right=help2(data);
//        return nt;
//    }
// }
// public class l7 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		TreeNode a=test.deserialize("3 9 20 # # 15 # # 90 # #");
// 		String b=test.serialize(a);
// 		System.out.println("Hello World");

// 	}
// }
