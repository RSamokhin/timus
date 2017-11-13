import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;


public class t1263 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(),m = in.nextInt();
        double [] a = new double[n];
        for (int i = 0 ; i < m ; i ++){
            a[in.nextInt()-1]++;
        }
        for (int j = 0 ; j < n ; j ++){
          DecimalFormat twoDForm = new DecimalFormat("#0.00");
          out.println(twoDForm.format((a[j]*100)/m)+"%");
        }
        out.flush();
    }

} 