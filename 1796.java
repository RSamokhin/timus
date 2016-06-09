import java.util.Scanner;
import java.io.PrintWriter;
import java.util.TreeMap;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out= new PrintWriter(System.out);
        TreeMap<Integer,Integer>a=new TreeMap<>();
        a.put(10,in.nextInt());
        a.put(50,in.nextInt());
        a.put(100,in.nextInt());
        a.put(500,in.nextInt());
        a.put(1000,in.nextInt());
        a.put(5000,in.nextInt());
        int s = in.nextInt();
        int q = 0;
        int e = 0;
        q = a.keySet().stream().map((t) -> t*a.get(t)).reduce(q, Integer::sum);
        for (int t:a.keySet()){
            if (a.get(t)>0){
               a.put(t,a.get(t)-1);
               break;
            }
        }
        e = a.keySet().stream().map((t) -> t*a.get(t)).reduce(e, Integer::sum);
        e=e/s;q=q/s;
        out.println(q-e);
        while(e<q)
            out.print(++e+" ");
        out.flush();
    }
}