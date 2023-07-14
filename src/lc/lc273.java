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
//////ans �е㸴�ӣ�
////class Solution {
////	  public String one(int num) {
////	    switch(num) {
////	      case 1: return "One";
////	      case 2: return "Two";
////	      case 3: return "Three";
////	      case 4: return "Four";
////	      case 5: return "Five";
////	      case 6: return "Six";
////	      case 7: return "Seven";
////	      case 8: return "Eight";
////	      case 9: return "Nine";
////	    }
////	    return "";
////	  }
////
////	  public String twoLessThan20(int num) {
////	    switch(num) {
////	      case 10: return "Ten";
////	      case 11: return "Eleven";
////	      case 12: return "Twelve";
////	      case 13: return "Thirteen";
////	      case 14: return "Fourteen";
////	      case 15: return "Fifteen";
////	      case 16: return "Sixteen";
////	      case 17: return "Seventeen";
////	      case 18: return "Eighteen";
////	      case 19: return "Nineteen";
////	    }
////	    return "";
////	  }
////
////	  public String ten(int num) {
////	    switch(num) {
////	      case 2: return "Twenty";
////	      case 3: return "Thirty";
////	      case 4: return "Forty";
////	      case 5: return "Fifty";
////	      case 6: return "Sixty";
////	      case 7: return "Seventy";
////	      case 8: return "Eighty";
////	      case 9: return "Ninety";
////	    }
////	    return "";
////	  }
////
////	  public String two(int num) {
////	    if (num == 0)
////	      return "";
////	    else if (num < 10)
////	      return one(num);
////	    else if (num < 20)
////	      return twoLessThan20(num);
////	    else {
////	      int tenner = num / 10;
////	      int rest = num - tenner * 10;
////	      if (rest != 0)
////	        return ten(tenner) + " " + one(rest);
////	      else
////	        return ten(tenner);
////	    }
////	  }
////
////	  public String three(int num) {
////	    int hundred = num / 100;
////	    int rest = num - hundred * 100;
////	    String res = "";
////	    if (hundred*rest != 0)
////	      res = one(hundred) + " Hundred " + two(rest);
////	    else if ((hundred == 0) && (rest != 0))
////	      res = two(rest);
////	    else if ((hundred != 0) && (rest == 0))
////	      res = one(hundred) + " Hundred";
////	    return res;
////	  }
////
////	  public String numberToWords(int num) {
////	    if (num == 0)
////	      return "Zero";
////
////	    int billion = num / 1000000000;
////	    int million = (num - billion * 1000000000) / 1000000;
////	    int thousand = (num - billion * 1000000000 - million * 1000000) / 1000;
////	    int rest = num - billion * 1000000000 - million * 1000000 - thousand * 1000;
////
////	    String result = "";
////	    if (billion != 0)
////	      result = three(billion) + " Billion";
////	    if (million != 0) {
////	      if (! result.isEmpty())
////	        result += " ";
////	      result += three(million) + " Million";
////	    }
////	    if (thousand != 0) {
////	      if (! result.isEmpty())
////	        result += " ";
////	      result += three(thousand) + " Thousand";
////	    }
////	    if (rest != 0) {
////	      if (! result.isEmpty())
////	        result += " ";
////	      result += three(rest);
////	    }
////	    return result;
////	  }
////	}
//
//class Solution {
//    public String numberToWords(int num) {
//    	String ans=help(num%1000);
//    	String[] v={"Thousand", "Million", "Billion"};
//    	for(int i=0;i<3;i++) {
//    		num/=1000;
//    		ans=(num%1000!=0)? help(num%1000)+" "+v[i]+" "+ans:ans;
//    	}
//    	if(ans.isEmpty())
//    		return "Zero";
////    	ans=ans.trim();
//    	while(ans.charAt(ans.length()-1)==' ')
//    		ans=ans.substring(0, ans.length()-1);
//
//    	return ans;        
//    }
//    public String help(int num) {
//    	String[]v1 = {"", "One", "Two", "Three", "Four", 
//    			"Five", "Six", "Seven", "Eight", "Nine", "Ten", 
//    			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", 
//    			"Sixteen", "Seventeen", "Eighteen", "Nineteen"};
//        String[]v2 = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
//        		"Seventy", "Eighty", "Ninety"};
//        String ans="";
//        int a=num/100,b=num%100,c=num%10;
//        ans = b < 20 ? v1[b] : v2[b / 10] + (c!=0 ? " " + v1[c] : "");
//        if (a > 0) 
//        	ans = v1[a] + " Hundred" + (b!=0 ? " " + ans : "");
//        return ans;
//    }
//}
//public class lc273 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.numberToWords(100);
//		System.out.println("Hello World");
//
//	}
//}
