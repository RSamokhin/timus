import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class t1510{
    public static void main(String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.readLine());
        int[]a = new int[n];
        for (int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(a);
        out.println(a[n/2]);
        out.flush();
    }
}