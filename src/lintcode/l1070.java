// package lintcode;
// package lc;
// import java.lang.*;
// import java.io.*;
// // Definition for singly-linked list.
// class ListNode {
//    int val;
//    ListNode next;
//   ListNode(int x) { val = x; }
// }
// //Definition for a binary tree node.
// class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode(int x) { val = x; }
// }

// public class Solution {
//   /**
//    * @param accounts: List[List[str]]
//    * @return: return a List[List[str]]
//    */
//   class unionFind{
//       public int[] father;
//       unionFind(int n){
//           father = new int[n];
//           for(int i=0;i<n;i++){
//               father[i] = i;
//           }
//       }
//       public int findFather(int index){
//           int id = index;
//           while(id != father[id]){
//               id = father[id];
//           }
//           int result=id;
//           id = index;
//           while( id != father[id]){
//               int temp = father[id];
//               father[id] = result;
//               id=temp;
//           }
//           return result;
//       }
//       public void union(int a, int b){
//           int fatherA = findFather(a);
//           int fatherB = findFather(b);
//           father[fatherA] = fatherB;
//       }
//   }

//   public List<List<String>> accountsMerge(List<List<String>> accounts) {
//       // write your code here
//       unionFind uf = new unionFind(accounts.size());
//       Map<String,Integer> emailToUser = new HashMap<>();
//       for(int i=0;i<accounts.size();i++){
//           List<String> lineEmail = accounts.get(i);
//           for (int j=1;j<accounts.get(i).size();j++){
//               String email = lineEmail.get(j);
//               if(!emailToUser.containsKey (email)){
//                   emailToUser.put(email,i);
//               }
//               uf.union(emailToUser.get(lineEmail.get(1)), emailToUser.get(email));
//           }
//       }

//       Map<Integer,List<String>> userToEmail = new HashMap<>();
//       List<List<String>> ans= new ArrayList<>();
//       for( String email: emailToUser.keySet()){
//           int father = uf.findFather(emailToUser.get(email));
//           userToEmail.putIfAbsent(father,new ArrayList<>());
//           userToEmail.get(father).add(email);
//       }
//       for(Integer user: userToEmail.keySet()){
//           List<String> emails = userToEmail.get(user);
//           Collections.sort(emails);
//           emails.add(0,accounts.get(user).get(0));
//           ans.add(emails);
//       }
//       return ans;
//   }
// }


// public class l1070 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		int[] cand= {1,4,2,7,4,6,2};
		
// 		Object a=test.combinationSum(cand, 7);
// 		System.out.println("Hello World");

// 	}
// }
