import java.io.*;
import java.util.*;

class MyRegex {
    String pattern = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
}

public class JavaRegex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();

        while (scan.hasNext()) {
            String input = scan.next();
            if (input.matches(myRegex.pattern)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        scan.close();
    }
}