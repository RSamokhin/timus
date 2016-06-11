import java.io.*;
import java.util.*;

public class t2005 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int [][] a = new int[5][5];
        for (int i = 0 ; i < 5 ; i++)
            for (int j = 0 ; j < 5 ; j++)
                a[i][j]=in.nextInt();
        TreeMap<Integer,String> m = new TreeMap<>();
        m.put(a[0][1]+a[1][2]+a[2][3]+a[3][4], "1 2 3 4 5");
        m.put(a[0][2]+a[2][1]+a[1][3]+a[3][4], "1 3 2 4 5");
        m.put(a[0][2]+a[2][3]+a[3][1]+a[1][4], "1 3 4 2 5");
        m.put(a[0][3]+a[3][2]+a[2][1]+a[1][4], "1 4 3 2 5");
        out.println(m.firstKey());
        out.println(m.get(m.firstKey()));
        out.flush();
    }
}