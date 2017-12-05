package by.it_academy.lesson8.part1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        FileOutputStream o;
        try {//блок кода в котором может быть проблема
            int a = 5 / 2;
            SimpleDateFormat sdf = new SimpleDateFormat("");
            Date date = sdf.parse("asdasdaa");
            o = new FileOutputStream(new File(""));
            //       o.write("asdasd");

        } catch (ArithmeticException e) {
            //блок кода, который выполнится если будет искл
            //отсавлять сообщения, чтобы было проще понять потом

            System.out.println("делить на 0 нельзя\n" + e.toString());
        } catch (Exception e) {
            //  e.printStackTrace();
            System.out.println("parseException");
        } finally { //блок кода, который выполняется всегда
            System.out.println("finally");
            //       if(o!=null)
            //          o.close();

        }
        try {
            double result = test(5, 0);
        } catch (Exception e) {
            System.out.println(e.toString());
        }


        try {
            double res2 = test(10, 5);
        } catch (fiveException e) {
            //  e.printStackTrace();
            System.out.println(e.getErrorCode());
        }

    }

    public static double test(int a, int b) throws fiveException {

        if (b == 5) {
            throw new fiveException();
        }
        return (double) a / b;
    }


}
