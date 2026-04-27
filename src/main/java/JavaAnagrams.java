import java.util.*;

/*
 * Revision notes (Java Anagrams)
 *
 * Goal:
 * - Print "Anagrams" if two strings contain the same letters with the same counts
 *   (case-insensitive), else "Not Anagrams".
 *
 * Approach:
 * - Convert to lowercase
 * - Sort both char arrays
 * - Compare with Arrays.equals
 *
 * Complexity:
 * - Time: O(n log n)
 * - Space: O(n)
 *
 * Interview tip:
 * - An alternative is counting frequency (O(n)) using int[26] for a-z.
 */
public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next().toLowerCase();
        String b = scan.next().toLowerCase();
        scan.close();

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
