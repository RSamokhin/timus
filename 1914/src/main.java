import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(); int k = in.nextInt();
        long s = 0;
        in.nextLine();
        while(in.hasNextLine()){
            String p =in.nextLine();
            String [] t = p.split(" ");
            s+=Integer.parseInt(t[3])*Integer.parseInt(t[5]);
        }
        out.println(s);
        out.flush();
    }
}
/*
import java.util.HashMap;
public class main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(); int k = in.nextInt();
        long s = 0;
        in.nextLine();
        HashMap<Integer,Integer> h = new HashMap<>();
        if
        while(true){
            int [] t = convertArray(in.nextLine().split(" "));
            h.remove(t[0]);
            
            //if
            //s+=Integer.parseInt(t[3])*Integer.parseInt(t[5]);
            if (h.isEmpty())
                break;
        }
        out.println(s);
        out.flush();
    }
    private static int[] convertArray(String[] a){
        int[] b = new int[6];
        for (int i = 0 ; i < 6 ; i++)
            b[i] = Integer.parseInt(a[i]);
        return b;
    }
}*/