import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String phoneNumber = in.nextLine();
        /*       figures      0     1    2     3     4    5    6    7     8     9  */
        String[] letters = {"oqz","ij","abc","def","gh","kl","mn","prs","tuv","wxy"};
        while (phoneNumber!="-1"){
            int n = in.nextInt();
            for(int i = 0  ; i < n ; i++){

            }


            phoneNumber = in.nextLine();
        }
        out.flush();
    }
}