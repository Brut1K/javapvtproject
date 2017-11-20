package by.it_academy.task2;

public class Main {
  //  public static String a ="Hello";
    public static void main(String[] args) {
    /*   by.it_academy.task1.Main hello("Alex");
        int result = 0;
        System.out.println(plus(12,123));
    }

    public static int plus(int a, int b){
        int sum = a+b;
        return sum;

*/
  /*      System.out.println(a);
        int a = 20;
        System.out.println(a);
        System.out.println(Main.a);
    */
  test(10,10);
  getTriangleSquare(4,5);
  square(5);
  rectangle(6,6);
        System.out.println(getTriangleSquare(3.54f,7.123f));

    }
/**Этот метод возвращает площадь треугольника.
 * @param a а основание треугольника
 * @param b b высота проведенная к основанию*/
    public static double getTriangleSquare(float a,float b){
        return (double)a*b/2;
    }

    /**
     * calculate square of square
     * @param a side fo square
     * @return
     */
    public static double square(int a){
        return (double)a*a;
    }

    /**
     * Calculate square of rectagle
     * @param a width
     * @param b height
     * @return square
     */
    public static double rectangle(int a, int b){
        return (double)a*b;
    }


    public static void test(long a, long b){
        System.out.println("LONG");
    }
    public static void test(int a, int b){
        System.out.println("int");
    }
    public static void test(double a, double b){
        System.out.println("DOUBLE");
    }


 /*   public static String plusaa() {
        String a =null;
    }
*/


}
