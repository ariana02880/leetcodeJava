// package lc;
// import java.lang.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.List;
// import java.io.*;

// // class Solution {
// //     public List<List<Integer>> findRLEArray(int[][] encoded1, int[][] encoded2) {
// //         List<Integer> a = new ArrayList<>();
// //         List<Integer> b = new ArrayList<>();
// //         List<Integer> ans = new ArrayList<>();
// //         a = helper(encoded1);
// //         b = helper(encoded2);
// //         for (int i=0; i<a.size(); i++) {
// //             ans.add(a.get(i) * b.get(i));
// //         }
// //         return getAns(ans);
// //     }
// //     public List<Integer> helper( int[][]input) {
// //         List<Integer> a = new ArrayList<>();
// //         for (int[] arr: input) {
// //             int count = 0;
// //             while(count<arr[1]) {
// //                 a.add(arr[0]);
// //                 count++;
// //             }
// //         }
// //         return a;
// //     }
// //     private List<List<Integer>> getAns (List<Integer> a) {
// //         if(a.size() == 0) {
// //             return null;
// //         }
// //         List<List<Integer>> ans = new ArrayList<>();
// //         int curNum = a.get(0);
// //         int curCount = 1;
// //         for (int i=1; i< a.size(); i++) {
// //             if(a.get(i) == curNum) {
// //                 curCount++;
// //             } else {
// //                 ans.add(new ArrayList<>(Arrays.asList(curNum, curCount)));
// //                 curCount = 1;
// //                 curNum = a.get(i);
// //             }
// //         }
// //         ans.add(new ArrayList<>(Arrays.asList(curNum, curCount)));
// //         return ans;
// //     }
// // }


// class Solution {
//     public List<List<Integer>> findRLEArray(int[][] e1, int[][] e2) {
//         LinkedList<List<Integer>> q = new LinkedList<>();
//         int i =0, j =0;
        
//         while(i<e1.length && j<e2.length){
//             int[] ele1 = e1[i];
//             int[] ele2 = e2[j];
//             List<Integer> prod = null;
//             if(!q.isEmpty() && q.getLast().get(0) ==  (ele1[0] * ele2[0]))
//                 prod=q.getLast();
//             else{
//                 prod = new ArrayList<>( List.of(ele1[0] * ele2[0], 0));
//                 q.add(prod);
//             }
//             int lowFreq = Math.min(ele1[1], ele2[1]);
//             prod.set(1, prod.get(1)+lowFreq);
                       
//             if((ele1[1]-=lowFreq) ==0) i++;
//             if((ele2[1]-=lowFreq) ==0) j++;
//         }
        
       
//         return q;
       
//     }
				
// }
// public class lc1868 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
//         int[][] a = {{1,3}, {2,3}};
//         int[][] b = {{6,3}, {3,3}};
		
// 		List<List<Integer>> ab =test.findRLEArray(a, b);
// 		System.out.println("Hello World");

// 	}
// }
