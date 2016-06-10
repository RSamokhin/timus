import java.io.*;
import java.util.*;
public class t1881 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int h = in.nextInt() , w = in.nextInt() , n = in.nextInt();
        int l = 0 , c = -1 ; 
        for (int i = 0 ; i < n ; i++){
            String t  = in.next();
            if (c + 1 + t.length() <= w)
                c=c+1+t.length();
            else{
                l++;
                c = t.length() ;
            }    
        }
        if (c>-1) l++;
        if(l%h>0)
            out.println(l/h+1);
        else
            out.println(l/h);
        out.flush();
    }
} 