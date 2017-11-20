package by.it_academy.task3;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i=0; i<arr.length; i++){
            arr[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        int[] arr_rev = new int[20];
        for(int i=0;i<arr.length;i++){
            arr_rev[arr.length-i-1]=arr[i];
        }
        System.out.println(Arrays.toString(arr_rev));

    }
}
