import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] []  a = new int[n][3];
        for (int h = 0 ; h < n ; h++){
            a[h][0] = in.nextInt();
            a[h][1] = in.nextInt();
            a[h][2] = h;
        }
        qSort(a,0,n-1);
        
     //   out.println("========");
    //   сортировка по порядку
        
        Map A = new TreeMap<>();
        int s = 0;
        while ( s < n ){
            int M = a[s][1];
            while((s<n)&&(M==a[s][1])){
                String b =  a[s][0] + " " + a[s][1];
                A.put(a[s][2], b);
                s++;
            }
            for (Iterator it = A.entrySet().iterator(); it.hasNext();) {
                Map.Entry e = (Map.Entry) it.next();
                out.println(e.getValue());
            }
            //out.println("++++++++++");
            A.clear();
        }
        
        out.flush();
    } 
    private static final Random random = new Random();
    public static void qSort(int[][] array, int l, int r) {
        int i = l;
        int j = r;
        int x = array[l + random.nextInt(r - l + 1)][1];
        while (i <= j) {
            while (array[i][1] > x) {
                i++;
            }
            while (array[j][1] < x) {
                j--;
            }
            if (i <=j) {
                int t1 = array[i][0];
                int t2 = array[i][1];
                int t3 = array[i][2];
                array[i][0] = array[j][0];
                array[i][1] = array[j][1];
                array[i][2] = array[j][2];
                array[j][0] = t1;
                array[j][1] = t2;
                array[j][2] = t3;
                i++;
                j--;
            }
        }
        if (l<j){
            qSort(array, l, j);
        }
        if(i<r){
            qSort(array, i, r);
        }
    }
} 