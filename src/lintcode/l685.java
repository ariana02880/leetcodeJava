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
////ans stream data
//class DataStream {
//    private ListNode head, tail;
//    private Map<Integer, ListNode> numToPrev;
//    private Set<Integer> duplicates; 
//    
//    public DataStream() {
//        // dummy
//        head = new ListNode(0);
//        tail = head;
//        
//        numToPrev = new HashMap<>();
//        duplicates = new HashSet<>();
//    }
//    
//    private void remove(int number) {
//        ListNode prev = numToPrev.get(number);
//        prev.next = prev.next.next;
//        numToPrev.remove(number);//*****
//        
//        // change tail and prev of next
//        if (prev.next != null) {
//            numToPrev.put(prev.next.val, prev);
//        } else {
//            tail = prev;
//        }
//    }
//    
//    public void add(int number) {
//        if (duplicates.contains(number)) {
//            return;
//        }
//        
//        if (numToPrev.containsKey(number)) {
//            remove(number);
//            duplicates.add(number);
//        } else {
//            ListNode node = new ListNode(number);
//            numToPrev.put(number, tail);
//            tail.next = node;
//            tail = node;
//        }
//    }
//    
//    public int firstUnique() {
//        if (head.next != null) {
//            return head.next.val;
//        }
//        return -1;
//    } 
//}
//
//class Solution {
//    /**
//     * @param nums: a continuous stream of numbers
//     * @param number: a number
//     * @return: returns the first unique number
//     */
//    public int firstUniqueNumber(int[] nums, int number) {
//        DataStream ds = new DataStream();
//        for (int i = 0; i < nums.length; i++) {
//            ds.add(nums[i]);
//            if (nums[i] == number) {
//                return ds.firstUnique();
//            }
//        }
//        
//        return -1;
//    }
//}
//
//
//public class l135 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		int[] cand= {1,4,2,7,4,6,2};
//		
//		Object a=test.combinationSum(cand, 7);
//		System.out.println("Hello World");
//
//	}
//}
//
//
