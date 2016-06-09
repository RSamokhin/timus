import java.util.Scanner;
import java.io.PrintWriter;
import java.util.TreeSet;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int e = in.nextInt();
        TreeSet<Integer> m = new TreeSet<>();
        TreeSet<Integer> p = new TreeSet<>();
        for (int i = 0 ; i < n ; i ++){
            int t = in.nextInt();
            if (t>0)
                p.add(t);
            else
                m.add(t);
        }
        //if ((!((e<0)&&(p.isEmpty()))||((e>0)&&(m.isEmpty()))))
            if ((e>0)?(((!p.isEmpty())?(p.first()>e):true)&&!m.isEmpty()):(((!m.isEmpty())?(m.last()<e):true)&&!p.isEmpty()))
                out.println((e<0)?((p.first()*2-e)+" "+(-e)):(e+" "+(-m.last()*2+e)));
            else
                out.println("Impossible");
        //else
          //  out.println("Impossible");
        out.flush();
    }
}