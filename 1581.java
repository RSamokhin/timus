import java.io.*;
import java.util.*;

public class t1581 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] a = new int[n];
        int c = 0;
        for (int i = 0 ; i < n ; i++){
                int y = in.nextInt();
                a[i]= y;
                if(c>0){
                    if ((a[i-1]==y)){
                        c++;
                    }else{
                        out.print(c);
                        out.print(" ");
                        out.print(a[i-1]);
                        out.print(" ");
                        c=1;
                    }
                }else{
                   c++;
                }
                if (i==n-1){
                    out.print(c);
                    out.print(" ");
                    out.print(a[i]);
                    out.print(" ");
                }
        }
        out.flush();
    }
} 