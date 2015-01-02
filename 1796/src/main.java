import java.util.Scanner;
import java.io.PrintWriter;
import java.util.TreeSet;
import java.util.TreeMap;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out= new PrintWriter(System.out);
        TreeSet<Integer> r = new TreeSet<>();
        TreeMap<Integer,Integer>a=new TreeMap<>();
        a.put(10,in.nextInt());
        a.put(50,in.nextInt());
        a.put(100,in.nextInt());
        a.put(500,in.nextInt());
        a.put(1000,in.nextInt());
        a.put(5000,in.nextInt());
        int s = in.nextInt();
        int q = 0;
        q = a.keySet().stream().map((t) -> t*a.get(t)).reduce(q, Integer::sum);
        for (int t:a.keySet()){
            if (a.get(t)>0){
               int z = q-t;
               while (z+s<=q){
                   z=z+s;
                   r.add(z/s);
               }
               break;
            }
        }
        out.println(r.size());
        r.stream().forEach((t) -> {
            out.print(t+" ");
        });
        out.flush();
    }
}