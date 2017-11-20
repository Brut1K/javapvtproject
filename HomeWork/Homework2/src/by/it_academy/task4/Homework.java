package by.it_academy.task4;

public class Homework {
    public static void main(String[] args) {
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
    }
}
