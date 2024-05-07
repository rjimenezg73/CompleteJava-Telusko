public class TypeConversion {
  public static void main(String[] args) {
    // Explicit Conversion
    byte b = 127;
    int a = b;

    int a2 = 12;
    byte k = (byte)a2;

    float f = 5.6f;
    int t = (int) f;

    System.out.println("*** Explicit Conversion ***");
    System.out.println(a);
    System.out.println(k);
    System.out.println(t);

    //Type promosion
    byte ax = 10;
    byte bx = 30;
    int result = ax * bx;

    System.out.println("*** Type Promosion ***");
    System.out.println(result);
  }
}
