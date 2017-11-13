public class Lesson2 {

    public static void main(String[] args) {

    int[] array = new int[5];
    array[0] = 35;
    array[1] = 5;
    array[2] = 10;
    array[3] = 15;
    array[4] = 20;


        System.out.println(args[0]);
        System.out.println(args[1]);
    /*


        for(int i=array.length-1; i>=0; i--){
            System.out.println("i = "+i);
            System.out.println("array = " + array[i]);
        }
        System.out.println("finish");
        for(int value: array){
            System.out.println(value);
        }
        */



        /*while(i<array.length){
            System.out.println(array[i]);
            i++;

        }
        */
        /*do {
            System.out.println(array[i]);
            i++;
        } while(i<array.length);
        */
        int min;
        int max;
        double avg;
        int sum = 0;
        for(int i=0;i<array.length; i++){
            sum = sum+array[i];
        }
        avg = sum/array.length;
        min = array[0];
        max = array[0];
        for(int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            } else if(array[i]>max){
                max=array[i];
            } else {

            }
        }
        System.out.println(avg);
        System.out.println(min);
        System.out.println(max);

        double d =5.5;
        int a =(int)d;
        String text = "100";
        int nubm=Integer.valueOf(text);
}}
