// package lc;

// import java.lang.*;
// import java.util.ArrayList;
// import java.util.List;
// import java.io.*;


// // mine:
// class Solution {
//   class TrieNode {
//       public TrieNode[] Chridren = new TrieNode[26];
//       public String word = "";
//   }
//   class Trie {
//       TrieNode  root = new TrieNode();
//       public void add (String s) {
//           TrieNode temp = this.root;
//           for(int i=0;i<s.length();i++){
//               if(temp.Chridren[s.charAt(i) - 'a'] == null) {
//                   temp.Chridren[s.charAt(i) - 'a'] = new TrieNode();
//               }
//               temp = temp.Chridren[s.charAt(i) - 'a'];
//           }
//           temp.word = s;
//       }
//   }
//   Trie tree = new Trie ();
//   char[][] _board = null;
//   ArrayList<String> _result = new ArrayList<String>();
//   int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
  
//   public List<String> findWords(char[][] board, String[] words) {
//       for(String word: words) {
//           tree.add(word);
//       }
//       this._board = board;
      
//       for (int i=0;i<board.length;i++) {
//           for(int j = 0;j<board[0].length; j++) {
//               if(tree.root.Chridren[board[i][j] - 'a'] != null) {
//                   helper(i,j,tree.root);
//               }
//           }
//       }
//       return this._result;
//   }
//   public void helper(int r, int c, TrieNode root) {
//       TrieNode currNode = root.Chridren[this._board[r][c] - 'a'];
//       char letter = this._board[r][c];
      
//       if(currNode.word != "" ) {
//           this._result.add(currNode.word);
//           currNode.word = "";
//       }
      
//       this._board[r][c] = '*';
//       for(int i =0 ;i<4 ;i++) {
//           int newR = r + dir[i][0];
//           int newC = c + dir[i][1];
//           if(newR<0 || newR>=this._board.length || newC<0 || newC>=this._board[0].length || this._board[newR][newC] == '*')
//               continue;
//           if(currNode.Chridren[this._board[newR][newC] - 'a']!=null){
//               helper(newR,newC, currNode);
//           }
//       }
//       this._board[r][c] = letter;
//   }
// }



// public class lc212 {
//   public static void main(String arg[]) {
// 		Solution test=new Solution();
		

//     char [][] aa ={{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
//     String [] word = {"oath","pea","eat","rain"};


//     // List<String> input= new ArrayList<>();
//     // input.addAll(Arrays.asList(aa));
    
//     List<String>  asd = test.findWords(aa,word);


// 		System.out.println("Hello World");

// 	}
// }
