// package lc;
// import java.lang.*;
// import java.io.*;



// class Solution {
//   // Recursive solution will take exponential time to run; for n = 3 -> ? ? ? needs to be filled with all options i.e. {0,1,8,6,9} 
//   // so Time: O(5^n)
//   // and space will be O(n) for n digit since that's how deep we recursion will keep function stack before returning from our base case; 
//   // n/2 is a tighter bound
//    private List<String> res;
//    private Map<Character, Character> map;
//    public Solution() {
//        res = new ArrayList();
//        map = new HashMap(Map.of('0','0','1','1','8','8','6','9','9','6'));
//    }
//    public List<String> findStrobogrammatic(int n) {
//        helper(0, n - 1, new char[n]);
//        return res;
//    }
//    private void helper(int l, int r, char[] nums) {
//        if (l == r) { // odd
//            nums[l] = '0';
//            res.add(new String(nums));
//            nums[l] = '1';
//            res.add(new String(nums));
//            nums[l] = '8';
//            res.add(new String(nums));
//            return;
//        }
//        if (l > r) { // even
//            res.add(new String(nums));
//            return;
//        }

//        for (char ch : map.keySet()) {
//            if (l == 0 && ch == '0')
//                continue;
//            nums[l] = ch;
//            nums[r] = map.get(ch);
//            helper(l + 1, r - 1, nums);
//        }
//    }
// }


// public class lc4247 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }
