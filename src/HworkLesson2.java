import java.lang.reflect.Array;
import java.util.Arrays;

public class HworkLesson2 {
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

        float[] abcd = new float[10000];
        for(int i = 0;i<abcd.length;i++){
            abcd[i]=(float) (Math.random()*1000);
        }
        float[]abc=abcd;
        System.out.println(Arrays.toString(abc));

        int count = 0;
        for (int i = 0;i<abc.length;i++) {
            float check = 0.00f;
            if (abc[i] == check) {
                count++;
            }
            if (count != 0) {
                System.out.println("[0.00f] - повторений " + count);
            }
        }
            for(int i=0;i<abc.length;i++){

            for(int a = i+1;a<abc.length;a++){
                count = 1;
                if(abc[i]==abc[a]&&abc[a]!=0.00f){
                    count++;
                    abc[a]=0.00f;
                }
                if (count>1){
                    System.out.println("["+abc[i]+"] - повторений "+count);
                }
            }
        }


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


        int num = (int) (Math.random()*1000);
        System.out.println(num);
        String numSTR = Integer.toString(num);
        boolean nn = false;
        for(int i=0; i<numSTR.length()-1;i++){
            if((numSTR).charAt(i)<(numSTR).charAt(i+1)){
                nn = true;
            } else{
                nn = false;
                System.out.println("Не образуют последовательности");
                break;
            }
        }
        if(nn){
            System.out.println("Образует последовательность");
        }


        int[] lastarr = new int[30];
        for(int i=0;i<lastarr.length;i++){
            lastarr[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(lastarr));
        Arrays.sort(lastarr);
        System.out.println(Arrays.toString(lastarr));


    }
}
