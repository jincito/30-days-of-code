import java.io.*;
import java.util.*;

public class Solution {
    
    public static void divideString(String s) {
        int i = 0;
        int j = 1;
        while (i <= (s.length()-1)) {
            System.out.print(s.charAt(i));
            i += 2;
        }
        System.out.print(" ");
        while (j <= (s.length()-1)) {
            System.out.print(s.charAt(j));
            j += 2;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s;
        for (int i = 0; i < n; i++) {
            s = scan.nextLine();
            System.out.println(s);
            // for (int j = 0; s.length()-1 ; j++) {
            //     divideString(s);
            // }
        }
    }
}

