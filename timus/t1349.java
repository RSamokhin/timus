import java.io.*;
import java.util.*;

public class t1349 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int r = -1; 
        int a = 1,b = 2,c=3;
        boolean ready = false;
        if (n<3){
            for (int i = 1 ; i < 99 ; i ++ ){
                for (int j = i+1; j < 100 ; j++){
                    for (int k = j ; k <101 ; k++){
                        if (Math.pow ( i,n ) + Math.pow ( j,n ) == Math.pow ( k,n )){
                            a=i;b=j;c=k;
                            ready = true;
                            break;
                        }
                    }
                    if (ready){
                            break;
                    }
                }
                if (ready){
                    break;
                }
            }
        }
        if (ready){
            out.println(a+" "+b+" "+c);
        }else{
            out.println(-1);
        }
        out.flush();
    }
} 