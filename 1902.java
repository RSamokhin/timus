import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
public class t1902{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        double n = in.nextInt(), t = in.nextInt(), s = in.nextInt();
        DecimalFormat dc = new DecimalFormat(".000000");
        for (int i = 0 ; i < n ; i ++){
            out.println(dc.format((s+(in.nextInt()-s+t)/2)));
        }
        out.flush();
    }
}