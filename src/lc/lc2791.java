// package lc;

// import java.util.*;
// import java.lang.*;
// import java.io.*;
// // https://leetcode.com/problems/count-paths-that-can-form-a-palindrome-in-a-tree/discuss/3804246/Simple-DFS-solution-in-C%2B%2B-java-and-python
// class Solution {
//     private long dfs(int x, int mask, String s, List<List<Integer>> con, Map<Integer, Integer> have) {
//        long r = 0;
//        if (x != 0) {
//            mask ^= 1 << (s.charAt(x) - 'a');
//            for (int i = 1 << 25; i > 0; i >>= 1) {
//                if (have.containsKey(mask ^ i)) {
//                    r += have.get(mask ^ i);
//                }
//            }
//            r += have.getOrDefault(mask, 0);
//            have.put(mask, have.getOrDefault(mask, 0) + 1);
//        }
//        for (int y : con.get(x)) {
//            r += dfs(y, mask, s, con, have);
//        }
//        return r;
//    }
// // parent = [-1,0,0,1,1,2], s = "acaabc"
//    public long countPalindromePaths(List<Integer> parent, String s) {
//        int n = s.length();
//        List<List<Integer>> con = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            con.add(new ArrayList<>());
//        }
//        for (int i = 1; i < n; i++) {
//            con.get(parent.get(i)).add(i);
//        }
//        Map<Integer, Integer> have = new HashMap<>();
//        have.put(0, 1);
//        return dfs(0, 0, s, con, have);
//    }
// }

// public class lc2791 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		List<Integer> parent = new ArrayList<>(Arrays.asList(-1, 0, 0, 1, 1, 2));
// 		Object a=test.countPalindromePaths(parent, "acaabc");


// 		System.out.println("Hello World");

// 	}
// }
