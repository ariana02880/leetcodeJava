// package lintcode;
// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
// }





// //ans
// class Solution {
//    public List<String> wordBreak(String s, Set<String> dict) {
//        Map<String, List<String>> done = new HashMap<>();
//        done.put("", new ArrayList<>());
//        done.get("").add("");

//        return dfs(s, dict, done);
//    }

//    List<String> dfs(String s, Set<String> dict, Map<String, List<String>> done) {
//        if (done.containsKey(s)) {
//            return done.get(s);
//        }
//        List<String> ans = new ArrayList<>();

//        for (int len = 1; len <= s.length(); len++) {  //��s �ָ��s1 s2  ����s1����Ϊlen
//            String s1 = s.substring(0, len);
//            String s2 = s.substring(len);

//            if (dict.contains(s1)) {
//                List<String> s2_res = dfs(s2, dict, done);
//                for (String item : s2_res) {
//                    if (item == "") {
//                        ans.add(s1);
//                    } else {
//                        ans.add(s1 + " " + item);
//                    }
//                }
//            }
//        }
//        done.put(s, ans);
//        return ans;
//    }
// }
// public class l582 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		String s="lintcode";
// 		HashSet<String> ss= new HashSet<>();
// 		ss.add("de");
// 		ss.add("ding");
// 		ss.add("co");ss.add("code"); ss.add("lint");
// 		Object a=test.wordBreak(s, ss);
// 		System.out.println("Hello World");

// 	}
// }
