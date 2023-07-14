// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Set;

// class Solution {
//     StringBuilder sb = new StringBuilder();
//     Integer sign = 1;
//     Integer ans = Integer.MIN_VALUE;
//     public void help (int idx, char[] c1, StringBuilder sb) {
//         for(int i = idx +1; i<c1.length;i++) {
//             sb.append(c1[i]);
//         }
//         ans = Math.max(ans, sign * Integer.parseInt(sb.toString()));

//         return;
//     }
// 	public int remove5(int n) {
// 	    String s1 = String.valueOf(n);
// 	    char[] c1 = s1.toCharArray();
//         int index = 0;
//         if(c1[0] == '-') {
//             index = 1;
//             sign = -sign;
//         }
//         for (;index<c1.length; index ++) {
//             if (c1[index] == '5') {
//                 StringBuilder temp = new StringBuilder(sb);
//                 help(index, c1, temp);
//             }
//             sb.append(c1[index]);
//         }
//         return ans;

//     }
// }


// public class lc38 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		Integer a = test.remove5(-5000);

// 		//int[] a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }