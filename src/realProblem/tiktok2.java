package realProblem;
// https://leetcode.com/discuss/interview-experience/1379020/google-phone-screen

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
 * const input = [
    "app/index.html",
    "app/README.md",
    "app/src/App.jsx",
    "app/src/App.css"
]



function generateFileTree (input) {
    // write your code here
}

generateFileTree(input)


output
// --app
// --index.html
// --README.md
// --src
//   --App.jsx
//   --App.css

 */

class TrieNode {
    boolean isFile = false;
    Map<String, TrieNode> next;

    TrieNode() {
        next = new HashMap<>();
    }
}

class Solution {
    TrieNode root = new TrieNode();
    public void generateFileTree(String[] input) {
        for (String s : input) {
            insertWord(s);
        }
        print(root, "");

    }

    private void print(TrieNode n, String spaces) {
        n.next.forEach((key, value) -> {
            System.out.println(spaces + key);
            print(value, spaces + " ");
        });
    }

    public void insertWord(String input) {
        TrieNode cur = root;
        String[] inputArr = input.split("/");
        for (int i = 0; i < inputArr.length; i++) {
            cur.next.putIfAbsent(inputArr[i], new TrieNode());
            
            if (i == inputArr.length - 1) {
                cur.next.get(inputArr[i]).isFile = true;
            }
            cur = cur.next.get(inputArr[i]);
        }

    }
}

public class tiktok2 {
    public static void main(String arg[]) {

        Solution s = new Solution();
        String[] input = {
                "app/index.html",
                "app/README.md",
                "app/src/App.jsx",
                "app/src/App.css"
        };
        s.generateFileTree(input);

        System.out.println("Hello World");
    }
}
