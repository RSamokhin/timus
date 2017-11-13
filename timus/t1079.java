import java.io.PrintWriter;
import java.util.Scanner;

public class t1079 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        while (n != 0) {
            int [] a = new int[n+1];
            a[0] = 0;
            a[1] = 1;
            int max = 1;
            for (int i = 2; i < a.length ; i++) {
                a[i] = i % 2 == 1 ? a[i/2] + a[i/2 + 1] : a[i/2];
//                out.println(i);
//                out.println(a[i/2 + 1]);
                if (a[i] > max) {
                    max = a[i];
                }
            }
            out.println(max);
            n = in.nextInt();
        }

        out.flush();
    }
}
