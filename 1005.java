import java.util.Scanner;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Collections;
public class t1005{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int s = 0;
        int[] a = new int[n];

        for(int i = 0 ; i < n ; i++){
            int t = in.nextInt();
            a[i] = t;
            s += t;
        }
        int[] p = new int[s + 1];
        p[0] = 1;

        int y = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = y ; j >= 0  ; j--){
                if(p[j]==1){
                    p[j+a[i]]=1;
                }
            }
            y += a[i];
        }

        int r = s/2;
        int g = 0;
        for(int i = r ; i>=0 ; i--){
            if(p[i]==1){
                g = i;
                break;
            }
        }
        /*for(int j = 0 ; j < p.length  ; j++){
            out.print(p[j]+" ");
        }
        out.println();*/
        //out.println(p.length);
        out.println(s - g*2);
        out.flush();
    }
}