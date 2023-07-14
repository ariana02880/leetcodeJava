// //Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.
// //
// //For example, with A = "abcd" and B = "cdabcdab".
// //
// //Return 3, because by repeating A three times (��abcdabcdabcd��), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
// //
// //Note:
// //The length of A and B will be between 1 and 10000.
// class Solution {
//     public static int repeatedStringMatch(String A, String B) {
//         int a=A.length(),b=B.length();
//         String single=A;
//         for(int i=1;i<=b/a+2;i++) {
//         	if(A.contains(B))
//         		return i;
//         	A+=single;
//         }
//         return -1;
//     }
// }
// public class G1_1 {
// 	public static void main(String arg[]) {
// 	int[] aa= {2,7,11,15};
// 	int ans=Solution.repeatedStringMatch("abc","cabcabca");
// 	System.out.println("Hello World");
// }
// }
