import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int max=0,s=0;
        for (int i = 0 ; i <n ; i++){
            int t = in.nextInt();
            max=(t>max)?t:max;
            s+=t;
        }
        out.println(s+max);
        out.flush();
    }
}