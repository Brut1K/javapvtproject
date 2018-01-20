package by.it_academy.lesson19.task2;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Main {
    private static Student student = new Student();

    public static void main(String[] args) {

        //сильная ссылка
        Student student2 = new Student();


        //мягкая ссылка удаляется только при нехватке памяти
        SoftReference<Student> studentSoftReference
                = new SoftReference<Student>(new Student() );

        student = studentSoftReference.get();

        //слабая ссылка удаляется если остались только слабые ссылки
        WeakReference<Student> studentWeakReference
                = new WeakReference<Student>(new Student());

        student = studentWeakReference.get();




        Main main = new Main();
        main.test();
    }


     void test(){
        Student student1 = new Student();

    }
}
