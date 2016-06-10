import java.io.*;
import java.util.*;

public class t1313 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] m = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                m[i][j] = in.nextInt();
            }
        }
        
        for (int f = 0 ; f <= n*2-2 ; f++){
            for(int i = 0 ; i < n ; i++){
                for (int j = 0 ; j < n ; j++){
                    if (i+j==f){
                        out.print(m[j][i]);
                        out.print (' ');
                    }
                    if (i+j>f)
                         break;
                 }
            }
        }
        out.flush();
    }
} 