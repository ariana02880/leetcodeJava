//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
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
//class Solution {
//	public boolean canConstruct(String ransomNote, String magazine) {
//		//method one: too slow
////        Map<Character, Integer> map=new HashMap<Character, Integer>();
////        for(char a:magazine.toCharArray()){
////            map.put(a, map.get(a)==null? 1: map.get(a)+1 );
////        }
////        for(char b:ransomNote.toCharArray()){
////            if(map.get(b)==null||map.get(b)<=0)
////                return false;
////            else
////                map.put(b, map.get(b)-1);
////        }
////        return true;
//		
//		
//		//method 2:增加这两行判断会加快速度：
//		if (ransomNote == null || ransomNote.length() == 0) {
//            return true;
//        }
//        if (magazine == null || magazine.length() < ransomNote.length()) {
//            return false;
//        }
//        //在这里正式开始：
//        int magazineArr[] = new int[26];
//        for (int i = 0; i < magazine.length(); i++) {
//            magazineArr[magazine.charAt(i) - 'a'] += 1;
//        }
//
//        for (int i = 0; i < ransomNote.length(); i++) {
//            if (magazineArr[ransomNote.charAt(i) - 'a'] <= 0) {
//                return false;
//            } else {
//                magazineArr[ransomNote.charAt(i) - 'a']--;
//            }
//        }
//
//        return true;
//    }
//}
//
//
//public class lc383 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}