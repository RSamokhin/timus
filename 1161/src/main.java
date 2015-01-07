import java.util.Scanner;
import java.io.PrintWriter;
import java.util.List;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        List<Double>a = new ArrayList<>();
        for (int i = 0 ; i < n ; i++)
            a.add(in.nextDouble());
        Collections.sort(a);
        double s = a.get(a.size()-1)/4;
        while(a.size()>1){
            s = 2*Math.sqrt(s*a.get(a.size()-1));
            a.remove(a.size()-1);
        }
        DecimalFormat b = new DecimalFormat(".00");
        out.println(b.format(s));
        out.flush();
    }
}