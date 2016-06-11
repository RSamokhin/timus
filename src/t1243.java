import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class t1243 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        BigInteger r = in.nextBigInteger();
        out.println(r.mod(new BigInteger("7")));
        out.flush();
    }
} 