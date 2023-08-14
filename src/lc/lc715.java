// package lc;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
// // Definition for singly-linked list.
// import java.util.TreeMap;


// //Time:
// //Constructor: O(1),
// //addRange(left: int, right: int): O(klogn),
// //queryRange(left: int, right: int): O(logn),
// //removeRange(left: int, right: int): O(klogn), where k is # of overlapping ranges
// // Space: O(n)

// class RangeModule {
//     private TreeMap<Integer, Integer> ranges = new TreeMap<>();

//     public void addRange(int left, int right) {
//         Integer l = ranges.floorKey(left);
//         Integer r = ranges.floorKey(right);
//         if (l != null && ranges.get(l) >= left)
//             left = l;
//         if (r != null && ranges.get(r) > right)
//             right = ranges.get(r);
//         // clear left right
//         ranges.subMap(left, right).clear();
//         ranges.put(left, right);
//     }

//     public boolean queryRange(int left, int right) {
//         Integer l = ranges.floorKey(left);
//         return l == null ? false : ranges.get(l) >= right;
//     }

//     public void removeRange(int left, int right) {
//         Integer l = ranges.floorKey(left);
//         Integer r = ranges.floorKey(right);

//         if (r != null && ranges.get(r) > right)
//             ranges.put(right, ranges.get(r));

//         if (l != null && ranges.get(l) > left) {
//             ranges.put(l, left);
//         }


//         ranges.subMap(left, right).clear();
//     }
// }


// /**
//  * Your RangeModule object will be instantiated and called as such:
//  * RangeModule obj = new RangeModule();
//  * obj.addRange(left,right);
//  * boolean param_2 = obj.queryRange(left,right);
//  * obj.removeRange(left,right);
//  */



// public class lc715 {
// 	public static void main(String arg[]) {
// 		RangeModule test=new RangeModule();

//     int [][] aa = {{1950,1961},{1960,1971},{1970,1981}};

// 		test.addRange(10,20);
// 		test.addRange(30,50);
// 		test.removeRange(14,16);
// 		System.out.println("Hello World");

// 	}
// }