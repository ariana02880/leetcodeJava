// package lintcode;
// package lc;
// import java.lang.*;
// import java.io.*;


// public class MinStack {
//   public Stack<Integer> minStack;
//   public Stack<Integer> nums;
//   public MinStack() {
//       // do intialization if necessary
//       minStack = new Stack<Integer>();
//       nums = new Stack<Integer>();
//   }

//   /*
//    * @param number: An integer
//    * @return: nothing
//    */
//   public void push(int number) {
//       // write your code here
//       nums.push(number);
//       if(minStack.isEmpty()){
//           minStack.push(number);
//       }
//       else{
//           int small = minStack.peek();
//           if(small <= number) minStack.push(small);
//           else{
//               minStack.push(number);
//           }
//       }
//   }

//   /*
//    * @return: An integer
//    */
//   public int pop() {
//       // write your code here
//       minStack.pop();
//       return         nums.pop();
//   }

//   /*
//    * @return: An integer
//    */
//   public int min() {
//       // write your code here
//       return minStack.peek();
//   }
// }

// public class l12 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
		
// 		Point[] t= {new Point(0,0),new Point(1,1),new Point(1,0),new Point(0,1)};
// 		Object a=test.numIslands2(2,2,t);
// 		System.out.println("Hello World");

// 	}
// }
