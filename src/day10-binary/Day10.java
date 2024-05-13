import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        String binary = Integer.toBinaryString(n);
        int count = 0;
        int max = 0;
    for(int i = 0; i<binary.length();i++)
    {
        char ch = binary.charAt(i);
        int a = ch - '0';
        if(a == 1)
        {
            count++;
                max = Math.max(count, max);
        }
        else
        {           
            count = 0;  
        } 
    }      
    System.out.println(max);
    }
}

