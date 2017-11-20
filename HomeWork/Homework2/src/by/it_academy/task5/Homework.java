package by.it_academy.task5;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] lastarr = new int[30];
        for(int i=0;i<lastarr.length;i++){
            lastarr[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(lastarr));
        Arrays.sort(lastarr);
        System.out.println(Arrays.toString(lastarr));

    }
}
