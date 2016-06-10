import java.io.*;
import java.util.*;

public class t1617 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0 ; i < n ; i ++){
            int check = in.nextInt();
            if(h.containsKey(check))
                h.put(check,h.get(check)+1);
            else
                h.put(check, 1);
        }
        int r = 0;
        for (int k : h.keySet()) {
            r=r+h.get(k)/4;
        }
        out.println(r);
        out.flush();
    }
}