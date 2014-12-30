import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashSet;
public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        boolean isFalse = false;
        HashSet<Integer>a = new HashSet<>();
        HashSet<Integer>b = new HashSet<>();
        for (int i = 1 ; i <= n ; i++){
            int t = in.nextInt();
            if (t!=0){
                boolean noa = a.contains(i);
                boolean nob = b.contains(i);
                if ((!noa&&!nob)){
                    a.add(i);
                    noa = true;
                }
                    while(t!=0){
                        if(t==0)
                            break;
                        if (t>i)
                            if (noa)
                                b.add(t);
                            else
                                a.add(t);
                        t = in.nextInt();
                    }
            }else{
               isFalse=true;
            }
            
        }
        if (isFalse)
            out.println(0);
        else{
            out.println(a.size());
            a.stream().forEach((y) -> {
                out.print(y+" ");
            });
        }   
        out.flush();
    }
}