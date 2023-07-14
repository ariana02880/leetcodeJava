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
//public class lc609 {
////	public class Solution {
////	    public List < List < String >> findDuplicate(String[] paths) {
////	        HashMap < String, List < String >> map = new HashMap < > ();
////	        for (String path: paths) {
////	            String[] values = path.split(" ");
////	            for (int i = 1; i < values.length; i++) {
////	                String[] name_cont = values[i].split("\\(");
////	                name_cont[1] = name_cont[1].replace(")", "");
////	                List < String > list = map.getOrDefault(name_cont[1], new ArrayList < String > ());
////	                list.add(values[0] + "/" + name_cont[0]);
////	                map.put(name_cont[1], list);
////	            }
////	        }
////	        List < List < String >> res = new ArrayList < > ();
////	        for (String key: map.keySet()) {
////	            if (map.get(key).size() > 1)
////	                res.add(map.get(key));
////	        }
////	        return res;
////	    }
////	}
//	//my
//	class Solution {
//	    public List<List<String>> findDuplicate(String[] paths) {
//	    	Map<String, List<String>> map=new HashMap<>();
//	        for(String aa:paths) {
//	        	String[] path=aa.split(" ");
//	        	for(int i=1;i<path.length;i++) {
//	        		String [] files=path[i].split("\\(");
//	        		files[1]=files[1].replace("\\)", "");
//	        		List<String> target= map.getOrDefault(files[1], new ArrayList<>());
//	        		target.add(path[0]+"/"+files[0]);
//	        		map.put(files[1], target);
//	        	}
//	        }
//	        
//	        List<List<String>> ans=new ArrayList<>();
//	        for(String aa: map.keySet()) {
//	        	if(map.get(aa).size()>1) {
//	        		ans.add(map.get(aa));
//	        	}
//	        }
//	        return ans;
//	    }
//	}
//	
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		Object a=test.plusOne(digits);
//		System.out.println("Hello World");
//
//	}
//}
