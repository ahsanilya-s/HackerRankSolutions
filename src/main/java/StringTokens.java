
import java.util.Scanner;


/*
 * Revision notes (Java String Tokens)
 *
 * Goal:
 * - Given a line, split it into alphabetic tokens (A-Z / a-z) and print:
 *   1) number of tokens
 *   2) each token on new line
 *
 * Approach:
 * - Split by any non-letter using regex: [^A-Za-z]
 * - Filter out empty/non-letter pieces using matches("[A-Za-z]+")
 *
 * Common pitfalls:
 * - Multiple separators produce empty strings after split => must filter.
 * - Leading/trailing separators also produce empty strings => must filter.
 *
 * Complexity:
 * - Time: O(n) over input length (plus regex overhead)
 * - Space: O(t) tokens created by split
 */
public class StringTokens {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split("[^A-Za-z]");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[A-Za-z]+")) {
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("[A-Za-z]+")) {
                System.out.println(words[i]);
            }
        }
    }

}