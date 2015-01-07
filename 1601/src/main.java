import java.util.Scanner;
import java.io.PrintWriter;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder r=new StringBuilder();
        char[] e;
        while(!((e = in.nextLine().toCharArray()).length<1)&&in.hasNextLine()){
            boolean b = true;
            for (char t:e)
                if ((t>='A')&&(t<='Z'))
                    if (b==true){
                        r.append(t);
                        b=false;
                    }else
                        r.append(Character.toLowerCase(t));
                else
                    if ("!?.".indexOf(t)>=0){
                        r.append(t);
                        b=false;
                    }else
                        r.append(t);
            r.append('\n');
        }
        out.println(r);
        out.flush();
    }
}