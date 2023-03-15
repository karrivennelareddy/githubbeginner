import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
       int sum=0;
       for(int i=2; i<=N; i++)
       {
        if(i%2==0)
        {
            sum+=i;
        }
       }
         System.out.println(sum);
    }
}
