// package lc;

// import java.util.HashMap;

// // class Solution {
// //     private List<Integer> lst = new ArrayList<>();
// //     public void inorderTraversal(TreeNode root)
// //     {
// //         if(root!=null)
// //         {
// //             inorderTraversal(root.left,lst);
// //             lst.add(root.val);
// //             inorderTraversal(root.right,lst);
// //         }
// //     }
// //     public TreeNode buildTree(int low,int high)
// //     {
// //         if(low > high)  
// //             return null;
// //         int mid = (low+high)/2;
// //         TreeNode root = new TreeNode(lst.get(mid));
// //         root.left = buildTree(lst,low,mid-1);
// //         root.right = buildTree(lst,mid+1,high);
// //         return root;
// //     }
// //     public TreeNode balanceBST(TreeNode root) {
// //         inorderTraversal(root);
// //         root = buildTree(0,lst.size()-1);
// //         return root;
// //     }
// // }

// public class lc1382 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		//int[] digits=new int[] {2,4,3,9};
// 		//int[] a=test.plusOne(digits);
// 		System.out.println("Hello World");
		

// 	}
// }
