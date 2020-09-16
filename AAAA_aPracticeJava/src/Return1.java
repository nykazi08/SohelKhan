public class Return1 {
  static int myMethod(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(5, 3));
  }
}
// Outputs 8 (5 + 3)

//***********************//
/*
 * public class MyClass { 
 * static int myMethod(int x, int y)
 *  { return x + y;
 *   }
 * 
 * public static void main(String[] args) { 
 * int z = myMethod(5, 3);
 * System.out.println(z); } } // Outputs 8 (5 + 3)
 */