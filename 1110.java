import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        BigInteger n = in.nextBigInteger(); 
        int m = in.nextInt(); 
        BigInteger y = in.nextBigInteger();
        ArrayList<String> a = new ArrayList<>();
        StringBuilder d = new StringBuilder("");
        BigInteger ms = new BigInteger(String.valueOf(m));
        for (int j = 0 ; j < m ; j++){
            BigInteger r = new BigInteger(String.valueOf(j));
            r = r.modPow(n, ms);
            if (r.equals(y)){
                a.add(String.valueOf(j));
            }
        }
        if (a.size()>0){
            a.stream().forEach((f) -> {
                d.append(f).append(" ");
            });
            out.print(d);
    }else
            out.println(-1);
        out.flush();
    }
} 