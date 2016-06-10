import java.io.*;
import java.util.*;

public class t1563 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        HashSet<String> h = new HashSet<>();
        int c = 0;
        for (int i = 0 ; i <= n ; i++){
            String t = in.nextLine();
            if (h.contains(t))
                c++;
            else
                h.add(t);
        }
        out.print(c);
        out.flush();
    }
}