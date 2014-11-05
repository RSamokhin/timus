import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][]  q = new int[n][2];
        for (int i = 0 ; i < n ; i++){
            q[i][0] = in.nextInt();
            q[i][1] = in.nextInt();
        }
        Arrays.sort(q, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o2[1], o1[1]);
                }
        });        
       // out.println("+++++++++");
        for (int j = 0 ; j < n ; j++){
            out.println(q[j][0]+" "+q[j][1]);
        }
        out.flush();
    }
} 