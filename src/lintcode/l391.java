
// package lintcode;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// import java.util.PriorityQueue;

// /**
//  * Definition of Interval:
//  * public classs Interval {
//  *     int start, end;
//  *     Interval(int start, int end) {
//  *         this.start = start;
//  *         this.end = end;
//  *     }
//  * }
//  */

// class Solution {
//   /**
//    * @param airplanes: An interval array
//    * @return: Count of airplanes are in the sky.
//    */
//   public int countOfAirplanes(int[][] p) {
//       // write your code here
//       List<point> list = new ArrayList<>();
//       for(Interval aa: p){
//           list.add(new point(aa.start, 1));
//           list.add(new point(aa.end, 0));
//       }
//       Collections.sort(list,new pointCmp());
//       int cnt = 0;
//       int ans = 0;
//       for(point pp: list){
//           if(pp.status == 1){
//               cnt++;
//           }
//           else{
//               cnt --;
//           }
//           ans = Math.max(ans,cnt);
//       }
//       return ans;
//   }
//   class point{
//       public int time;
//       public int status;// start = 1
//       point(int a, int b){
//           time = a;
//           status = b;
//       }
//   }
//   class pointCmp implements Comparator<point>{
//       public int compare (point a, point b){
//           if(a.time == b.time){
//               return a.status - b.status;
//           }
//           return a.time - b.time;
//       }
//   }

// }

// public class l391 {
//   public static void main(String arg[]) {
//     Solution test = new Solution();

    

//     System.out.println("Hello World 123123123");

//   }
// }
