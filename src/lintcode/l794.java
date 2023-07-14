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
////my
//class Solution {
//    public int minMoveStep(int[][] init_state, int[][] final_state) {
//        // # write your code here
//        String start=matrixToString(init_state);
//        String end=matrixToString(final_state);
//        HashSet<String> visited=new HashSet<>();
//        Queue<String> q=new LinkedList<>();
//        
//        q.add(start);
//        visited.add(start);
//        int ans=-1;
//        while(!q.isEmpty()){
//            int size=q.size();
//            ans++;
//            for(int i=0;i<size;i++){
//                String cs=q.poll();
//                if(cs.equals(end))
//                    return ans;
//                for(String aa:getNext(cs)){
//                    if(!visited.contains(aa)){
//                        q.add(aa);
//                        visited.add(aa);
//                    }
//                }
//            }
//        }
//        return -1;
//    }
//    public String matrixToString(int[][] state) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                sb.append(state[i][j]);
//            }
//        }
//        return sb.toString();
//    }
//    public ArrayList<String> getNext(String cs){
//        int idx=cs.indexOf('0');
//        int zx=idx/3;
//        int zy=idx%3;
//        int dx[]={0,0,1,-1};
//        int dy[]={1,-1,0,0};
//        ArrayList<String> ans=new ArrayList<>();
//        
//        for(int i=0;i<4;i++){
//            int nx=dx[i]+zx;
//            int ny=dy[i]+zy;
//            if(0<=nx&&nx<3 &&0<=ny &&ny<3){
//                char[] chars = cs.toCharArray();
//                chars[idx]=chars[nx*3+ny];
//                chars[nx*3+ny]='0';
//                ans.add(new String (chars));
//            }
//        }
//        return ans;
//    }
//}
//
//public class l794 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		String [] t= {"2110","2000","0000","2111","1110"};
//		String end="0012";
//		Object a=test.minMoveStep(t,end);
//		System.out.println("Hello World");
//
//	}
//}
