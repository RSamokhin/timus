import java.util.Scanner;
import java.io.PrintWriter;
public class t1083{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.next().length();
        int i = 1, s=n;
        while (n-i*k>0){
            s *= n - k * i;
            i++;
        }
        out.println(s);
        out.flush();
    }
}