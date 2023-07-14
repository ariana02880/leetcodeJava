// package lc;

// import java.lang.*;
// import java.sql.Array;
// import java.io.*;

// class Solution {
//   public List<List<Integer>> permute(int[] nums) {
//     List<List<Integer>> list = new ArrayList<>();
//     backtrack(list, new ArrayList<>(), nums);
//     return list;
//   }

//   private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
//     if (tempList.size() == nums.length) {
//       list.add(new ArrayList<>(tempList));
//     } else {
//       for (int i = 0; i < nums.length; i++) {
//         if (tempList.contains(nums[i]))
//           continue;// 已经存在的元素，跳过
//         tempList.add(nums[i]);// 将当前元素加入
//         backtrack(list, tempList, nums);// 向后继续添加
//         tempList.remove(tempList.size() - 1);// 将 tempList 刚添加的元素，去掉，尝试新的元素
//       }
//     }
//   }
// }

// public class lc46 {
//   public static void main(String arg[]) {
//     String a1 = "a";
//     String a2 = "A".toLowerCase();
//     int cmp = a1.compareTo(a2);

//     Solution test = new Solution();
//     String[] digits = { "g1 Act car", "a8 act zoo" };
//     Object a = test.logSort(digits);
//     System.out.println("Hello World");
//   }
// }
