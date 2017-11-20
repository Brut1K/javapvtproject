


import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
/*
        Integer a = 100;    //-128 +127
        Integer b = 100;
        if(a.equals(b)){
            System.out.println("true");
        } else{
            System.out.println("False");
        }

        String a2 = new String("Hello");
        String b2 = new String("Hello");
        if(a2==b2){
            System.out.println("true 2");
        } else{
            System.out.println("False 2");
        }

        String a3 = "Hello";    //всегда кэширует
        String b3 = "Hell"+"o";  //если заменить "о" на переменную, то false
        if(a3==b3){
            System.out.println("true 3");
        } else{
            System.out.println("False 3");
        }
*/

    /*    int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а");
        a = scanner.nextInt();
        System.out.println("Введите b");
        b = scanner.nextInt();
        System.out.println(a+b);
    */
    int alfa =5;
    test2(alfa, 146,"Alex");
    hello("My friend");

    }

    public static void test2(int value,int value2,String textff) {
        System.out.println("TEST"+value+"\nValue2: "+value2+textff);

    }

    public static void hello(String arg) {
        System.out.println("hello "+arg);
    }
    String[] array = new String[2];
   /* array[0] = "asd";
    array[1] = "123123";
    printArray(array);
    public static void printArray(String[] a) {
        System.out.println(Arrays.toString(a));
*/

    }
//}
