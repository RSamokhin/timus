import java.io.PrintWriter;
import java.util.Scanner;
public class t1255{
    public static void main(String[]args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), l = in.nextInt();
        int s = (n*(n/l))+((n%l)*(n/l));
        out.println(s);
        out.flush();
    }
}