// package lc;
// import java.lang.*;



// class AutocompleteSystem {
//   class TrieNode {
//       TrieNode[] children;
//       String s;
//       int times;
//       List<TrieNode> hot;
      
//       public TrieNode() {
//           children = new TrieNode[128];
//           s = null;
//           times = 0;
//           hot = new ArrayList<>();
//       }
      
//       public void update(TrieNode node) {
//           if (!hot.contains(node)) {
//               hot.add(node);
//           }
          
//           Collections.sort(hot, (a,b) -> {
//                if (a.times == b.times) {
//               return a.s.compareTo(b.s);
//           }
          
//           return b.times - a.times;
//           });
          
//           if (hot.size() > 3) {
//               hot.remove(hot.size() - 1);
//           }
//       }
//   }
  
//   TrieNode root;
//   TrieNode cur;
//   StringBuilder sb;
//   public AutocompleteSystem(String[] sentences, int[] times) {
//       root = new TrieNode();
//       cur = root;
//       sb = new StringBuilder();
      
//       for (int i = 0; i < times.length; i++) {
//           add(sentences[i], times[i]);
//       }
//   }
  
  
//   public void add(String sentence, int t) {
//       TrieNode tmp = root;
      
//       List<TrieNode> visited = new ArrayList<>();
//       for (char c : sentence.toCharArray()) {
//           if (tmp.children[c] == null) {
//               tmp.children[c] = new TrieNode();
//           }
          
//           tmp = tmp.children[c];
//           visited.add(tmp);
//       }
      
//       tmp.s = sentence;
//       tmp.times += t;
      
//       for (TrieNode node : visited) {
//           node.update(tmp);
//       }
//   }
  
//   public List<String> input(char c) {
//       List<String> res = new ArrayList<>();
//       if (c == '#') {
//           add(sb.toString(), 1);
//           sb = new StringBuilder();
//           cur = root;
//           return res;
//       }
      
//       sb.append(c);
//       if (cur != null) {
//           cur = cur.children[c];
//       }
      
//       if (cur == null) return res;
//       for (TrieNode node : cur.hot) {
//           res.add(node.s);
//       }
      
//       return res;
//   }
// }





// public class lc642 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
		
// 		Object a=test.reverseVowels("hello");
// 		System.out.println("Hello World");

// 	}
// }
