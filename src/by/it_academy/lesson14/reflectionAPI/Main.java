package by.it_academy.lesson14.reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        Class classTest = test.getClass();
        System.out.println(classTest.getName());
        int mod = classTest.getModifiers();
        if (Modifier.isAbstract(mod)) {
            System.out.println("Абстрактный");
        } else {
            System.out.println("Not Abstract");
        }
        if (Modifier.isPublic(mod)) {
            System.out.println("Public");
        } else {
            System.out.println("Not public");
        }

        Field[] fields = classTest.getDeclaredFields();
        for (Field f : fields) {

            f.setAccessible(true);
            try {
                System.out.println(f.get(test));
                f.set(test, 5);
                System.out.println(f.get(test));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

        Method[] methods = classTest.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getParameterCount());
        }


    }
}
