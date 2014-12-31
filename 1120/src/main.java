import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long s = in.nextInt();
        long i = 1;
        double t = 1;
        for(;i<s;i++){//26263 25600  1000000000
            t =  (0-2*i+1+Math.sqrt((2*i-1)*(2*i-1)+8*s))/2;
            if ((Math.floor(t)==t)&&(t>0))
                break;
        }
        out.println(i+" "+(long)t);
        out.flush();
    }
}