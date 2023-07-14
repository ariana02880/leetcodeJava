//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
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
//	public List<List<String>> groupStrings(String[] strings) {
//		List<List<String>> res= new ArrayList<List<String>>();
//		Map<String, ArrayList<String>> m = new HashMap<String, ArrayList<String>>();
//        for (String a : strings) {
//            String t = "";
//            for (char c : a.toCharArray()) {
//                t += String.valueOf((c + 26 - a.charAt(0)) % 26) + ",";
//            }
//            if(m.containsKey(t))
//            	m.get(t).add(a);
//            else {
//            	ArrayList<String> temp=new ArrayList<String>();
//            	temp.add(a);
//            	m.put(t, temp);
//            }
//        }
//        res.addAll(m.values());
//        return res;
//    }
//	//faster:
//	public List<List<String>> groupStrings2(String[] strings) {
//        List<List<String>> res= new ArrayList<List<String>>();
//		HashMap<String, ArrayList<String>> m = new HashMap<String, ArrayList<String>>();
//
//        for (String a : strings) {
//            StringBuilder sb = new StringBuilder();
//            for (char c : a.toCharArray()) {
//                sb.append((c + 26 - a.charAt(0)) % 26);
//                sb.append(",");
//            }
//            String t =sb.toString();
//            if(m.containsKey(t))
//            	m.get(t).add(a);
//            else {
//            	m.put(t, new ArrayList<>());
//                m.get(t).add(a);
//            }
//        }
//        res.addAll(m.values());
//        
//        return res;
//    }
//}
//
//
//public class lc249 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}