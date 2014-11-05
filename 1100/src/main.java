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
        for (int k = 100 ; k >= 0 ;k--){
            for (int h = 0 ; h < a.get(k).size(); h++){
                out.println( a.get(k).get(h) + " " + (k)) ;
            }
        }     
        out.flush();
    }
} 