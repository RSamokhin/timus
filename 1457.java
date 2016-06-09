import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        double s=0;
        for (int i =0 ; i < n ; i++)
            s+=in.nextInt();
        out.println(String.format(String.format(new DecimalFormat("#0.000000").format(s/n))));
        out.flush();
    }
}