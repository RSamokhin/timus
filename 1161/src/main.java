import java.util.Scanner;
import java.io.PrintWriter;
import java.util.TreeSet;
import java.text.DecimalFormat;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        TreeSet<Double>a = new TreeSet<>();
        for (int i = 0 ; i < n ; i++)
            a.add(in.nextDouble());
        while(a.size()>1){
            a.add(2*Math.sqrt(a.pollLast()*a.pollLast()));
        }
        DecimalFormat b = new DecimalFormat(".00");
        out.println(b.format(a.pollFirst()));
        out.flush();
    }
}