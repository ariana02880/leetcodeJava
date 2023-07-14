//import java.util.HashMap;
//import com.sun.javafx.image.IntPixelAccessor;
//import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
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
////class Solution {
////	public int removeDuplicates(int[] nums) {
////		if (nums.length <= 2) 
////			return nums.length;
////		int pre = 0, cur = 1, count = 1;
////		while (cur < nums.length) {
////		    if (nums[pre] == nums[cur] && count == 0) 
////		    	++cur;
////		    else {
////		        if (nums[pre] == nums[cur]) 
////		        	--count;
////		        else 
////		        	count = 1;
////		        nums[++pre] = nums[cur++];
////		    }
////		}
////		return pre + 1;
////	}
////}
//
////my
//class Solution {
//    public int removeDuplicates(int[] nums) {
//    	 int i=0,j=0;
//         int tag=1;
//         while(j<nums.length){
//             if(i==j){
//                 nums[i]=nums[j++];
//             }
//             else{
//                 if(nums[j]==nums[i]){
//                     if(tag==1){
//                         tag=0;
//                         nums[++i]=nums[j++];
//                     }
//                     else{
//                         j++;
//                     }
//                         
//                 }
//                 else{
//                     tag=1;
//                     nums[++i]=nums[j++];
//                 }
//             }
//         }
//         return i+1;
//    }
//}
//
//
//public class lc80 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] tree= {1};
//		int aa=test.removeDuplicates(tree);
//		System.out.println("Hello World");
//
//	}
//}
//
