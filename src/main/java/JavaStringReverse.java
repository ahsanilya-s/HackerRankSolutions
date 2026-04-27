import java.util.*;

/*
 * Revision notes (Java String Reverse / Palindrome)
 *
 * Goal:
 * - Given a string, print "Yes" if it's a palindrome, otherwise "No".
 *
 * Approach:
 * - Build reversed string and compare to original.
 *
 * Complexity:
 * - Time: O(n^2) in Java if using String concatenation in a loop (creates many strings).
 *
 * Interview tip:
 * - Prefer StringBuilder (O(n)) or two-pointer comparison from both ends.
 */
public class JavaStringReverse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String reverserString = "";
        int length = a.length();
        for(int i = length-1; i>=0;i--){
            reverserString += a.charAt(i);
        }
        
        if(reverserString.equals(a)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    
    }
}