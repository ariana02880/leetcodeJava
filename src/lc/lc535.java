//package lc;
//import java.lang.*;
//import java.io.*;
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
//public class Codec {
//    Map<Integer,String> map=new HashMap<>();
//    int i=0;
//
//    // Encodes a URL to a shortened URL.
//    public String encode(String longUrl) {
//        map.put(i,longUrl);
//        return "http://Ariana.com/"+i++;
//    }
//
//    // Decodes a shortened URL to its original URL.
//    public String decode(String shortUrl) {
//        shortUrl=shortUrl.replace("http://Ariana.com/","");
//        int temp=Integer.parseInt(shortUrl);
//        return map.get(temp)==null? "":map.get(temp);
//    }
//}
//
//
//public class lc {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
