import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder b = new StringBuilder();
        char [] s = in.next().toCharArray();
        for(char t:s){
            if(b.length()>0){
                if (t==b.charAt(b.length()-1)){
                    b.deleteCharAt(b.length()-1);
                }else{
                    b.append(t);
                }
            }else
                b.append(t);
        }
        out.print(b);
        out.flush();
    }
}