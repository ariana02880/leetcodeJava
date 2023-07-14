// package lc;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;



// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// public class Codec {
//   public String rserialize(TreeNode root, String str) {
//   // Recursive serialization.
//   if (root == null) {
//     str += "null,";
//   } else {
//     str += str.valueOf(root.val) + ",";
//     str = rserialize(root.left, str);
//     str = rserialize(root.right, str);
//   }
//   return str;
// }

// // Encodes a tree to a single string.
// public String serialize(TreeNode root) {
//   return rserialize(root, "");
// }
  
  
  
  
// public TreeNode rdeserialize(List<String> l) {
//   // Recursive deserialization.
//   if (l.get(0).equals("null")) {
//     l.remove(0);
//     return null;
//   }

//   TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
//   l.remove(0);
//   root.left = rdeserialize(l);
//   root.right = rdeserialize(l);

//   return root;
// }

// // Decodes your encoded data to tree.
// public TreeNode deserialize(String data) {
//   String[] data_array = data.split(",");
//   List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
//   return rdeserialize(data_list);
// }
  
// }

// // Your Codec object will be instantiated and called as such:
// // Codec ser = new Codec();
// // Codec deser = new Codec();
// // TreeNode ans = deser.deserialize(ser.serialize(root));



// public class lc297 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();
//     int[][] ss = {{1,2,3},{2,5,3}};
//     Object a = test.getSkyline(ss);
//     System.out.println("Hello World");

//   }
// }
