import java.io.*;
import java.util.*;

public class t1785 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int table[] = new int[] {1,5,10,20,50,100,250,500,1000 };
        String table_value[] =  new String[] {"few","several","pack","lots","horde","throng","swarm","zounds","legion"};
        int number = in.nextInt();
        String result = "";
        int i = table.length-1;
        do {
           if (number >= table[i]){
               result = table_value[i];
           }else{
               i--;
           }
        }while (result == "");
        out.println(result);
        out.flush();
    }
}
