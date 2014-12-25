import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0 ; i < n ; i++){
            int t = in.nextInt();
            for (int j = 0 ; j < t ; j++){
                h.putIfAbsent(j, 0);
                h.put(j, h.get(j)+1);
            }
        }
        Deque<Integer> a = new ArrayDeque<>();
        List list = new ArrayList();
        list.addAll(h.values());
        Collections.sort(list);
        a.addAll(list);
        while (!a.isEmpty()){
            int t=a.peekFirst();
            out.println(a.size());
            while((!a.isEmpty())&&(a.peekFirst()==(t))){
                a.removeFirst();
            }
        }
        out.flush();
    }
}