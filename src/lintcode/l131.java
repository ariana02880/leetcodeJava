// package lintcode;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// import java.util.PriorityQueue;
// import java.util.TreeMap;

// // class Solution {
// //   /**
// //    * @param buildings: A list of lists of integers
// //    * @return: Find the outline of those buildings
// //    */
// //   public List<List<Integer>> buildingOutline(int[][] buildings) {
// //       // write your code here
// //       List<Point> list = new ArrayList<>();
// //       List<List<Integer>> ans = new ArrayList<>();
// //       List<List<Integer>> ans2 = new ArrayList<>();
// //       PriorityQueue<Integer> h = new PriorityQueue<>(buildings.length * 2, Collections.reverseOrder());
// //       h.add(0);
// //       int preMax = 0;
// //       for(int[] aa:buildings){
// //           list.add(new Point(aa[0],aa[2],0));
// //           list.add(new Point(aa[1],aa[2],1));
// //       }
// //       Collections.sort(list,new PointCmp());

// //       for(Point aa: list){

// //           if(aa.status == 0){
// //               h.add(aa.height);
// //           }
// //           else {
// //               h.remove(aa.height);
// //           }
// //           if( h.peek() != preMax){
// //               List temp = new ArrayList<>();
// //               temp.add(aa.time);
// //               temp.add(h.peek());
// //               preMax = h.peek();
// //               ans.add(temp);
// //           }
// //       }

// //       for(int i=1 ;i<ans.size();i++){
// //           if(ans.get(i-1).get(1) != 0 && ans.get(i-1).get(0) != ans.get(i).get(0)){
// //               List temp = new ArrayList<>();
// //               temp.add(ans.get(i-1).get(0));
// //               temp.add(ans.get(i).get(0));
// //               temp.add(ans.get(i-1).get(1));
// //               ans2.add(temp);
// //           } 
// //       }
// //       return ans2;

// //   }
// //   class Point {
// //       int time;
// //       int height;
// //       int status;
// //       Point(int a,int b, int c){
// //           time = a;
// //           height = b;
// //           status = c; //start =0; end =1
// //       }
// //   }
// //   class PointCmp implements Comparator<Point>{
// //       public int compare(Point a, Point b){
// //           if(a.time ==b.time){
// //               return b.height - a.height;
// //           }
// //           return a.time - b.time;
// //       }
// //   }
// // }


// // other people's answer
// // class Solution {
// //   //由一座大楼可以生成两个信息，一个是开始，高度，和上升
// //   private class Node implements Comparable<Node> {
// //       public int pos; //position
// //       public int h; //height
// //       public boolean isUp;

// //       public Node(int pos, int h, boolean isUp) {
// //           this.pos = pos;
// //           this.h = h;
// //           this.isUp = isUp;
// //       }

// //       @Override
// //       public int compareTo(Node o) {
// //           if (pos != o.pos) {
// //               return pos - o.pos;
// //           }
// //           if (isUp != o.isUp) {
// //               return isUp ? -1 : 1; // 相同的位置下, 向上的排在前面
// //           }
// //           return 0;
// //       }
// //   }

// //   public List<List<Integer>> buildingOutline(int[][] buildings) {
// //       Node[] node = new Node[2 * buildings.length];     // each building to two message
// //       for (int i = 0; i < buildings.length; i++) {
// //           node[i * 2] = new Node(buildings[i][0], buildings[i][2], true); //up
// //           node[i * 2 + 1] = new Node(buildings[i][1], buildings[i][2], false);// down
// //       }
// //       Arrays.sort(node); //sorted by start
// //       TreeMap<Integer, Integer> htMap = new TreeMap<>(); // key : height ; value : times
// //       TreeMap<Integer, Integer> pmMap = new TreeMap<>(); // key : pos(every) ; value : maxHeight
// //       for (int i = 0; i < node.length; i++) {
// //           if (node[i].isUp) {  //if it's up
// //               if (!htMap.containsKey(node[i].h)) {
// //                   htMap.put(node[i].h, 1);
// //               } else {
// //                   htMap.put(node[i].h, htMap.get(node[i].h) + 1); //add the times
// //               }
// //           } else { // down
// //               if (!htMap.containsKey(node[i].h)) continue;
// //               if (htMap.get(node[i].h) == 1) {
// //                   htMap.remove(node[i].h);
// //               } else {
// //                   htMap.put(node[i].h, htMap.get(node[i].h) - 1);
// //               }
// //           }

// //           if (htMap.isEmpty()) {
// //               pmMap.put(node[i].pos, 0);
// //           } else {
// //               pmMap.put(node[i].pos, htMap.lastKey()); //存入当前位置和的当前的最大高度
// //           }
// //       }

// //       //根据pmMap 构造出轮廓
// //       List<List<Integer>> res = new ArrayList<>();
// //       int start = 0, height = 0; //一开始 = 0
// //       for (Map.Entry<Integer, Integer> entry : pmMap.entrySet()) {
// //           int curPosition = entry.getKey();
// //           int maxHeight = entry.getValue();

// //           if (height != maxHeight) {    //发现改变  有轮廓
// //               if (height != 0) {        //这个是第一个要判断一下
// //                   List<Integer> temp = new ArrayList<>();
// //                   temp.add(start);    //起点
// //                   temp.add(curPosition); //当前的
// //                   temp.add(height);
// //                   res.add(temp);
// //               }
// //               start = curPosition;
// //               height = maxHeight;
// //           }
// //       }
// //       return res;
// //   }
// // }

// public class l131 {
//   public static void main(String[] args) {
//     Solution test = new Solution();

//     int[][] p = { { 1, 2, 3 }, { 1, 2, 4 }, { 1, 2, 3 }, { 1, 2, 4 } };
//     Object a = test.buildingOutline(p);
//     System.out.println("Ariana");
//   }
// }
