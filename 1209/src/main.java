import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int m = 0 ; m < n ; m++){
            a[m] = in.nextInt();
        }
        for(int j = 0 ; j < n ; j++){
            int i = a [j];
            int k = 0;
            int s = 0;
            while(s < i){
                s = s +k;
                k++;
            }
            if (s==i){
                out.println(1);
            }else{
                out.println(0);
            }
        }
        out.flush();
    }
}

//1101001000100001000001000000
//01 3  6   10   15    21
//01 2  3   4    5     6