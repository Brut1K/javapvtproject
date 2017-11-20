package by.it_academy.task1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int[] arr = createArray(5);
        printArray(arr);
        bubble_sort(arr);
        printArray(arr);
    }

    // создает массив типа int, входной аргумент-длина массива
    public static int[] createArray(int a) {
        int[] arr = new int[a];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите элемент массива с индексом: " + i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    //выводит на печать массив
    public static void printArray(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.print("\""+array[i]+"\"|");
        }
        System.out.println();
    }

    public static void bubble_sort(int[] array){
        for(int i = array.length-1; i>0;i--){
            for(int j =0;j<i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            
            int min = arr[i];
            int min_i = i;


            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }


            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

}

