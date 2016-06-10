import java.io.*;
import java.util.*;

public class t1293 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int result = 0;
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        result = 2*n*a*b;
        out.println(result);
        out.flush();
    }
}
