// import java.util.Arrays;
// import java.util.Comparator;


//   public class ArraySort {

//       public static void sort(int[][] ob, final int[] order) {
//           Arrays.sort(ob, new Comparator<Object>() {
//               public int compare(Object o1, Object o2) {
//                   int[] one = (int[]) o1;
//                   int[] two = (int[]) o2;
//                   for (int i = 0; i < order.length; i++) {
//                       int k = order[i];
//                       if (one[k] > two[k]) {
//                           return 1;
//                       } else if (one[k] < two[k]) {
//                           return -1;
//                       } else {
//                           continue;  //�����һ�����ȽϽ����ȣ���ʹ�õڶ����������бȽϡ�
//                       }
//                   }
//                   return 0;
//               }
//           });
//       }

//       public static void main(String[] args) {
//     	  //chapter 1:
// //          int array[][] = new int[][] {
// //                  { 12, 34, 68, 32, 9, 12, 545 },
// //                  { 34, 72, 82, 57, 56, 0, 213 },
// //                  { 12, 34, 3, 32, 21, 945, 23 },
// //                  { 91, 10, 3, 2354, 73, 34, 18 },
// //                  { 12, 83, 189, 26, 27, 98, 33 },
// //                  { 47, 23, 889, 24, 899, 23, 657 },
// //                  { 12, 34, 68, 3, 878, 235, 768 },
// //                  { 12, 34, 98, 56, 78, 12, 546 },
// //                  { 26, 78, 2365, 78, 34, 256, 873 } };
// //          //sort(array, new int[] {0,1});   //�ȸ��ݵ�һ�бȽϣ�����ͬ���ٱȽϵڶ���
// //
// //          //way 2: �򵥵ķ����� ֻ��ǰ���У�
// //          Arrays.sort(array,(a,b) -> a[0]==b[0]? a[1]-b[1] : a[0]-b[0]);
// //
// //          //way 3 ֻ���յ�һ������ ��С����
// //          //Arrays.sort(array, (a, b) -> (a[0] - b[0]));
// //          for (int i = 0; i < array.length; i++) {
// //              for (int j = 0; j < array[i].length; j++) {
// //                  System.out.print(array[i][j]);
// //                  System.out.print("\t");
// //              }
// //              System.out.println();
// //          }

//           //charpter 2
//           int[][] map=new int[4][5];
//           int[] ten=new int[10];
//           Arrays.fill(ten, -1);
//           Arrays.fill(map,ten);
//           for(int i=0;i<map.length;i++) {
//         	  for(int j=0;j<map[0].length;j++) {
//         		  System.out.print(map[i][j]);
//         	  }
//         	  System.out.print("\t");
//           }
//       }
//   }