import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt(), y = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int x = 0 ; x < m ; x++)
            if (Math.pow((x%m),n)%m==y)
                a.add(x);
        if (a.size()>0)
            a.stream().forEach((f) -> {
                out.print(f+" ");
        });
        else
            out.println(-1);
        out.flush();
    }
} 