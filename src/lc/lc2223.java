// package lc;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// // Ariana
// // Time complexity:O(N+K)
// // Space complexity:O(N)

// class Solution {
//     public long sumScores(String s) {
//         char [] ch = s.toCharArray();
//         long sum = ch.length;
//         int x=0, y=0;
//         int []z = new int[ch.length];
        
//         for(int i=1; i<ch.length; i++){
//             z[i] = Math.max(0, Math.min(z[i-x], y-i+1));
//             while(i+z[i]<ch.length && ch[z[i]]==ch[i+z[i]]){
//                 x = i;
//                 y = i+z[i];
//                 z[i]++;
//             }
//             sum += z[i];
//         }
//         return sum;
//     }
// }

// public class lc2223 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		String s = "azbazbzaz";
// 		Object a=test.sumScores(s);
// 		System.out.println("Hello World");

// 	}
// }