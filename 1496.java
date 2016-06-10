import java.io.*;
import java.util.*;

public class t1496 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        Map<String, Integer> h = new HashMap<>();
        Map<String, Integer> o = new HashMap<>();
        for (int i = 0 ; i < n ; i++){
            String t = in.next();
            if (h.get(t)==null)
                h.put(t,1);
            else{
                if (o.get(t)==null){
                    out.println(t);
                    o.put(t, 1);
                }
            }
        }
        out.flush();
    }
}