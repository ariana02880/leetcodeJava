// import java.util.HashMap;
// import com.sun.javafx.image.IntPixelAccessor;

// class Solution {
//   public String nextClosestTime(String time) {
//       int cur=Integer.parseInt(time.substring(0,2))*60 +Integer.parseInt(time.substring(3));
      
//       Integer [] digitNow=new Integer[]{cur/60/10, cur/60%10, cur%60/10, cur%60%10};
//       Set<Integer> digitN=new HashSet<Integer>();
//       digitN.addAll(Arrays.asList(digitNow));
//       int[] digitNew = new int[4];
//       int d = 0;
//       for(int i=1; i<=1440 ; i++) {
//           int next = (cur+i) % 1440;
//           digitNew=new int[]{next/60/10, next/60%10, next%60/10, next%60%10};
//           for (d = 0; d < 4; ++d) {
//               if(!digitN.contains(digitNew[d]))
//                   break;
//           }
//           if(d >= 4) 
//               break;
//       }
//       return String.valueOf(digitNew[0]) + String.valueOf(digitNew[1]) + ":" + String.valueOf(digitNew[2]) + String.valueOf(digitNew[3]);
      
//   }
// }


// public class lc681 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
// 		//int[] digits=new int[] {2,4,3,9};
// 		//int[] a=test.plusOne(digits);
// 		System.out.println("Hello World");
		

// 	}
// }
