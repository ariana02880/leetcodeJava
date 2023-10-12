// package lc;
// import java.lang.*;

// class Solution {
//     public int carryDec = 0;
//     // 123.00
//     public String add2String(String a, String b) {
//         String[] inputArray1 = a.split("\\.");
//         String[] inputArray2 = b.split("\\.");
//         //right
//         int maxLength = Math.max(inputArray1[1].length(), inputArray2[1].length());
//         for (int i =0 ;i < maxLength; i++) {
//             if (i >= inputArray1[1].length()) {
//                 inputArray1[1] += "0";
//             } else if (i >= inputArray2[1].length()) {
//                 inputArray2[1] += "0";
//             }
//         }
//         String rightAns = addStrings(inputArray1[1], inputArray2[1], true);

//         //left
//         if (carryDec!= 0) {
//         inputArray1[0] = addStrings(inputArray1[0], Integer.toString(carryDec), false);

//         }
//         String leftAns = addStrings(inputArray1[0], inputArray2[0], false);

//         // combine:
//         if (isEmpty(rightAns)) {
//             return leftAns;
//         } else {
//             return leftAns + "." + rightAns;
//         }

//     }
//     private boolean isEmpty(String a) {
//         char[] input = a.toCharArray();
//         for (int i=0 ;i <input.length; i++) {
//             if (input[i] != '0') {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public String addStrings(String num1, String num2, boolean isDecimal) {
//         StringBuilder res = new StringBuilder();

//         int carry = 0;
//         int p1 = num1.length() - 1;
//         int p2 = num2.length() - 1;
//         while (p1 >= 0 || p2 >= 0) {
//             int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
//             int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
//             int value = (x1 + x2 + carry) % 10;
//             carry = (x1 + x2 + carry) / 10;
//             res.append(value);
//             p1--;
//             p2--;    
//         }
        
//         if (!isDecimal && carry != 0)
//             res.append(carry);

//         if (isDecimal && carry != 0) {
//             carryDec = carry;
//         }
        
//         return res.reverse().toString();
//     }
// }
// public class lc415 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.add2String("3.140000001", "1433333333333.86");
		
//         System.out.println(a);

// 	}
// }
