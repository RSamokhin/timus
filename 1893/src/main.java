import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String n = in.nextLine();
        String s;
        s = n.substring(n.length()-1);
        int r = Integer.parseInt(n.substring(0,n.length()-1));
        if (r>20)
            if ("AK".indexOf(s)>=0)
                out.println("window");
            else
                if("CDGH".indexOf(s)>=0)
                    out.println("aisle");
                else
                    out.println("neither");
        else
            if (r>2)
                if ("AF".indexOf(s)>=0)
                   out.println("window");
                else
                    out.println("aisle");
            else
                if ("AD".indexOf(s)>=0)
                   out.println("window");
                else
                    out.println("aisle");
        out.flush();
    }
} 