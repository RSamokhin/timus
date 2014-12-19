import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int [] a = new int[3];
        for (int i = 0 ; i < n ; i++){
            a[in.nextInt()-1]++;
        }
        Arrays.sort(a);
        out.println((Math.pow(3,a[0])*Math.pow(2,a[1])>=6)?"Yes":"No");
        out.flush();
    }
}