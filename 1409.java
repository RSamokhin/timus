import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int result_a;
        int result_b;
        int a = in.nextInt();
        int b = in.nextInt();
        result_a = b-1;
        result_b = a-1;
        out.println(result_a);
        out.println(result_b);
        out.flush();
    }
}
