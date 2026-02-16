
import java.util.Scanner;


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