import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class t1026 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] base = new int[in.nextInt()];
        for (int i = 0; i < base.length; i++) {
            base[i] = in.nextInt();
        }
        Arrays.sort(base);
        in.next();
        int k = in.nextInt();
        while (k > 0) {
            out.println(base[in.nextInt()-1]);
            k--;
        }

        out.flush();
    }
}
