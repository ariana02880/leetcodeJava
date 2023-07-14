// package lc;
// import java.lang.*;
// import java.io.*;


// class Solution {
//   public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//       int L = beginWord.length();
//       // Queue for BFS
//       Queue<String> q = new LinkedList<>();
//       HashMap<String, List<String>> map = new HashMap<>();
      
//       for(String word: wordList) {
//           for(int i = 0;i<L;i++) {
//               String temp = word.substring(0,i)+'*'+word.substring(i+1,L);
//               if(!map.containsKey(temp)){
//                   map.put(temp, new LinkedList<>());
//               }
//               map.get(temp).add(word);
//           }
//       }
      
//       q.add(beginWord);
//       HashSet<String> visited = new HashSet<>();
//       visited.add(beginWord);
//       int level = 0;
//       while(!q.isEmpty()) {
//           int cnt = q.size();
//           level++;
//           for(int c=0;c<cnt;c++) {
//               String nowS = q.poll();
//               for(int i=0;i<L;i++) {
//                   String temp = nowS.substring(0,i)+'*'+nowS.substring(i+1,L);
//                   for(String adj: map.getOrDefault(temp, new LinkedList<>())){
//                       if(adj.equals(endWord)){
//                           return level+1;
//                       }
//                       if(!visited.contains(adj)) {
//                           visited.add(adj);
//                           q.add(adj);
//                       }
//                   }
//               }
//           }
//       }
//    return 0;   
//   }
// }




// public class lc127 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.plusOne(digits);
// 		System.out.println("Hello World");

// 	}
// }
