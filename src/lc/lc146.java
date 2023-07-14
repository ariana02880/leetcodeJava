// package lc;

// import java.lang.*;
// import java.util.HashMap;
// import java.io.*;


// class LRUCache {
//   class DLinkedNode {
//       public int key;
//       public int value;
//       public DLinkedNode prev;
//       public DLinkedNode next;
//   }
  
//   private int size;
//   private HashMap<Integer,DLinkedNode> cache = new HashMap<>();
//   private int capacity;
//   private DLinkedNode head = new DLinkedNode();
//   private DLinkedNode tail = new DLinkedNode();
  
//   public void addNode(DLinkedNode node) {
//       node.prev = head;
//       node.next = head.next;
      
//       head.next = node;
//       node.next.prev = node;
//   }
//   public void removeNode(DLinkedNode node){
//       DLinkedNode prev = node.prev;
//       DLinkedNode next = node.next;

//       prev.next = next;
//       next.prev = prev;
//   }
//   public void moveToHead(DLinkedNode node) {
//       removeNode(node);
//       addNode(node);
//   }

//   public LRUCache(int capacity) {
//       this.size = 0;
//       this.capacity = capacity; 
      
//       head.next = tail;
//       tail.prev = head;
//   }
  
//   public int get(int key) {
//       if(!cache.containsKey(key)) {
//           return -1;
//       }
//       DLinkedNode target = cache.get(key);
//       moveToHead(target);
//       return target.value;
//   }
  
//   public void put(int key, int value) {
//       if(cache.containsKey(key)) {
//           DLinkedNode node = cache.get(key);
//           node.value = value;
//           moveToHead(node);
//       } else {
//           DLinkedNode node2 = new DLinkedNode();
//           node2.key = key;
//           node2.value = value;
//           cache.put(key,node2);
//           addNode(node2);
//           size++;
//       }
      
//       if(size > capacity) {
//           cache.remove(tail.prev.key);
//           removeNode(tail.prev);
//           size --;
//       }
//   }
// }

// /**
// * Your LRUCache object will be instantiated and called as such:
// * LRUCache obj = new LRUCache(capacity);
// * int param_1 = obj.get(key);
// * obj.put(key,value);
// */

// public class lc146 {
// 	public static void main(String arg[]) {
// 		LRUCache test= new LRUCache(3);
		
// 		test.put(1,1);
//     test.put(2,2);
//     test.put(3,3);
//     test.put(4,4);
//     test.get(4);
//     test.get(3);
//     test.get(2);
//     test.get(1);
//     test.put(5,5);
//     test.get(1);
//     test.get(2);
//     test.get(3);
//     test.get(4);
//     test.get(5);
// 		System.out.println("Hello World");

// 	}
// }
