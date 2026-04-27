import java.io.*;
import java.util.*;

/*
 * Revision notes (Java Regex - Validate IP Address)
 *
 * Goal:
 * - For each input token, print "true" if it matches a valid IPv4 address,
 *   otherwise print "false".
 *
 * Approach:
 * - Use a regex that matches 4 octets separated by dots.
 * - Each octet must be between 0 and 255.
 *
 * Regex breakdown (octet):
 * - 25[0-5]      => 250-255
 * - 2[0-4]\\d    => 200-249
 * - [01]?\\d\\d? => 0-199 (with optional leading digit)
 *
 * Complexity:
 * - Time: O(L) per token (L = string length), handled by regex engine
 */
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