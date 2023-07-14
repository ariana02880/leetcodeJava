// package realProblem;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.Random;

// class solution {
//   public int getNumber(String s) {
//     int ans = 0;
//     char[] digit = s.toCharArray();
//     for (int i = 0; i < digit.length; i++) {
//       ans += (digit[i] - '0') * Math.pow(10,1);
//     }
//     return ans;
//   }

//   class ArianaCompare implements Comparator<String> {
//     public int compare(String a, String b) {
//       String[] aa = a.split("\\.");
//       String[] bb = b.split("\\.");
//       int idx = Math.min(aa.length, bb.length);
//       int current = 0;
//       while (current < idx) {

//         if (getNumber(aa[current]) < getNumber(bb[current])) {
//           return -1;
//         }
//         if (getNumber(aa[current]) > getNumber(bb[current])) {
//           return 1;
//         }

//         current++;
//       }
//       return 0;
//     }

//   }

//   public String[] compareVersionNumber(String[] num) {

//     Arrays.sort(num, new ArianaCompare());
//     return num;
//   }

// }

// public class compair {
//   public static void main(String arg[]) {
//     System.out.println("Hello World!");
//     solution r = new solution();
//     String[] s = { "1.2.1", "22.2.1", "1.5.1", "1.2.4", "1.2.1" };
//     r.compareVersionNumber(s);
//     System.out.println("Hello World!");

//   }
// }
