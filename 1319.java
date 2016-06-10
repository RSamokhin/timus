import java.io.*;
import java.util.*;

public class t1319 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int f = 0;
        int [][] a = new int [n][n];
        for (int m = 0 ; m <= (n-1)*2 ; m ++){
            for (int i = 0, j = m; ((i<=m)) ;i++,j--){
                if ((i<n)&&(j<n))
                    a[i][j]=++f;
            }
        }
        for (int v = 0 ; v < n ; v++){
            for (int b = n-1 ; b >=0 ; b--){
                out.print(a[v][b]);
                out.print(' ');
            }
            out.println();
        }
        out.flush();
    }
}