import java.io.PrintWriter;
import java.util.Scanner;
public class t1502{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long n = in.nextInt();
        out.println((n+2)*(((0+n)*(n+1))/2));
        out.flush();
    }
}