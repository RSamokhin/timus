import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long x = in.nextLong(), y = in.nextLong(), c = in.nextLong();
        if (c <= Math.max(x, y))
            out.println( (x==Math.max(x, y))?(c+" "+0):(0+" "+c)  );
        else
            if (x+y<c)
                out.println("Impossible");
            else
                out.println(  (x==Math.min(x, y))?(x+" "+(c-x)):((c-y)+" "+y)  );
                //out.println(Math.min(x, y)+" "+(c-Math.min(x, y)));
        out.flush();
    }
} 