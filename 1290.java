import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
public class t1290{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++)
            list.add(in.nextInt());
        Collections.sort(list);
        for (int k = list.size()-1;k>=0;k--)
            out.println(list.get(k));
        out.flush();
    }
}