import java.util.Scanner;
import java.io.PrintWriter;
public class t1914{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(); int k = in.nextInt();
        long s = 0;
        while(in.hasNextLine()){
            in.nextLine();
        }
        out.println((n*(n-1))/2-k);
        out.flush();
    }
}