package by.it_academy.task2;

public class Main {
    public static void main(String[] args) {
        int[] arr10 = new int[10];
        int[] arr20 = new int[20];

        for (int i = 0; i<arr10.length;i++){
            arr10[i]=1;
        }
        for (int i = 0; i<arr20.length;i++){
            arr20[i]=0;
        }

        printArray(arr10);
        printArray(arr20);
        System.arraycopy(arr10,0,arr20,5,10);
        printArray(arr20);


    }



    public static void printArray(int[] arr){
        System.out.print("[");
        for(int a:arr){
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}
