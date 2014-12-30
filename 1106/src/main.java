import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeSet;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        boolean isFalse = false;
        HashSet<Integer>a = new HashSet<>();
        HashSet<Integer>b = new HashSet<>();
        in.nextLine();
        for (int i = 1 ; i <= n ; i++){
           String[] m = in.nextLine().split(" ");
           if (isFalse){
               continue;
           }
           if(m.length == 1){
               isFalse = true;
           }
           int [] t = new int[m.length - 1];
           for (int v = 0 ; v < m.length-1 ; v++)
               t[v]=Integer.parseInt(m[v]);
           boolean IinA = a.contains(i);
           boolean IinB = b.contains(i);
           if(!IinA&&!IinB){
               for (int g : t){
                       if(a.contains(g)){
                           b.add(i);
                           IinB=true;
                           break;
                       }
                       if(b.contains(g)){
                           a.add(i);
                           IinA=true;
                           break;
                       }
                       a.add(i);
                       IinA=true;
               }
           }
           if (IinA){
               for (int g : t){
                         if (!a.contains(g))
                            b.add(g);
               }
           }
           if (IinB){
                for (int g : t){
                        if (!b.contains(g))
                            a.add(g);
               }
            }
        }
        if (isFalse)
            out.println(0);
        else{
            out.println(a.size());
            a.stream().forEach((y) -> {
                out.print(y+" ");
            });
        }   
        out.flush();
    }
}