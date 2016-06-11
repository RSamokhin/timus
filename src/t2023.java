import java.io.*;
import java.util.*;

public class t2023 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        HashMap<String,Integer> h = new HashMap<>();
        h.put("a",1);
        h.put("p",1);
        h.put("r",1);
        h.put("o",1);
        h.put("b",2);
        h.put("m",2);
        h.put("s",2);
        h.put("d",3);
        h.put("g",3);
        h.put("j",3);
        h.put("k",3);
        h.put("t",3);
        h.put("w",3);
        int s=0;
        int n = in.nextInt();
        int cp = 1;
        for(int i = 0 ; i< n ; i++){
            int p = h.get(in.next().substring(0, 1).toLowerCase());
            s=s+Math.abs(cp-p);
            cp=p;
        }
        out.println(s);
        out.flush();
    }
}