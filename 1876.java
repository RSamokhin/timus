import java.io.*;
import java.util.*;
public class t1876 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt(), b = in.nextInt(),s=0;
        int o;
        a -= 39; b-=39;
        o = 39+39*2;
        o+=Math.max((1+(a-1)*2+1),(b*2)+1);
        out.println(o);
        out.flush();
    }
} 