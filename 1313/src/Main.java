import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int nn[][] = new int[n][n];
        int result[][] = new int[n*n][2];
        for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j < n; j++){
                nn[j][i] = in.nextInt();
            }
        }
        for (i = 0 ; i < n ; i++){
            result[n][1] = i 
        }
        
        
        
        //out.println(result);
        out.flush();
    }
} 