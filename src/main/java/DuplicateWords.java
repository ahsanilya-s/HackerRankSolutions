import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
