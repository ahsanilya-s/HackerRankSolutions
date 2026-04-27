import java.io.*;
import java.util.*;

public class Solution {

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