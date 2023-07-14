// package lc;

// import java.util.HashMap;



// class Logger {
//   private HashMap<String, Integer> msgDict;

//   /** Initialize your data structure here. */
//   public Logger() {
//     msgDict = new HashMap<String, Integer>();
//   }

//   /**
//    * Returns true if the message should be printed in the given timestamp, otherwise returns false.
//    */
//   public boolean shouldPrintMessage(int timestamp, String message) {

//     if (!this.msgDict.containsKey(message)) {
//       this.msgDict.put(message, timestamp);
//       return true;
//     }

//     Integer oldTimestamp = this.msgDict.get(message);
//     if (timestamp - oldTimestamp >= 10) {
//       this.msgDict.put(message, timestamp);
//       return true;
//     } else
//       return false;
//   }
// }




// public class lc359 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		//int[] digits=new int[] {2,4,3,9};
// 		//int[] a=test.plusOne(digits);
// 		System.out.println("Hello World");
		

// 	}
// }
