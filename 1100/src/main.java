import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        List<Integer[]> a = new ArrayList<>();
        for (int i = 0 ; i < n ; i ++){
            int id = in.nextInt(), m = in.nextInt();
            int f = 0;
            int l = i;
            while (f!=l){                                             
                if (a.get((l-f)/2+f)[1]<m){                   
                    f = l/2;
                }else{
                    l = l/2+1;
                }
            }
            Integer [] b = new Integer[2];
            b[0]=id;b[1]=m;
            a.add(f,b);
        }
        out.println("======");
        for (int t = 0 ; t < n ; t++){
            out.print(a.get(t)[0]);
            out.print(" ");
            out.print(a.get(t)[1]);
            out.println();
        }
        out.flush();
    }
} 