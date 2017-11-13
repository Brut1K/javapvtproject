public class HworkLesson1 {
    public static void main(String[] args) {
        String name = "This is not short text, this is a long-long text!";
        System.out.println("Количество символов в нашей строке "+
                name.length());
        int numsymbols = name.length();
        int half = numsymbols/2;
        String firsthalf = name.substring(0,half);
        String secondhalf = name.substring(half);
        System.out.println(firsthalf+firsthalf.length());
        System.out.println(secondhalf+secondhalf.length());
    }
}
