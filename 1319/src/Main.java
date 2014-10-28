import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        long s = ((n<0)? (-1) : 1)*(n*(n+((n<2)? (-1) : 1))/2) + ((n<2) ? 1 : 0);
        out.println(s);
        out.flush();
    }
}