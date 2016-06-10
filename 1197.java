import java.io.*;
import java.util.*;

public class t1197 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        String[] a = new String[n];
        int[] result = new  int[n];
        for (int i = 0 ; i < n ; i++){
            String tmp = in.next();
            String x = tmp.substring(0,1);
            String y = tmp.substring(1,2);
            int xi=0;
            ArrayList<String> letters = new ArrayList<String>();
            Collections.addAll(letters, "a", "b", "c", "d", "e", "f", "g", "h");
            xi = letters.indexOf(x);
            int yi = Integer.parseInt(y)-1;
            int[][] desk = new int[8][8];
            for (int[] tmp_array :desk){
                Arrays.fill(tmp_array,1);
            }
            result[i]=0;
            result[i]=result[i] +
                    check(desk,xi+1,yi+2)+
                    check(desk,xi+2,yi+1)+
                    check(desk,xi-1,yi+2)+
                    check(desk,xi-2,yi+1)+
                    check(desk,xi+1,yi-2)+
                    check(desk,xi+2,yi-1)+
                    check(desk,xi-1,yi-2)+
                    check(desk,xi-2,yi-1);
        }
        for (int j : result){
            out.println(j);
        }
        out.flush();
    }
    public static int check(int[][] desk, int x, int y){
        int add = 0;
        try{
            if (desk[x][y]==1){
                add++;
            }
        }catch (Exception e){}
        return add;
    }
}