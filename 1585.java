import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;


public class t1585 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int a=0,b=0,c=0;
        for (int i = 0 ; i < n ; i++){
            String t = in.next();
            in.next();
            switch(t){
                case "Emperor":
                    a++;
                    break;
                case "Macaroni":
                    b++;
                    break;
                case "Little":
                    c++;
                    break;       
            }
        }
        if (a>b){
            if (a>c){
                out.println("Emperor Penguin");
            }else{
                out.println("Little Penguin");
            }
        }else{
            if (b>c){
                out.println("Macaroni Penguin");
            }else{
                out.println("Little Penguin");
            }
        }
        out.flush();
    }

} 