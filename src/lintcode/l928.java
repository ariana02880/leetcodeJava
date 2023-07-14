//package lintcode;
//
//import java.util.HashMap;
//
////Given a string, find the length of the longest 
////substring T that contains at most 2 distinct characters.
//class Solution {
//    public int lengthOfLongestSubstringTwoDistinct(String s) {
//        // Write your code here
//        int ans = 0;
//        int l = 0, r = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        while(r < s.length()) {
//            if(map.size() <= 2) {
//                char c = s.charAt(r);
//                map.put(c, r);
//                r++;
//            }
//            if(map.size() > 2) {
//                int left = s.length();
//                for(int i : map.values()) {
//                    left = Math.min(left, i);
//                }
//                char c = s.charAt(left);
//                map.remove(c);
//                l = left + 1;
//            }
//            ans = Math.max(ans, r - l);
//        }
//        return ans;
//    }
//}
//public class l928 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] cand= {1,4,2,7,4,6,2};
//		
//		Object a=test.lengthOfLongestSubstringTwoDistinct("eceba");
//		System.out.println("Hello World");
//
//	}
//}
