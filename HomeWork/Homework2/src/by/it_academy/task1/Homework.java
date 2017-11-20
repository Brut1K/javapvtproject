package by.it_academy.task1;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] l2t1 = new int[10];
        //заполняем массив рандомом
        for(int i=0;i<l2t1.length;i++){
            l2t1[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(l2t1));
        // находим минимальный и максимальный элемент
        int min = l2t1[0];
        int max = l2t1[0];
        for(int i = 1;i<l2t1.length;i++){
            if(l2t1[i]>max){
                max = l2t1[i];
            } else if(l2t1[i]<min){
                min = l2t1[i];
            }
        }
        System.out.println("min value = "+min);
        System.out.println("max value = "+max);
        // заменяем минимальные значения на 0, максимальные на 99
        for(int i = 0;i<l2t1.length;i++){
            if(l2t1[i]==min){
                l2t1[i]=0;
            }else if(l2t1[i]==max){
                l2t1[i]=99;
            }
        }
        System.out.println(Arrays.toString(l2t1));
    }
}
