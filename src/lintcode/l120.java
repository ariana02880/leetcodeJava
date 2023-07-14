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
////ans:
//class Solution {
//    public int ladderLength(String start, String end, Set<String> dict) {
//        if (dict == null) {
//            return 0;
//        }
//
//        if (start.equals(end)) {
//            return 1;
//        }
//        
//        dict.add(start);
//        dict.add(end);
//
//        HashSet<String> hash = new HashSet<String>();
//        Queue<String> queue = new LinkedList<String>();
//        queue.offer(start);
//        hash.add(start);
//        
//        int length = 1;
//        while(!queue.isEmpty()) {    		//��ʼbfs
//            length++;
//            int size = queue.size();		//��ǰ�����Ķ��д�С
//            for (int i = 0; i < size; i++) {
//                String word = queue.poll();
//                for (String nextWord: getNextWords(word, dict)) {	//�õ��µ���
//                    if (hash.contains(nextWord)) {
//                        continue;
//                    }
//                    if (nextWord.equals(end)) {
//                        return length;
//                    }
//                    
//                    hash.add(nextWord);
//                    queue.offer(nextWord);			//������м�������
//                }
//            }
//        }
//        return 0;
//    }
//
//    // replace character of a string at given index to a given character
//    // return a new string
//    private String replace(String s, int index, char c) {
//        char[] chars = s.toCharArray();
//        chars[index] = c;
//        return new String(chars);
//    }
//    
//    // get connections with given word.
//    // for example, given word = 'hot', dict = {'hot', 'hit', 'hog'}
//    // it will return ['hit', 'hog']
//    private ArrayList<String> getNextWords(String word, Set<String> dict) {
//        ArrayList<String> nextWords = new ArrayList<String>();
//        for (char c = 'a'; c <= 'z'; c++) {					//ö�ٵ�ǰ�滻��ĸ
//            for (int i = 0; i < word.length(); i++) {		//ö���滻λ��
//                if (c == word.charAt(i)) {
//                    continue;
//                }
//                String nextWord = replace(word, i, c);
//                if (dict.contains(nextWord)) {		//���dict�а����µ��ʣ�����nextWords
//                    nextWords.add(nextWord);
//                }
//            }
//        }
//        return nextWords;							//���쵱ǰ���ʵ�ȫ����һ������							     							
//
//    }
//}
//
//public class l120 {
//	public static void main(String arg[]) {
//		Solution test=new Solution();
//		
//		
//		int[][]t= {{0,1,0,0,0},{1,0,0,2,1},{0,1,0,0,0}};
//		Object a=test.shortestDistance(t);
//		System.out.println("Hello World");
//
//	}
//}
//
