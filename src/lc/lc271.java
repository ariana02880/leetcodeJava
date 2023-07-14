//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
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
//	// Encodes a list of strings to a single string.
//    public String encode(List<String> strs) {
//        String ans="";
//        StringBuilder sb=new StringBuilder();
//        for(String a:strs){
//            sb.append(a.length()).append("-").append(a);
//        }
//        return sb.toString();
//        
//    }
//
//    // Decodes a single string to a list of strings.
//    public List<String> decode(String s) {
//        List<String >ans= new ArrayList<String>();
//        while(!s.isEmpty()){
//            int idx=s.indexOf('-');
//            int size=Integer.parseInt(s.substring(0, idx));
//            //The substring begins at the specified beginIndex andextends to the character at index endIndex - 1
//            ans.add(s.substring(idx+1,idx+size+1));
//            s=s.substring(idx+size+1);
//        }
//        return ans;
//    }
//    
//    //faster
// // Encodes a list of strings to a single string.
//    public String encode(List<String> strs) {
//        StringBuilder sb = new StringBuilder();
//        for(String s : strs) {
//            sb.append(s.length()).append('/').append(s);
//        }
//        return sb.toString();
//    }
//
//    // Decodes a single string to a list of strings.
//    public List<String> decode(String s) {
//        List<String> ret = new ArrayList<String>();
//        int i = 0;
//        while(i < s.length()) {
//            int slash = s.indexOf('/', i);
//            int size = Integer.valueOf(s.substring(i, slash));
//            ret.add(s.substring(slash + 1, slash + size + 1));
//            i = slash + size + 1;
//        }
//        return ret;
//    }
//}
//
//
//public class lc271 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}