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
//
//class Solution {
//    public int getImportance(List<Employee> employees, int id) {
//        Map<Integer, Employee> m=new HashMap<>();
//        List<Integer> sub=new ArrayList<>();
//        for(Employee aa:employees) {
//        	if(!m.containsKey(aa.id))
//        		m.put(aa.id, aa);
//        }
//        return help(m, id);
//    }
//    public int help(Map<Integer, Employee> m,int id) {
//    	int ans=0;
//    	if(m.containsKey(id)) {
//    		ans+=m.get(id).importance;
//    		for(Integer aa:m.get(id).subordinates) {
//    			ans+=help(m, aa);
//    		}
//    	}
//    	return ans;
//    }
//}
//public class lc690 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
