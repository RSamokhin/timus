import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long s = in.nextInt();
        double a = 1; 
        double t = Math.floor((1+Math.sqrt(8*s+1))/2);
        for(;t>0;t--){
            a = s/t - t/2+0.5;
            if ((Math.floor(a))==a&&(a>0))
                break;
        }
        out.println((long)a+" "+(long)t);
        out.flush();
    }
}