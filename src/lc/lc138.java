// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;

// class RandomListNode {
//    int label;
//   RandomListNode next, random;
//   RandomListNode(int x) { this.label = x; }
// }


// /*
// // Definition for a Node.
// class Node {
//     int val;
//     Node next;
//     Node random;

//     public Node(int val) {
//         this.val = val;
//         this.next = null;
//         this.random = null;
//     }
// }
// */

// class Solution {
//   HashMap<Node, Node> visited = new HashMap<>();
//   public Node getNode(Node n) {
//       if(n == null) {
//           return null;
//       }
//       if(visited.containsKey(n)){
//           return visited.get(n);
//       }
//       Node ans = new Node(n.val);
//       visited.put(n,ans);
//       return ans;
      
//   }
//   public Node copyRandomList(Node head) {
//       if(head == null) {
//           return null;
//       }    
//       Node oldNode = head;
      
//       Node ans = new Node(oldNode.val);
//       visited.put(oldNode, ans);
//       while( oldNode != null) {
//           ans.next = this.getNode(oldNode.next);
//           ans.random = this.getNode(oldNode.random);
//           ans = ans.next;
//           oldNode = oldNode.next;
//       }

      
//       return visited.get(head);
      
//   }
// }



// public class lc138 {
	  
// public static void main(String arg[]) {
// 	RandomListNode aa= new RandomListNode(12);
// 	//Solution.copyRandomList(aa);
// 	System.out.println("Hello world");
// }
// }
