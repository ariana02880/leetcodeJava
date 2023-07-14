// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;


// class NumArray {
//   FenwickTree tree_;
//   int[] nums_;
//   public NumArray(int[] nums) {
//       nums_ = nums;
//       tree_ = new FenwickTree(nums.length);
//       for (int i = 0; i < nums.length; ++i)
//           tree_.update(i + 1, nums[i]);
//   }
  
//   public void update(int i, int val) {
//       tree_.update(i + 1, val - nums_[i]);
//       nums_[i] = val;
//   }
  
//   public int sumRange(int i, int j) {
//       return tree_.query(j + 1) - tree_.query(i);
//   }
// class FenwickTree {
//   int sums_[];
//   public FenwickTree(int n) {
//       sums_ = new int[n + 1];
//   }
  
//   public void update(int i, int delta) {
//       while (i < sums_.length) {
//           sums_[i] += delta;
//           i += i & -i;
//       }
//   }
  
//   public int query(int i) {
//       int sum = 0;
//       while (i > 0) {
//           sum += sums_[i];
//           i -= i & -i;
//       }
//       return sum;
//   }
// }
// }



// public class lc307 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.toLowerCase("HHUJig");
// 		System.out.println("Hello World");

// 	}
// }