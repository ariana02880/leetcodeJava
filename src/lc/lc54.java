//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;
//
//import com.sun.javafx.image.IntPixelAccessor;
//
// // Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
//}
//
// //Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
//
//
//
//class Solution2 {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        int m=matrix.length;
//        List<Integer> ans=new LinkedList<Integer>();
//        if(m==0)
//            return ans;
//        int n=matrix[0].length;
//        if(n==0)
//            return ans;
//        int a=0,b=m-1,c=0,d=n-1;
//        while(true){
//            for(int i=a;i<=b;i++)
//                ans.add(matrix[c][i]);
//            if(++c>d)
//                break;
//            for(int j=c;j<=d;j++)
//                ans.add(matrix[j][d]);
//            if(--d<c)
//                break;
//            for(int i=d;i>=c;i--)
//                ans.add(matrix[b][i]);
//            if(--b<a)
//                break;
//            for(int j=b;j>=a;j--)
//                ans.add(matrix[j][a]);
//            if(a++>b)
//                break;
//        }
//        return ans;
//    }
//}
//class Solution {
//	public List<Integer> spiralOrder(int[][] matrix) {
//        int m=matrix.length;
//        List<Integer> res  =  new LinkedList<Integer>();
//        if(m==0) return res;
//        int n=matrix[0].length;
//        int u=0,d=m-1,l=0,r=n-1;
//        while(true){
//            for(int col=l;col<=r;col++) 
//            	res.add(matrix[u][col]);
//            if(++u>d) 
//            	break;
//            for(int row=u;row<=d;row++) 
//            	res.add(matrix[row][r]);
//            if(--r<l) 
//            	break;
//            for(int col=r;col>=l;col--) 
//            	res.add(matrix[d][col]);
//            if(--d<u) 
//            	break;
//            for(int row=d;row>=u;row--) 
//            	res.add(matrix[row][l]);
//            if(++l>r) 
//            	break;
//        }
//        return res;
//    }
//}
//
//
//
//public class lc54 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		int a=test.longestUnivaluePath(root);
//		System.out.println("Hello World");
//
//	}
//}
