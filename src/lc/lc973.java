// package lc;

// package lc;
// import java.lang.*;
// import java.io.*;


// class Solution {
//   public int[][] kClosest(int[][] points, int k) {
//       HashMap<int[],Integer> hm = new HashMap<>();
//       int[][] result = new int[k][2];
//       PriorityQueue<Map.Entry<int[],Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
//       for(int[] a:points) {
//         int distance=(a[0]*a[0]) + (a[1]*a[1]);
//          hm.put(a,distance);
//       }
//       pq.addAll(hm.entrySet());
//       while(k>0) {
//          int[] a= pq.poll().getKey();
//          result[k-1]=a;
//          k--;
//       }
//       return result;
//   }
// }




// public class lc973 {
// 	public static void main(String arg[]) {
// 		System.out.println("Hello World");

//     int[] q = {10,20,5};
//     int[] w = {70,50,30};
//     double[][] workers = new double[q.length][2];
//     for (int i = 0; i < q.length; ++i)
//         workers[i] = new double[]{(double)(w[i]) / q[i], (double)q[i]};
//     Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));


//     System.out.println("Hello World");
// 	}
// }
