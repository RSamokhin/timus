import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String t = in.nextLine();
        char[]a = t.toCharArray();
        int[] b = new int[a.length+1];
        b[0]=5;
        int j = 1;
        for (int i = 1 ; i < b.length ; i++){
            int f = (int)a[i-1]-97;
            j = j + ((f<5)?(0):(1)); 
            b[i] = ((f-b[i-1])+26*j)%26+b[i-1];
        }
        for (int i = b.length-1;i>0;i--){
            b[i] = b[i]-b[i-1];
        }
        for (int i = 1 ; i < b.length ; i++)
            out.print((char)(b[i]+97));
            //out.println(b[i]);
        out.flush();
    }
}