import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
public class t2011{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int [] a = new int[3];
        for (int i = 0 ; i < n ; i++){
            a[in.nextInt()-1]++;
        }
        Arrays.sort(a);
        if(n>5)
            if (a[1]>0)
                out.println("Yes");
            else
                out.println("No");
        else{
            switch(n){
                case 1:
                    out.println("No");
                    break;
                case 2:
                    out.println("No");
                    break;
                case 3:
                    if (a[0]>0)
                        out.println("Yes");
                    else 
                        out.println("No");
                    break;
                case 4:  
                    if ((a[0]>0)||a[1]>1)
                        out.println("Yes");
                    else
                        out.println("No");
                    break;
                case 5:
                    if ((a[1]>1)||((a[1]>0)&&(a[0]>0)))
                        out.println("Yes");
                    else
                        out.println("No");
                    break;
            }
        }
        out.flush();
    }
} 