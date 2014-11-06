import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0 ; i <= 100 ; i++){
            ArrayList<Integer> b = new ArrayList<>();
            a.add(i, b);
        }
        for (int j = 0 ; j < n ; j++){
            int id = in.nextInt();
            int m = in.nextInt();
            ArrayList<Integer> t = a.get(m);
            t.add(id);
            a.set(m, t);
        }   
        StringBuilder d = new StringBuilder("");
        for (int k = 100 ; k >= 0 ;k--){
            ArrayList<Integer> c = a.get(k);
            int s  = c.size();
            for (int h = 0 ; h < s; h++){
                //out.println( c.get(h) + " " + (k)) ;
                d.append(c.get(h));
                d.append(" ");
                d.append(k);
                d.append("\n");
            }
        }  
        out.println(d);
        out.flush();
    }
} 