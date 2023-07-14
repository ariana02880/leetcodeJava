//import java.util.HashMap;
//
//import com.sun.javafx.image.IntPixelAccessor;
//
//class Solution {
//    public static int[] twoSum(int[] nums, int target) {
//    	 HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
//         int[] res = new int[2];
//         for (int i = 0; i < nums.length; ++i) {
//             m.put(nums[i], i);
//         }
//         for (int i = 0; i < nums.length; ++i) {
//             int t = target - nums[i];
//             if (m.containsKey(t) && m.get(t) != i) {
//                 res[0] = i;
//                 res[1] = m.get(t);
//                 break;
//             }
//         }
//         return res;
//    }
//}
//class Solution2 {
//    public static int[] twoSum(int[] nums, int target) {
//    	HashMap<Integer,Integer> m= new HashMap<Integer,Integer>(nums.length);
//        for(int i=0;i<nums.length;i++){
//            m.put(nums[i],i);
//        }
//        int[] ans=new int[2];
//        for(int i=0;i<nums.length;i++){
//            int tt=target-nums[i];
//            if(m.containsKey(tt) &&m.get(tt)!=i){
//                ans[0]=i;
//                ans[1]=m.get(tt);
//            }
//        }
//        return ans;
//    }
//}
//
//
//public class lc1 {
//	public static void main(String arg[]) {
//		int[] aa= {2,23,1,7,11,15};
//		int [] ans=Solution.twoSum(aa,9);
//		System.out.println("Hello World");
//	}
//
//}
