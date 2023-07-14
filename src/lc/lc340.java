//import java.util.HashMap;
//import com.sun.javafx.image.IntPixelAccessor;
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
////my
//class Solution2 {
//    public int lengthOfLongestSubstringKDistinct(String s, int k) {
//        int[] map=new int[256];
//        int left=0,right=0;
//        int count=0;
//        int ans=0;
//        for(right=0;right<s.length();right++){
//            if(map[s.charAt(right)]++==0)
//                count++;
//            while(count>k){
//                if(map[s.charAt(left++)]--==1)
//                    count--;
//            }
//            ans=Math.max(ans,right-left+1);
//        }
//        return ans;
//    }
//}
//class Solution {
//	public int lengthOfLongestSubstringKDistinct(String s, int k) {
//        int res = 0;
//        int [] map = new int[256];
//        int walker = 0;
//        int runner = 0;
//        int count = 0;
//        while(runner < s.length()){
//            if(map[s.charAt(runner++)]++ == 0){
//                count++;
//            }
//            while(count > k){
//                if(map[s.charAt(walker++)]-- == 1){
//                    count--;
//                }
//            }
//            res = Math.max(res, runner - walker);
//        }
//        return res;
//    }
//}
//
//
//public class lc340 {
//	public static void main(String arg[]) {
//		Solution2 test=new Solution2();
//		
//		int[] digits=new int[] {2,4,3,9};
//		int a=test.lengthOfLongestSubstringKDistinct("a", 2);
//		System.out.println("Hello World");
//
//	}
//}
