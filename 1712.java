import java.io.PrintWriter;
import java.util.Scanner;
public class t1712{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder s = new StringBuilder(16);
        String [][] a = new String[4][4];
        String [][] b = new String[4][4];
        for (int i = 0 ; i < 4 ; i++)
                a[i]=in.next().split("");
        for (int i = 0 ; i < 4 ; i++)
                b[i]=in.next().split("");
        for (int k = 0 ; k < 4 ; k++){
            for (int i = 0 ; i < 4 ; i++)
                for (int j = 0 ; j < 4 ; j++)
                    s.append(("X".equals(a[i][j]))?b[i][j]:"");
            a = convert(a);
        }
        out.println(s);
        out.flush();
    }

    private static String[][] convert(String[][] a){
        a = swapLines(a);
        a = transponde(a);
        return a;
    }
    private static String[][] swapLines(String[][] a){
        for (int i = 0 ; i < 4 ; i++)
            for (int j = 0 ; j < 2 ; j++){
                String t = a[i][j];
                a[i][j] = a[i][3-j];
                a[i][3-j]=t;
            }   
        return a;
    }
    private static String[][] transponde(String[][] a){
        for(int i = 0 ; i < 3 ; i ++)
            for (int j = 0 ; j < 3-i; j++){
                String t = a [i][j];
                a[i][j]=a[3-j][3-i];
                a[3-j][3-i]=t;
            }
        return a;
    }
}