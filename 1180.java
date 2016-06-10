import java.io.PrintWriter;
import java.util.Scanner;
public class t1180{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String s = in.next();
        char[] t = s.toCharArray();
        int n = 0;
        for (char f : t)
           n+=f;
        out.println((n%3==0)?(2):("1"+"\n"+n%3));
        out.flush();
    }
}