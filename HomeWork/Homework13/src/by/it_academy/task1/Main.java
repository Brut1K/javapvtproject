package by.it_academy.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main( String args[] ) {
        String line = "Helloooo wwwOooorrrldddd. Striiiing tooo llloNNNNGGG";
        System.out.println(line);

        String[] arr = {"A|a","B|b","C|c","D|d","E|e","F|f","G|g","H|h","I|i",
                "J|j","K|k","L|l","M|m","N|n","O|o","P|p","Q|q","R|r","S|s","T|t",
                "U|u","V|v","W|w","X|x","Y|y","Z|z"};
        StringBuilder sbPattern = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        String pattern;
        Pattern r;
        Matcher m;
        for(int i = 0;i<arr.length;i++){
            sbPattern.append("(\\.*)([");
            sbPattern.append(arr[i]);
            sbPattern.append("]{2,})(\\.*)");
            pattern = sbPattern.toString();
            sbPattern.delete(0,sbPattern.length());
            r = Pattern.compile(pattern);
            m = r.matcher(line);
            while (m.find( )) {
                int a = m.end()-m.start();
                sb.append(line.substring(0,m.start()));
                sb.append(line.substring(m.start(),m.start()+1));
                sb.append(a);
                sb.append(line.substring(m.end()));
                line = sb.toString();
                sb.delete(0,sb.length());
                m = r.matcher(line);
            }
        }
        System.out.println(line);
    }
}
