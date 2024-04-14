// package lc;


// import java.lang.*;
// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Queue;
// import java.util.Set;
// import java.io.*;


// // Ariana
// class Solution {
//     public int slidingPuzzle(int[][] board) {
//         int[][] final_state = new int[2][3];
//         final_state[0][0]=1;
//         final_state[0][1]=2;
//         final_state[0][2]=3;
        
//         final_state[1][0]=4;
//         final_state[1][1]=5;
//         final_state[1][2]=0;
//         return minMoveStep(board, final_state);
//     }
//     public int minMoveStep(int[][] init_state, int[][] final_state) {
//         String source = matrixToString(init_state);
//         String target = matrixToString(final_state);
        
//         if (source.equals(target)) {
//             return 0;
//         }
        
//         Queue<String> forwardQueue = new ArrayDeque<>();
//         Set<String> forwardSet = new HashSet<>();
//         forwardQueue.offer(source);
//         forwardSet.add(source);

//         Queue<String> backwardQueue = new ArrayDeque<>();
//         Set<String> backwardSet = new HashSet<>();
//         backwardQueue.offer(target);
//         backwardSet.add(target);
        
//         int steps = 0;
//         while (!forwardQueue.isEmpty() && !backwardQueue.isEmpty()) {
//             steps++;
//             if (extendQueue(forwardQueue, forwardSet, backwardSet)) {
//                 return steps;
//             }
            
//             steps++;
//             if (extendQueue(backwardQueue, backwardSet, forwardSet)) {
//                 return steps;
//             }
//         }
        
//         return -1;
//     }
    
//     private boolean extendQueue(Queue<String> queue,
//                                 Set<String> set,
//                                 Set<String> targetSet) {
//         int size = queue.size();
//         for (int i = 0; i < size; i++) {
//             String curt = queue.poll();
//             for (String next : getNext(curt)) {
//                 if (set.contains(next)) {
//                     continue;
//                 }
//                 if (targetSet.contains(next)) {
//                     return true;
//                 }
//                 queue.offer(next);
//                 set.add(next);
//             }
//         }
//         return false;
//     }
    
//     public String matrixToString(int[][] state) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 sb.append(state[i][j]);
//             }
//         }
//         return sb.toString();
//     }
    
//     public List<String> getNext(String state) {
//         List<String> states = new ArrayList<>();
//         int[] dx = {0, 1, -1, 0};
//         int[] dy = {1, 0, 0, -1};
        
//         int zeroIndex = state.indexOf('0');
//         int x = zeroIndex / 3;
//         int y = zeroIndex % 3;
        
//         for (int i = 0; i < 4; i++) {
//             int x_ = x + dx[i];
//             int y_ = y + dy[i];
//             if (x_ < 0 || x_ >= 2 || y_ < 0 || y_ >= 3) {
//                 continue;
//             }
            
//             char[] chars = state.toCharArray();
//             chars[x * 3 + y] = chars[x_ * 3 + y_];
//             chars[x_ * 3 + y_] = '0';
//             states.add(new String(chars));
//         }
        
//         return states;
//     }
// }
// public class lc773 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
//         int[][] final_state = new int[2][3];
//         final_state[0][0]=1;
//         final_state[0][1]=2;
//         final_state[0][2]=3;
        
//         final_state[1][0]=4;
//         final_state[1][1]=0;
//         final_state[1][2]=5;
		
// 		Object a=test.slidingPuzzle(final_state);
// 		System.out.println("Hello World");

// 	}
// }
