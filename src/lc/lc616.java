//import java.util.HashMap;
//import com.sun.javafx.image.IntPixelAccessor;
//
//import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
// // Definition for singly-linked list.
//class ListNode {
//      int val;
//      ListNode next;
//     ListNode(int x) { val = x; }
//}
// //Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
////my
//class Solution2 {
//    public String addBoldTag(String s, String[] dict) {
//    	boolean[] should=new boolean[s.length()];
//        for(int i=0,end=0;i<s.length();i++){
//            for(String word:dict){
//                if(s.startsWith(word,i))
//                    end=Math.max(end,i+word.length());
//            }
//            should[i]=end>i;
//        }
//        
//        StringBuilder ans=new StringBuilder();
//        for(int i=0;i<s.length();i++){
//            if(!should[i]){
//                ans.append(s.charAt(i));
//                continue;
//            }
//            int j=i;
//            while(j<s.length()&&should[j]){
//                j++;
//            }
//            ans.append("<b>"+s.substring(i,j)+"</b>");
//            i=j-1;
//        }
//        return ans.toString();
//    }
//}
//class Solution {
//	public String addBoldTag(String s, String[] dict) {
//        boolean[] shouldBold = new boolean[s.length()];
//        for (int i = 0, end = 0; i < s.length(); i++) {
//            for (String word : dict) {
//                if (s.startsWith(word, i)) {
//                    end = Math.max(end, i + word.length());
//                }
//            }
//            shouldBold[i] = end > i;
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (!shouldBold[i]) {
//                stringBuilder.append(s.charAt(i));
//                continue;
//            }
//            int j = i;
//            while (j < s.length() && shouldBold[j]) {
//                j++;
//            }
//            stringBuilder.append("<b>" + s.substring(i, j) + "</b>");
//            i = j - 1;
//        }
//        return stringBuilder.toString();
//    }
//
//}
//
//
//
//public class lc616 {
//	public static void main(String arg[]) {
//		Solution2 test=new Solution2();
//		
//		String s = "abcxyz123";
//		String[] dict = new String[] {"abc","123"};
//		//int[] digits=new int[] {2,4,3,9};
//		String a=test.addBoldTag(s, dict);
//		System.out.println("Hello World");
//		
//		String b=s.substring(0, 2);
//		System.out.println("Hello World");
//
//	}
//}
