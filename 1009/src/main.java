import java.io.PrintWriter;
import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(),k = in.nextInt();
        int allCount = getAllCount(k,n);
        int b = (int)Math.pow(k,n-1);
        int e = (int)Math.pow(k,n);
        for (int i = b ; i < e ; i ++)
            if (!checkIfCorret(Integer.toString(i, k)))
                allCount--;
        out.println(allCount);
        out.flush();
    }
    private static int getAllCount(int k,int n){
        if(n>1)    
            return (k)*getAllCount(k,n-1);
        return (k-1);
    }
    private static boolean checkIfCorret (String a){
        if (a.contains("00"))
            return false;
        return true;
    }
}