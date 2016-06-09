import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        String result = "[:=[first]";
        if ((n*m)%2 == 1)
            result = "[second]=:]";
        out.println(result);
        out.flush();
    }

}