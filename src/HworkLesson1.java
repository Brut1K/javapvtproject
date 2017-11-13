public class HworkLesson1 {
    public static void main(String[] args) {

        String name = "This is not short text, this is a long-long text!";
        System.out.println("Количество символов в нашей строке " + name.length());
        int half = name.length() / 2;
        String firsthalf = name.substring(0, half);
        String secondhalf = name.substring(half);
        System.out.println("Первая половина строки длиной " + firsthalf.length() + ": " + firsthalf);
        System.out.println("Вторая половина строки длиной " + secondhalf.length() + ": " + secondhalf);

        int l1t2 = 1234332755;
        String l1t2string = Integer.toString(l1t2);
        if (l1t2string.charAt(l1t2string.length() - 1) == '7') {
            System.out.println("На конце числа цифра 7");
        } else {
            System.out.println("На конце числа не цифра 7");
        }

        //длина и ширина прямоугольника и радиус круга, a b r
        int a = 4;
        int b = 4;
        int r = 5;
        // круг сможет закрыть собой прямоугольник, если сможет закрыть угол прямоугольника.
        // Т.е. если 1/2 диагонали прямоугольника будет меньше радиуса круга
        if (Math.sqrt(a * a + b * b) <= r) {
            System.out.println("Можно закрыть");
        } else {
            System.out.println("Нельзя закрыть");
        }


        int l1t4 = 187236120;
        String l1t4string = Integer.toString(l1t4);
        char l1t4char = l1t4string.charAt(l1t4string.length() - 1);
        if (l1t4char == '1' || l1t4char == '2' || l1t4char == '3' || l1t4char == '4') {
            System.out.println(l1t4 + " рубля");
        } else {
            System.out.println(l1t4 + " рублей");
        }


    }





}
