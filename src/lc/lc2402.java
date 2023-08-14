// package lc;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.PriorityQueue;
// import java.util.Set;

// // Time average O(nlogn), space O(logn)
// class Solution {
//     public int mostBooked(int n, int[][] meetings) {
//         Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
//         PriorityQueue<long[]> queue = new PriorityQueue<>((a, b) ->
//                                                           a[0] == b[0] ? (int) (a[1] - b[1]) : (int) (a[0] - b[0]));
//         // {endTime, room}
//         int[] roomCount = new int[n]; // number of meeting of the room
//         int result = 0;
//         for (int i = 0; i < n; i++)
//             queue.add(new long[] { 0, i });
//         for (int[] item : meetings) {
//             int time = item[0]; // new meeting start time
//             // order all available room by room index
//             while (queue.peek()[0] < time)
//                 queue.add(new long[] { time, queue.poll()[1] });
//             long[] current = queue.poll();
//             int curRoom = (int) current[1];
//             long meetingEndTime = current[0] + (item[1] - item[0]); // current room endTime + this meeting time
//             roomCount[curRoom]++;
//             // update result
//             if (roomCount[curRoom] > roomCount[result])
//                 result = curRoom;
//             else if (roomCount[curRoom] == roomCount[result])
//                 result = Math.min(result, curRoom);
//             queue.add(new long[] { meetingEndTime, curRoom });
//         }
//         return result;
//     }
// }


// public class lc2402 {
// 	public static void main(String arg[]) {
// 		Solution test=new Solution();
//     int n = 2;
//     int[][] meetings = {{0,10},{1,5},{2,7},{3,4}};

// 		int a=test.mostBooked(n, meetings);

// 		System.out.println("Hello World");

// 	}
// }