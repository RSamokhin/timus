import java.io.*;
import java.util.*;

public class t1877 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int code_a = in.nextInt();
        int code_b = in.nextInt();
        String result ="no";
        if ((code_a%2==0)||(code_b%2==1)){
            result = "yes";
        }
        out.println(result);
        out.flush();
    }
}
