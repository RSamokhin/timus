import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        String result = "grimy";
        if (((n/2==(n-1)/2?(n/2):(n/2-1))%2) == 1 )
            result = "black";
        out.println(result);
        out.flush();
    }

}