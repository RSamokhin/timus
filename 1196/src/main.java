import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException
    {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = readInt(bis);
        int r = 0;
        TreeSet<Integer> a = new TreeSet<>();
        for (int i = 0 ; i < n ; i++){
            int y = readInt(bis);
            a.add(y);
        }
        int max = a.last();
        int min = a.first();
        int m = readInt(bis);
        for (int j = 0 ; j < m ; j ++){
            int t = readInt(bis);
            if ((t<=max)||(t>=min))
                if (a.contains(t)){
                    r++;
                 }
        } 
        out.println(r);
        out.flush();
    }
    private static int readInt(InputStream in) throws IOException {
            int ret = 0;
            boolean dig = false;

            for (int c = 0; (c = in.read()) != -1; ) {
                if (c >= '0' && c <= '9') {
                    dig = true;
                    ret = ret * 10 + c - '0';
                } else if (dig) break;
        }
        return ret;
    }
}