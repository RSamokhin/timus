import java.io.PrintWriter;
import java.util.Scanner;
public class t1009{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(),k = in.nextInt();
        int[] r = new int[n];
        r[0]=k-1;
        r[1]=k*r[0];
        for(int i=2;i<n;i++){
            r[i]=(r[i-1]+r[i-2])*(k-1);
        }
        out.println(r[n-1]);
        out.flush();
    }
}