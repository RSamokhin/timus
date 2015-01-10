import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int h=0,s=0;
        for (int i = 0 ; i < n ; i++){
            int value = in.nextInt();
            String status = in.next();
            if ("hungry".equals(status)){
                if ((value>h)||(h==0))
                    h=value;
            }else{
                if((value<s)||(s==0))
                    s=value;
            }
        }
        if (h<s)
            out.println(s);
        else
            out.println((s==0)?10:"Inconsistent");
        out.flush();
    }
}