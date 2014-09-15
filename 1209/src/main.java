import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int q = 0 ; q < n ; q++){
            list.add(in.nextInt());
        }
        Collections.sort(list);
        int k = 0;
        int s = 0; 
        while(list.size()>0){
            int c = list.get(0);
            if (s>c){
                out.println(0);
                list.remove(0);
            }else{
                while(s < c){
                    s = s + k;
                    k++;
                }
                if (s==c-1){
                    out.println(1);
                }else{
                    out.println(0);
                }
                list.remove(0);
            }
        }
        out.flush();
    }
}
