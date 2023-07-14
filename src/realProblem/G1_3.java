//import java.sql.Array;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//class SolutionMy {
//    public static String nextClosestTime2(String time) {
//    	int now=Integer.parseInt(time.substring(0,2))*60 +Integer.parseInt(time.substring(3));
//        
//        Integer [] digitNow=new Integer[]{now/60/10,now/60%10,now%60/10,now%60%10};
//        Set<Integer> digitN=new HashSet<Integer>();
//        digitN.addAll(Arrays.asList(digitNow));
//        
//        
//        while (true){
//            now=(now+1)%1440;
//            int[] digitNew=new int[]{now/60/10,now/60%10,now%60/10,now%60%10};
//            aaa:
//            {
//                for(int d:digitNew){
//                    if(!digitN.contains(d))
//                        break aaa;
//                }
//                return String.format("%02d:%02d",now/60,now%60);
//            }
//        }
//        
//    }
//}
//class Solution {
//        public static String nextClosestTime(String time) {
//            int cur = 60 * Integer.parseInt(time.substring(0, 2));
//            cur += Integer.parseInt(time.substring(3));
//            Set<Integer> allowed = new HashSet();
//            for (char c : time.toCharArray()) {
//                if (c != ':') {
//                    allowed.add(c - '0');
//                }
//            }
//            while (true) {
//                cur = (cur + 1) % (24 * 60);
//                int[] digits = new int[]{cur / 60 / 10, cur / 60 % 10, cur % 60 / 10, cur % 60 % 10};
//                AAA:
//                {
//                    for (int d : digits) {
//                        if (!allowed.contains(d)) {
//                            break AAA;
//                        }
//                    }
//                    return String.format("%04d:%03d", cur / 60, cur % 60);
//                }
//            }
//        }
//}
//public class G1_3 {
//	public static void main(String arg[]) {
//	int[] aa= {2,7,11,15};
//	String ans=SolutionMy.nextClosestTime2("20:14");
//	System.out.println("Hello World");
//}
//}
