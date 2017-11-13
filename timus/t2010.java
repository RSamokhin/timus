import java.util.Scanner;
import java.io.PrintWriter;
public class t2010{
    public static void main(String[]args){
        int n = 0;
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int King = 0;
            King +=(checkIn(x-1,y-1,n))?1:0;
            King +=(checkIn(x-1,y,n))?1:0;
            King +=(checkIn(x-1,y+1,n))?1:0;
            King +=(checkIn(x,y-1,n))?1:0;
            King +=(checkIn(x,y+1,n))?1:0;
            King +=(checkIn(x+1,y-1,n))?1:0;
            King +=(checkIn(x+1,y,n))?1:0;
            King +=(checkIn(x+1,y+1,n))?1:0;
        int Knight = 0;
            Knight +=(checkIn(x-1,y-2,n))?1:0;
            Knight +=(checkIn(x-2,y-1,n))?1:0;
            Knight +=(checkIn(x-2,y+1,n))?1:0;
            Knight +=(checkIn(x-1,y+2,n))?1:0;
            Knight +=(checkIn(x+1,y+2,n))?1:0;
            Knight +=(checkIn(x+2,y+1,n))?1:0;
            Knight +=(checkIn(x+2,y-1,n))?1:0;
            Knight +=(checkIn(x+1,y-2,n))?1:0;
        int Bishop = Math.min(n-x, n-y)+Math.min(n-x, y-1)+Math.min(n-y, x-1)+Math.min(x-1, y-1);
        int Rook = 2*n-2;
        int Queen = Bishop+Rook;
        out.println("King: "+King);
        out.println("Knight: "+Knight);
        out.println("Bishop: "+Bishop);
        out.println("Rook: "+Rook);
        out.println("Queen: "+Queen);
        
        out.flush();
    }
    private static boolean checkIn(int x , int y, int n){
        return ((x>0)&&(x<=n)&&(y>0)&&(y<=n));
    }
}