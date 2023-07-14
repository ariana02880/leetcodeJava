// import java.util.HashMap;
// import com.sun.javafx.image.IntPixelAccessor;



// class Solution {
//   public List<String> findMissingRanges(int[] nums, int lower, int upper) {
//       List<String> result = new ArrayList<>();
//       int prev = lower - 1;
//       for (int i = 0; i <= nums.length; i++) {
//           int curr = (i < nums.length) ? nums[i] : upper + 1;
//           if (prev + 1 <= curr - 1) {
//               result.add(formatRange(prev + 1, curr - 1));
//           }
//           prev = curr;
//       }
//       return result;
//   }

//   // formats range in the requested format
//   private String formatRange(int lower, int upper) {
//       if (lower == upper) {
//           return String.valueOf(lower);
//       }
//       return lower + "->" + upper;
//   }
// }




// public class lc163 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		//int[] digits=new int[] {2,4,3,9};
// 		//int[] a=test.plusOne(digits);
// 		System.out.println("Hello World");
		

// 	}
// }
