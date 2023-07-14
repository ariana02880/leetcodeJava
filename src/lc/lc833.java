// package lc;

// import com.sun.org.glassfish.gmbal.ParameterNames;

// import javafx.scene.Parent;
// import sun.reflect.generics.tree.Tree;

// import java.lang.*;
// import java.io.*;


// class Solution {
//   public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
//       // create tuple and sort
//       //
//       Tuple[] tuples = new Tuple[indexes.length]; 
//       for (int i = 0; i < indexes.length; i++) {
//           Tuple tuple = new Tuple(indexes[i], sources[i], targets[i]);
//           tuples[i] = tuple;
//       }

//       Arrays.sort(tuples, new MyTupleComparator());
       
//       int prev = 0;
//       StringBuilder sb = new StringBuilder();
//       for (int i = 0; i < indexes.length; i++) {
//           int index = tuples[i].index;
//           String source = tuples[i].source;
//           String target = tuples[i].target;

//           if (S.substring(index, index + source.length()).equals(source)) {
//               // prev seg 
//               //
//               sb.append(S.substring(prev, index));

//               // curr seg 
//               //
//               sb.append(target);
//               prev = index + source.length();
//           }
//       }

//       sb.append(S.substring(prev));

//       return sb.toString();
//   }
// }

// class Tuple {
//   int index;
//   String source;
//   String target;

//   public Tuple( int i, String s, String t) {
//       index = i;
//       source = s;
//       target = t;
//   }
// }

// class MyTupleComparator implements Comparator<Tuple> {
//   public int compare(Tuple a, Tuple b) {
//       return a.index - b.index;
//   }
// }


// public class lc833 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }
