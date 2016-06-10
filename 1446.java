import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
public class t1446{
    public static void main(String [] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.readLine());
        StringBuilder s = new StringBuilder("Slytherin:\n");
        StringBuilder h = new StringBuilder("Hufflepuff:\n");
        StringBuilder g = new StringBuilder("Gryffindor:\n");
        StringBuilder r = new StringBuilder("Ravenclaw:\n");
        for (int i = 0 ; i < n ; i++){
            String name = in.readLine();
            String faculty = in.readLine();
            switch(faculty){
                case("Slytherin"):
                    s.append(name).append("\n");
                     break;
                case("Hufflepuff"):
                    h.append(name).append("\n");
                     break;
                case("Gryffindor"):
                    g.append(name).append("\n");
                     break;
                case("Ravenclaw"):
                    r.append(name).append("\n");
                     break;
            }
        }
        out.println(s);
        out.println(h);
        out.println(g);
        out.println(r);
        out.flush();
    }
}