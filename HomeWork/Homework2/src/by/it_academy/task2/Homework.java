package by.it_academy.task2;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        float[] abc = new float[1000000];
        for (int i = 0; i < abc.length; i++) {
            abc[i] = (float) (Math.random() * 1000);
        }

        System.out.println(Arrays.toString(abc));

        int count;
        for (int i = 0; i < abc.length; i++) {
            count = 1;
            boolean checker = true;
            for (int j = 0; j < i; j++) {
                if (abc[j] == abc[i]) {
                    checker = false;
                }
            }
            if (checker) {
                for (int a = i + 1; a < abc.length; a++) {

                    if (abc[i] == abc[a]) {
                        count++;
                    }
                    if (count > 1 && a == (abc.length - 1)) {
                        System.out.println("[" + abc[i] + "] - повторений " + count);
                    }
                }
            }
        }
    }
}
