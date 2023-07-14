// import java.util.HashMap;

// class Solution {
//   class ArianaCompare implements Comparator<int[]> {
//       public int compare (int[] a, int[] b) {
//           if(a[0] != b[0]){
//               return a[0] - b[0];
//           }
//           return a[1] - b[1];
//       }
      
//   }
//   public int minMeetingRooms(int[][] intervals) {
      
//   // Check for the base case. If there are no intervals, return 0
//   if (intervals.length == 0) {
//     return 0;
//   }

//   // Min heap
//   PriorityQueue<Integer> Q_end =
//       new PriorityQueue<Integer>(
//           intervals.length,
//           new Comparator<Integer>() {
//             public int compare(Integer a, Integer b) {
//               return a - b;
//             }
//           });

//   // Sort the intervals by start time
//   Arrays.sort( intervals, new ArianaCompare());

//   int ans = 0;
//   for (int[] aa : intervals) {
//     while (!Q_end.isEmpty() && aa[0] >= Q_end.peek()) {
//       Q_end.poll();
//     }
//     Q_end.add(aa[1]);
//     ans = Math.max(ans, (int)Q_end.size());

//   }
//       return ans;
// }
// }


// public class lc253 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		int a=test.longestUnivaluePath(root);
// 		System.out.println("Hello World");

// 	}
// }
