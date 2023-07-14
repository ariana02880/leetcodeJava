// package lc;

// import java.util.*;
// import java.lang.*;
// import java.io.*;



// class MinStack {

//   private Stack<Integer> stack = new Stack<>();
//   private Stack<Integer> minStack = new Stack<>();
  
  
//   public MinStack() { }
  
  
//   public void push(int x) {
//       stack.push(x);
//       if (minStack.isEmpty() || x <= minStack.peek()) {
//           minStack.push(x);
//       }
//   }
  
  
//   public void pop() {
//       if (stack.peek().equals(minStack.peek())) {
//           minStack.pop();
//       }
//       stack.pop();
//   }
  
  
//   public int top() {
//       return stack.peek();
//   }

  
//   public int getMin() {
//       return minStack.peek();
//   }
// }




// public class lc155 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }
