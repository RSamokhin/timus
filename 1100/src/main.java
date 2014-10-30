import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0 ; i < n ; i ++){
            int id = in.nextInt(), m = in.nextInt();
            a[i][0] = id ; a[i][1] = m;
            int j = i;
            while(j>0){
           // for (int j = i ; j > 0 ; j-- ){
                if (a[j][1] > a[j-1][1]){
                    int k = a[j][0];
                    int l = a[j][1];
                    a[j][0]=a[j-1][0];
                    a[j][1]=a[j-1][1];
                    a[j-1][0] = k;
                    a[j-1][1] = l;
                }else{
                    j=0;
                }
                j--;
            }   
        }
        //sout.println("==========");
        for (int t = 0 ; t < n ; t++){
            out.print(a[t][0]);
            out.print(" ");
            out.print(a[t][1]);
            out.println();
        }
        out.flush();
    }
} 