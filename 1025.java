
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class  main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n ; i++)   
            a[i]=in.nextInt();
        Arrays.parallelSort(a);
        int s = 0;
        for (int j = 0 ; j < n/2+1 ; j++){
            s+=a[j]/2+1;
        }
        out.println(s);
        out.flush();
    }
}
