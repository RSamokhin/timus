import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1 ; i <= n ; i ++){
            out.print(i+" ");
        }
        out.println();
        for (int i = 1 ; i <= m ; i ++){
            out.print(2*n*i+" ");
        }
        out.flush();
    }
}