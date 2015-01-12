import java.util.Scanner;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Collections;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        PriorityQueue<Integer> h = new PriorityQueue<>(n,Collections.reverseOrder());
        for (int i = 0 ; i < n ; i++){
            h.add(in.nextInt());
        }
        while(h.size()>1){
            int a = h.poll();
            int b = h.poll();
            h.add(a-b);
        }
        out.println(h.poll());
        out.flush();
    }
}