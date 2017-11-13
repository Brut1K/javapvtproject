public class HworkLesson1 {
    public static void main(String[] args) {

        String name = "This is not short text, this is a long-long text!";
        System.out.println("Количество символов в нашей строке " + name.length());
        int half = name.length()/2;
        String firsthalf = name.substring(0,half);
        String secondhalf = name.substring(half);
        System.out.println("Первая половина строки длиной " + firsthalf.length() + ": " + firsthalf);
        System.out.println("Вторая половина строки длиной " + secondhalf.length() + ": " + secondhalf);

        

    }
}
