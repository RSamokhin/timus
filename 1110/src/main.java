import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long n = in.nextInt(), m = in.nextInt(), y = in.nextInt();
        ArrayList<String> a = new ArrayList<>();
        for (long x = 0 ; x < m ; x++)
            if (Math.pow((x%m),n)%m==y)
                a.add(String.valueOf(x));
        if (a.size()>0)
            a.stream().forEach((f) -> {
                out.print(f+" ");
        });
        else
            out.println(-1);
        out.flush();
    }
} 