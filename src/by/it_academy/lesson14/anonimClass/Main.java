package by.it_academy.lesson14.anonimClass;



import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,3,4,1,5,4,2,7};
        Date begin = new Date();
        System.nanoTime();
        Long beg =System.nanoTime();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++) {

        }

        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i=i+2){
            if(arr[i]!=arr[i+1]) {
                System.out.println(arr[i]);
                break;
            }
            if(i==arr.length-3)
                System.out.println(arr[arr.length-1]);
        }


/*
        int result = 0;
        for(int i = 0; i<arr.length;i++){
            result = result^arr[i];
        }
        System.out.println(result);*/

        Date finish = new Date();
        Long fin = System.nanoTime();
        System.out.println(fin-beg);
        }

    }

