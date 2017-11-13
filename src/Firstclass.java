import javax.sound.midi.Soundbank;

public class Firstclass {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 10;
        int d = 0;

        if(a>=b || c==d){
            System.out.print("True");
        } else{
            System.out.print("False");
        }
        int s1=10;
        switch(s1){
            case 5: {
                System.out.println("1111");
                break;
            }
            case 7: {
                System.out.println("2222");
                break;
            }
            case 10: {
                System.out.println("3333");
                break;
            }
            default: {
                System.out.println("4444");
                break;
            }
        }

        String text2 = "asdh5 jk1123";

        int size = text2.length();
        System.out.println(size);
        String text3 = text2.substring(0,5);
        System.out.println(text3);
        int f = text2.indexOf("1");
        System.out.println(f);


    }
}
