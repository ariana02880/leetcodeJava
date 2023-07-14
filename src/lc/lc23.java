// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// // use PriorityQueue<ListNode>
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//   class comparatorListNode implements Comparator<ListNode> {
//       public int compare(ListNode o1, ListNode o2) {
//               return o1.val - o2.val;
//           }
//   }
//   public ListNode mergeKLists(ListNode[] lists) {
//       if (lists == null || lists.length == 0) return null;
//       if (lists.length == 1) return lists[0];
//       PriorityQueue<ListNode> queue = new PriorityQueue<>(new comparatorListNode());
//       for (int i = 0; i < lists.length; i++) {
//           if (lists[i] != null) queue.add(lists[i]);
//       }
//       ListNode dummy = new ListNode(-1), cur = dummy;
//       while (!queue.isEmpty()) {
//           ListNode temp = queue.poll();
//           cur.next = temp;
//           cur = temp;
//           if (temp.next != null) 
//               queue.add(temp.next);
//       }
//       return dummy.next;
//   }

// }

// // 解法二：merge sort的想法，比解法一更优。每次都两两list merge，
// // 直到merge成一个list，时间复杂度O（(m/2)(k/2 + k/4 + k/8 + …)logk），
// // 还是O（kmlogk），但是比方法一有常数量上的优化。空间复杂度为O（1）.
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//   public ListNode mergeKLists(ListNode[] lists) {
//       if (lists == null || lists.length == 0) return null;
//       int l = 0, r = lists.length - 1;
//       while (l< r) {
//           int mid = l+ (r-l)/2;
//           for (int i = 0; i <= mid; i++) {
//               if(i == r-i){
//                   continue;
//               }
//               lists[i] = merge2list(lists[i], lists[r - i]);
//           }
//           r = mid;
//       }
//       return lists[0];
//   }
//   public ListNode merge2list(ListNode l1, ListNode l2) {
//       if (l1 == null && l2 == null) 
//           return null;
//       if (l1 == null) return l2;
//       if (l2 == null) return l1;
      
//       ListNode dummy = new ListNode(-1), cur = dummy;
//       while (l1 != null && l2 != null) {
//           if (l1.val < l2.val) {
//               cur.next = l1;
//               cur = l1;
//               l1 = l1.next;
//           } else {
//               cur.next = l2;
//               cur = l2;
//               l2 = l2.next;
//           }
//       }
//       if (l1 != null) cur.next = l1;
//       if (l2 != null) cur.next = l2;
//       return dummy.next;
//   }


// }




// public class lc23 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.toLowerCase("HHUJig");
// 		System.out.println("Hello World");

// 	}
// }