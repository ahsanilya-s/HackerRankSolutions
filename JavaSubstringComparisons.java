import java.io.*;
import java.util.*;

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