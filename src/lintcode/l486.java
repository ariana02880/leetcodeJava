//package lintcode;
//package lc;
//import java.lang.*;
//import java.io.*;
//// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
//}
////Definition for a binary tree node.
//class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
//}
//
//
//
//
//
////my
//class Solution {
//    /**
//     * @param arrays: k sorted integer arrays
//     * @return: a sorted array
//     */
//    
//    class Element implements Comparable<Element>{
//        int i, j, val;
//        Element(int i, int j, int val) {
//            this.i = i;
//            this.j = j;
//            this.val = val;
//        }
//        
//        @Override
//        public int compareTo(Element o) {
//            return this.val - o.val;
//        }
//    } 
//    
//    public int[] mergekSortedArrays(int[][] arrays) {
//        // write your code here
//        if (arrays == null || arrays.length == 0) {
//            return new int[0];
//        }
//        
//        return mergeHelper_v1_minHeap(arrays);
//        // return mergeHelper_v2_Divide_Conquer(arrays, 0, arrays.length - 1);
//        // return mergeHelper_v3_Non_Recursive(arrays);
//    }
//    
//    
//    private int[] mergeHelper_v1_minHeap(int[][] arrays) {
//        int n = 0;
//        PriorityQueue<Element> minHeap = new PriorityQueue<>();
//        for (int i = 0; i < arrays.length; i++) {
//            if (arrays[i] == null || arrays[i].length == 0) {
//                continue;
//            }
//            n += arrays[i].length;
//            minHeap.offer(new Element(i, 0, arrays[i][0]));
//        }
//        
//        int[] merge = new int[n];
//        int idx = 0;
//        while (!minHeap.isEmpty()) {
//            Element top = minHeap.poll();
//            merge[idx++] = top.val;
//            if (top.j + 1 < arrays[top.i].length) {
//                top.j++;
//                top.val = arrays[top.i][top.j];
//                minHeap.offer(top);    
//            }
//        }
//        
//        return merge;
//    }
//    
//    private int[] mergeHelper_v2_Divide_Conquer(int[][] arrays, int start, int end) {
//        if (start == end) {
//            return arrays[start];
//        }
//        
//        int mid = start + (end - start) / 2;
//        int[] left = mergeHelper_v2_Divide_Conquer(arrays, start, mid);
//        int[] right = mergeHelper_v2_Divide_Conquer(arrays, mid + 1, end);
//        return mergeTwoSortedArrays(left, right);
//    }
//    
//    private int[] mergeHelper_v3_Non_Recursive(int[][] arrays) {
//        while (arrays.length > 1) {
//            int n = arrays.length / 2;
//            if (arrays.length % 2 == 1) {
//                n++;
//            }
//            
//            int[][] tmp = new int[n][0];
//            int idx = 0;
//            for (int i = 0; i < arrays.length && i + 1 < arrays.length; i += 2) {
//                int[] merge = mergeTwoSortedArrays(arrays[i], arrays[i + 1]);
//                tmp[idx++] = merge;
//            }
//            
//            if (arrays.length % 2 == 1) {
//                tmp[idx++] = arrays[arrays.length - 1];
//            }
//            
//            arrays = tmp;
//        }
//
//        
//        return arrays[0];
//    }
//    
//    private int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
//        if (arr1 == null) {
//            return arr2;
//        }
//        
//        if (arr2 == null) {
//            return arr1;
//        }
//        
//        int n = arr1.length + arr2.length;
//        int[] merge = new int[n];
//        
//        int idx = 0;
//        int i = 0, j = 0;
//        while (i < arr1.length && j < arr2.length) {
//            if (arr1[i] <= arr2[j]) {
//                merge[idx++] = arr1[i++];
//            } else {
//                merge[idx++] = arr2[j++];
//            }
//        }
//        
//        while (i < arr1.length) {
//            merge[idx++] = arr1[i++];
//        }
//        
//        while (j < arr2.length) {
//            merge[idx++] = arr2[j++];
//        }
//        
//        return merge;
//    }
//}
//
//
//public class l486 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] cand= {1,4,2,7,4,6,2};
//		
//		//Object a=test.combinationSum(cand, 7);
//		System.out.println("Hello World");
//
//	}
//}
