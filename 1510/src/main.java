import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class main{
    public static void main(String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.readLine());
        HashMap <Integer,Integer> h = new HashMap<>(n/2);
        for (int i = 0 ; i < n ; i++){
            int t = Integer.parseInt(in.readLine());
            h.putIfAbsent(t, 0);
            int c = h.get(t);
            if (c+1>n/2){
                out.println(t);
                break;
            }
            h.put(t, c+1);
        }
        out.flush();
    }
}