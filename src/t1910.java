import java.io.*;
        import java.util.*;

public class t1910 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < a.length ; i++)
            a[i] = in.nextInt();
        int max = 0;
        int max_id = 1;
        for(int i = max_id; i < a.length-1 ; i++){
            if (a[i-1]+a[i]+a[i+1]>max){
                max = a[i-1]+a[i]+a[i+1];
                max_id=i;
            }
        }
        out.println(max);
        out.println(max_id + 1);
        out.flush();
    }

}