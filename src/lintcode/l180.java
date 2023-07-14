//package lintcode;
//package lc;
//import java.lang.*;
//import java.io.*;
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
//
//
//
//
//////ans
////class Solution {
////    private String parseInteger(String str) {
////        int n = Integer.parseInt(str);
////        if (str.equals("") || str.equals("0")) {
////            return "0";
////        }
////        String binary = "";
////        while (n != 0) {
////            binary = Integer.toString(n % 2) + binary;
////            n = n / 2;
////        }
////        return binary;
////    }
////    
////    private String parseFloat(String str) {
////        double d = Double.parseDouble("0." + str);
////        String binary = "";
////        HashSet<Double> set = new HashSet<Double>();
////        while (d > 0) {
////            if (binary.length() > 32 || set.contains(d)) {
////                return "ERROR";
////            }
////            set.add(d);
////            d = d * 2;
////            if (d >= 1) {
////                binary = binary + "1";
////                d = d - 1;
////            } 
////            else {
////                binary = binary + "0";
////            }
////        }
////        return binary;
////    }
////    
////    public String binaryRepresentation(String n) {
////        if (n.indexOf('.') == -1) {
////            return parseInteger(n);
////        }
////        String[] params = n.split("\\.");
////        String flt = parseFloat(params[1]);
////        if (flt == "ERROR") {
////            return flt;
////        }
////        if (flt.equals("0") || flt.equals("")) {
////            return parseInteger(params[0]);
////        }
////        return parseInteger(params[0]) + "." + flt;
////    }
////}
//
////my
//class Solution {
//    public String binaryRepresentation(String n) {
//        n=n.trim();
//        if(n.indexOf(".")==-1){//no double
//            return help1(n);
//        }
//        String[] num=n.split("\\.",2);
//        String dd=help2(num[1]);
//        if(dd=="ERROR")
//            return dd;
//        if(dd==""||dd=="0")
//            return help1(num[0]);
//            
//            
//        return help1(num[0])+"."+dd;
//    }
//    public String help1(String s){
//        int n=Integer.valueOf(s);
//        String ans="";
//        if(s.equals("")||s.equals("0"))
//            return "0";
//        while(n!=0){
//            ans=Integer.toString(n%2)+ans;
//            n=n/2;
//        }
//        return ans;
//    }
//    public String help2(String s){
//        Double n= Double.valueOf("0."+s);
//        String ans="";
//        HashSet<Double> set= new HashSet<>();
//        while(n!=0){
//            if(set.contains(n)||ans.length()>32)
//                return "ERROR";
//            set.add(n);
//            n=n*2;
//            if(n>=1){
//                ans=ans+"1";
//                n=n-1;
//            }
//            else{
//                ans=ans+"0";
//            }
//            
//        }
//        return ans;
//    }
//}
//public class l180 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int [] t= {0,1,3,5,75};
//		Object a=test.binaryRepresentation("0.5");
//		System.out.println("Hello World");
//
//	}
//}
