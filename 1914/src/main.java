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