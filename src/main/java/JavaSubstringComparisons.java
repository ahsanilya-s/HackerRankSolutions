import java.io.*;
import java.util.*;

/*
 * Revision notes (Java Substring Comparisons)
 *
 * Goal:
 * - For a given string and k, print:
 *   1) the lexicographically smallest substring of length k
 *   2) the lexicographically largest substring of length k
 *
 * Approach:
 * - Slide a window of length k over the string
 * - Track min/max using String.compareTo (lexicographic order)
 *
 * Complexity:
 * - Time: O((n-k+1) * k) due to substring creation/compare cost
 * - Space: O(1) extra (not counting substring objects)
 *
 * Interview tip:
 * - For very large inputs, avoid creating many substrings; compare via indices if needed.
 */
public class JavaSubstringComparisons {
    
    public static String getSmallestSubstring(String str, int k) {
        // Find the lexicographically smallest substring of length k
        String smallest = str.substring(0, k);
        
        for (int i = 1; i <= str.length() - k; i++) {
            String current = str.substring(i, i + k);
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
        }
        
        return smallest;
    }
    
    public static String getLargestSubstring(String str, int k) {
        // Find the lexicographically largest substring of length k
        String largest = str.substring(0, k);
        
        for (int i = 1; i <= str.length() - k; i++) {
            String current = str.substring(i, i + k);
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }
        
        return largest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int k = sc.nextInt();
        
        System.out.println(getSmallestSubstring(str, k));
        System.out.println(getLargestSubstring(str, k));
        
        sc.close();
    }
}