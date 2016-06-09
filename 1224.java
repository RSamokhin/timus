import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long a = in.nextLong(),b=in.nextLong();
        out.println(((Math.min(a,b)-1)*2+((a<=b)?0:1)));
        out.flush();
    }
}