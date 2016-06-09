import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt()-1, k = in.nextInt();
        int i=1;
        int s=0;
        while ((i<k)&&(n>0)){
            n=n-i;
            i=((i*2<k)?(i*2):(k));
            s++;
        }
        s=s+n/k+(((n%k)>0)?1:0);
        out.print(s);
        out.flush();
    }
}