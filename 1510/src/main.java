import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class main{
    public static void main(String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.readLine());
        List<Integer> h = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            int t = Integer.parseInt(in.readLine());
            h.add(t);
        }
        Collections.sort(h);
        out.println(h.get(n/2));
        out.flush();
    }
}