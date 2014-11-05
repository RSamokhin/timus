import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        LinkedList<Integer[]> a = new LinkedList<>();
        for (int i = 0 ; i < n ; i++){
            int id = in.nextInt(), m = in.nextInt();
            int l = 0;
            int j = i;
           // out.println("j = "+ j + "  l = " + l);
            while (j!=l){               
                if (a.get((j-l)/2+l)[1]>=m){                   
                    l=(j-l)/2+l+1;
                }else{
                    j = (j-l)/2+l;
                }
            }
            Integer [] b = new Integer[2];
            b[0]=id;b[1]=m;
            a.add(j,b);
        }
       // out.println("======");
        for (int t = 0 ; t < n ; t++){
            out.print(a.get(t)[0]);
            out.print(" ");
            out.print(a.get(t)[1]);
            out.println();
        }
        out.flush();
    }
} 