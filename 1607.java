import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt(),r=a;
        boolean f = true;
        if (a>c)
            f=false;
        while(f){
            if (a+b<c){
                a=a+b;
                r=a;
                if(c-d>a){
                    c=c-d;
                    r=c;
                }else{
                    f=false;
                }
            }else{
                r=c;
                f=false;
            }
        }
        out.println(r);
        out.flush();
    }
} 