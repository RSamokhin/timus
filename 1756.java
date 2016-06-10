import java.util.Scanner;
import java.io.PrintWriter;
public class t1756{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int work = d1*n;
        int z = work/d2+((work%d2>0)?1:0);
        for (int i = 1 ; i < d2  ; i++ ){
            if (work > 0)
                out.print(Math.min(z,work)+" ");
            else
                out.print(0 +" ");
            work = (work - z<0)?0:work-z;
        }
        out.print((work>0)?work:0);
        out.flush();
    }
}