// package lc;

// import java.lang.*;
// import java.sql.Array;
// import java.io.*;


// // Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode() {
//     }

//     TreeNode(int val) {
//         this.val = val;
//     }

//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

// class Pair<T1, T2> {
//     private T1 key;
//     private T2 value;

//     Pair(T1 k, T2 v) {

//         key = k;
//         value = v;
//     }
//     public T1 getKey() {
//         return key;
//     }

//     public T2 getValue() {
//         return value;
//     }

// }


// // way 1: 
// // class Solution {
// //     public TreeNode str2tree(String s) {
// //         if (s == null || s.length() == 0)
// //             return null;
// //         int firstParen = s.indexOf("(");
// //         int val = firstParen == -1 ? Integer.parseInt(s) : Integer.parseInt(s.substring(0, firstParen));
// //         TreeNode cur = new TreeNode(val);

// //         if (firstParen == -1)
// //             return cur;
// //         int start = firstParen, leftParenCount = 0;
// //         for (int i = start; i < s.length(); i++) {
// //             if (s.charAt(i) == '(')
// //                 leftParenCount++;
// //             else if (s.charAt(i) == ')')
// //                 leftParenCount--;
// //             if (leftParenCount == 0 && start == firstParen) {
// //                 cur.left = str2tree(s.substring(start + 1, i));
// //                 start = i + 1;
// //             } else if (leftParenCount == 0)
// //                 cur.right = str2tree(s.substring(start + 1, i));
// //         }
// //         return cur;
// //     }
// // }




// // way 2:
// class Solution {
//     public TreeNode str2tree(String s) {
//         return this.str2treeInternal(s, 0).getKey();
//     }
    
//     public Pair<Integer, Integer> getNumber(String s, int index) {
        
//         boolean isNegative = false;
        
//         // A negative number
//         if (s.charAt(index) == '-') {
//             isNegative = true;
//             index++;
//         }
            
//         int number = 0;
//         while (index < s.length() && Character.isDigit(s.charAt(index))) {
//             number = number * 10 + (s.charAt(index) - '0');
//             index++;
//         }
        
//         return new Pair<Integer, Integer>(isNegative ? -number : number, index);
//     } 
    
//     public Pair<TreeNode, Integer> str2treeInternal(String s, int index) {
        
//         if (index == s.length()) {
//             return new Pair<TreeNode, Integer>(null, index);
//         }
        
//         // Start of the tree will always contain a number representing
//         // the root of the tree. So we calculate that first.
//         Pair<Integer, Integer> numberData = this.getNumber(s, index);
//         int value = numberData.getKey();
//         index = numberData.getValue();
        
//         TreeNode node = new TreeNode(value);
//         Pair<TreeNode, Integer> data;
        
//         // Next, if there is any data left, we check for the first subtree
//         // which according to the problem statement will always be the left child.
//         if (index < s.length() && s.charAt(index) == '(') {
//             data = this.str2treeInternal(s, index + 1);
//             node.left = data.getKey();
//             index = data.getValue();
//         }
            
        
//         // Indicates a right child
//         if (node.left != null && index < s.length() && s.charAt(index) == '(') {
//             data = this.str2treeInternal(s, index + 1);
//             node.right = data.getKey();
//             index = data.getValue();
//         }
            
        
//         return new Pair<TreeNode, Integer>(node, index < s.length() && s.charAt(index) == ')' ? index + 1 : index);
//     }
// }

// public class lc536 {
//     public static void main(String arg[]) {
//         Solution test = new Solution();
//         String words = "-4(2(3)(1))(6(5))";
//         Object a = test.str2tree(words);

//         System.out.println("Hello World");

//     }
// }
