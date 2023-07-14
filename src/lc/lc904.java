//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//
//import com.sun.javafx.image.IntPixelAccessor;
//// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
//}
////Definition for a binary tree node.
//class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
//}
////correct:
////class Solution {
////    public int totalFruit(int[] tree) {
////        Set<Integer> set = new HashSet<>();
////        int res = 0, i, j;
////        for (i = 0, j = 0; j < tree.length;) {
////            if (set.size() > 2) {
////                j =j-2;
////                res = Math.max(res, j - i+1);
////
////                //set.remove(tree[i]);
////                set.clear();
////                set.add(tree[j]);
////                int t = j;
////                while (t < tree.length && tree[t] == tree[j]) 
////                	t--;
////                i = t+1;  //
////                j = i;
////            } else {
////                set.add(tree[j]);
////                j++;
////            }
////        }
////        if (set.size() <= 2) 
////        	res = Math.max(res, j - i); 
////        if (set.size() > 2) {
////            j=j-2;
////            res = Math.max(res, j - i+1);
////        }
////        return res;
////    }
////}
//
////my
//class Solution {
//    public int totalFruit(int[] tree) {
//        Set<Integer> set=new HashSet<>();
//        int ans=0,i,j;
//        for(i=0,j=0;j<tree.length;){
//            if(set.size()<=2){
//                set.add(tree[j]);
//                j++;
//            }
//            else{
//                j=j-2;
//                ans=Math.max(ans,j-i+1);
//                int tt=j;
//                set.clear();
//                set.add(tree[j]);
//                while(tt<tree.length&& tree[tt]==tree[j])
//                    tt--;
//                i=tt+1;
//                j=i;
//            }
//        }
//        
//        if(set.size()<=2)
//            ans=Math.max(ans,j-i);
//        if(set.size()>2){
//            j=j-2;
//            ans=Math.max(ans,j-i+1);
//        }
//        return ans;
//    }
//}
//public class lc904 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		int[] tree= {3,3,3,3,3,4};
//		int aa=test.totalFruit(tree);
//
//		System.out.println("Hello World");
//
//	}
//}
//
