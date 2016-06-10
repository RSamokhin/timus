import java.io.PrintWriter;
import java.util.Scanner;
public class t1139{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(),m = in.nextInt();
        int nod = 1;
        int a=(n-1),b=(m-1);
        while((a!=0)&&(b!=0)){
            if (a>b)
                a=a%b;
            else
                b=b%a;
        }
        out.println(m+n-a-b-2);
        out.flush();
    }
}