// package realProblem;

// import java.util.HashMap;
// import java.util.Random;

// public class randomArray {
//   public static void main(String arg[])  {
//       System.out.println("Hello World!");
//       RandomGenerator r = new RandomGenerator(10);
//       System.out.println(r.generate());
//       System.out.println(r.generate());
//       System.out.println(r.generate());
//       System.out.println(r.generate());
//       System.out.println(r.generate());
//       System.out.println(r.generate());
//       System.out.println(r.generate());
//       System.out.println(r.generate());
//       System.out.println(r.generate());
//       System.out.println(r.generate());
      
//   }
// }

// class RandomGenerator {

//   int size;
//   HashMap<Integer, Integer> map;
// public RandomGenerator(int n) {
//       size = n;
//     map = new HashMap<>();
//   }

// public int generate() {
//   Random r = new Random();
//       int x = r.nextInt(size);
//       size--;
//       System.out.println("....."+x);
//       var res = map.containsKey(x) ? map.get(x)+1 : x+1;
//       if(x<size){ // Means x position is vacant and we need to map x to last element or value it holds. As last element will not participate in random next time.
//           if(!map.containsKey(x)){ // THis SPOT NOW CAN HOLD.
//               map.put(x,0);
//           }
//           if(map.containsKey(size)){
//               // Assign map[x] = Value pointed by last
//               map.put(x,map.get(size));
//           }
//           else{
//               map.put(x,size); // Assign map[x] = last value
//           }
//       }
      
//       return res;
// }
// }