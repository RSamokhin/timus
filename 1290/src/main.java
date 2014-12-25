import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[]a =new int[n];
        for (int i = 0 ; i < n ; i++)
            a[i]=in.nextInt();
        a = sort(a,n);
        for (int i:a)
            out.println(i);
        out.flush();
    }
    private static int[] merge(int[] a,int [] b){
        if (a.length==0)
            return b;
        if (b.length==0)
            return a;
        if (a[0]>b[0])
            return concat(a[0],merge(Arrays.copyOfRange(a, 1, a.length),b));
        else
            return concat(b[0],merge(a,Arrays.copyOfRange(b, 1, b.length)));
    }
    private static int[] concat(int a,int[]b){
        int [] c = new int[b.length+1];
        c[0]=a;
        for (int i = 0 ; i < b.length ; i++)
            c[i+1]=b[i];
        return c;
    }
    private static int[] sort(int[]a,int n){
        if (n==1)
            return a;
        int middle = (n/2);
        return merge(sort(Arrays.copyOfRange(a, 0, middle),middle),sort(Arrays.copyOfRange(a, middle, n),n-middle));
    }
    
}