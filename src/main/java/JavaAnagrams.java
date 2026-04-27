import java.util.*;

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
