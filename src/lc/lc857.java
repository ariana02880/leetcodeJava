// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;



// class Solution {
//   //最大堆, heapq, PriorityQueue。首先对付工资和质量的比率进行排序wage/quality，同时记录quality，也就是(wage/quality, quality)，代表一个工人情况，
//   //比率越大说明工人效率越低。选定的K个人最后要按照相同的比率来支付工资，
//   // 为了保证每个人的最低工资标准，只能选定比率最高的人的比率来支付工资。
//   //每个人的支付工资：wage = ratio * quality，总的支付工资：total wage = ratio * total quality，
//   //在ratio相同的情况小，总的quality越小越好。用一个变量result记录最小花费，初始为最大浮点数。循环排序好的工资比率，用一个变量qsum累加quality，用一个最大堆记录当前的quality，堆顶是最大的quality，如果堆长度等于K+1，就弹出quality最大的，同时qsum中去掉这个最大值。堆满足K个工人的时候，每次都计算qsum * ratio，和result比较取小的。
//   public double mincostToHireWorkers(int[] q, int[] w, int K) {
//      double[][] workers = new double[q.length][2];
//      for (int i = 0; i < q.length; ++i)
//          workers[i] = new double[]{(double)(w[i]) / q[i], (double)q[i]};
//      Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
//      double res = Double.MAX_VALUE, qsum = 0;
//       // large to small
//      PriorityQueue<Double> pq = new PriorityQueue<>(K,Collections.reverseOrder());
//      for (double[] worker: workers) {
//          qsum += worker[1];
//          pq.add(worker[1]);
//          if (pq.size() > K) 
//              qsum = qsum - pq.poll();
//          if (pq.size() == K) 
//              res = Math.min(res, qsum * worker[0]);
//      }
//      return res;
//  }
// }


// public class lc857 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.toLowerCase("HHUJig");
// 		System.out.println("Hello World");

// 	}
// }