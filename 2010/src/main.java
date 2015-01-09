import java.util.Scanner;
import java.io.PrintWriter;
import java.util.HashMap;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long n = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
        long King;
        if (n==1)
            King = 0;
        else
            if ((((x==1)||(x==n))&&((y==1)||(y==n)))||(n==2))
                King = 3;
            else
                if (((x==1)||(x==n))||((y==1)||(y==n)))
                    King=5;
                else
                    King = 8;
        long Knight;
        if ((n<3)||((n==3)&&(x==2)&&(y==2)))
            Knight = 0;
        else
            if ((((x==1)||(x==n))&&((y==1)||(y==n)))||(n==3))
                Knight = 2;
            else
                if ((((x==1)||(x==n))&&((y==2)||(y==n-1)))||(((x==2)||(x==n-1))&&((y==1)||(y==n))))
                    Knight = 3;
                else
                    if (((x==2)||(x==n-1))&&((y==2)||(y==n-1)))
                        Knight = 4;
                    else
                        if (((x==2)||(x==n-1))||((y==2)||(y==n-1)))
                           Knight = 6;
                        else
                            Knight = 8;
        long Bishop = Math.min(n-x, n-y)+Math.min(n-x, y-1)+Math.min(n-y, x-1)+Math.min(x-1, y-1);
        long Rook = 2*n-2;
        long Queen = Bishop+Rook;
        out.println("King: "+King);
        out.println("Knight: "+Knight);
        out.println("Bishop: "+Bishop);
        out.println("Rook: "+Rook);
        out.println("Queen: "+Queen);
        
        out.flush();
    }
}