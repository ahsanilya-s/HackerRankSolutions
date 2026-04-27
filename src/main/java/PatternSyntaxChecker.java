import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
 * Revision notes (Pattern Syntax Checker)
 *
 * Goal:
 * - For each regex pattern, print "Valid" if it compiles, otherwise "Invalid".
 *
 * Approach:
 * - Try Pattern.compile(pattern)
 * - Catch PatternSyntaxException
 *
 * Complexity:
 * - Depends on regex length/structure; compilation is roughly O(L) for typical patterns.
 */
public class PatternSyntaxChecker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] patterns = new String[n];
        for(int i = 0; i<n;i++){
            patterns[i] = scan.next();
        }
        scan.close();

        for(String pattern : patterns){
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}