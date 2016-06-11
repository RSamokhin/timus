import java.io.*;
import java.util.*;

public class t1820 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int result = 0;
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> n_table = new ArrayList<Integer>();
        for (int i = 0 ; i < n ; i++){
            n_table.add(0);
        }
        do {
            if (n_table.size()<= k){
                k = n_table.size();
            }
            int j = 0;
            int num_on_owl = k;
            while (j<num_on_owl) {
                n_table.set(j,(n_table.get(j)+1));
                if (n_table.get(j)==2){
                    n_table.remove(j);
                    num_on_owl--;
                    j--;
                }
                j++;
            }
            result++;
            Collections.sort(n_table);
        }while (n_table.size()>0);

        out.println(result);
        out.flush();
    }
}
