import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Revision notes (Duplicate Words)
 *
 * Goal:
 * - Replace consecutive duplicate words in a sentence, case-insensitively.
 *   Example: "Goodbye bye bye world" -> "Goodbye bye world"
 *
 * Regex used:
 * - \\b(\\w+)   : capture a "word" (letters/digits/underscore) at a word boundary
 * - (\\s+\\1\\b): followed by whitespace + the same word again (backreference \\1)
 *
 * Notes:
 * - Pattern.CASE_INSENSITIVE makes "Hello hello" match.
 * - matcher.replaceAll(\"$1\") replaces the whole match with the first captured word.
 * - In HackerRank's original problem, you typically print the replaced line.
 */
public class DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "\\b(\\w+)(\\s+\\1\\b)";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sc.nextLine());

        while(matcher.find()){
            String word = matcher.replaceAll("$1");
        }
    }
}
