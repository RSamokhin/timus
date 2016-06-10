import java.util.Scanner;
import java.io.PrintWriter;

public class t1792{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int [] a = new int[7];
        for(int i = 0 ; i < 7 ; i++)
            a[i]=in.nextByte();
        if (!((a[4]==(a[1]+a[2]+a[3])%2)&&(a[5]==(a[0]+a[2]+a[3])%2)&&(a[6]==(a[0]+a[1]+a[3])%2))){
            for(int p = 0 ; p < 7; p++){
                int t = a[p];
                a[p]= ((a[p]+1)%2);
                if(!((a[4]==(a[1]+a[2]+a[3])%2)&&(a[5]==(a[0]+a[2]+a[3])%2)&&(a[6]==(a[0]+a[1]+a[3])%2)))
                    a[p]=t;
                else{
                   // out.println(p);
                    break;
                }
            }
        }
        for (int i : a)
            out.print(i+" ");
        out.flush();
    }
}