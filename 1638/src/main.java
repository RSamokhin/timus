import java.io.PrintWriter;
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int f = in.nextInt(), t = in.nextInt(), n = in.nextInt(), o = in.nextInt();
        out.println((Math.abs(o-n)+((n<o)?-1:1))*f+Math.abs(o-n)*2*t);
        out.flush();
    }
}