import java.io.*;
import java.util.*;

public class t1880 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int [] a = new  int[3];
        int [][] numbers_list = new int[3][4001];
        for (int i = 0 ; i < 3 ; i ++){
            a[i] = in.nextInt();
            for(int j = 0 ; j < a[i] ; j++){
                numbers_list[i][j] = in.nextInt();
            }
        }
        int result = 0;
        int i = 0;
        int check_int = numbers_list[0][i];
        while (check_int>0){
            check_int = numbers_list[0][i];
            int j = 0;
            int enough = 0;
            while ((numbers_list[1][j]<=check_int)&&(j<numbers_list[1].length)&&(enough==0)&&(numbers_list[1][j]>0)){
                 if (numbers_list[1][j]==check_int) {
                    enough ++;
                }
                j++;
            }
            j=0;
            while ((numbers_list[2][j]<=check_int)&&(j<numbers_list[2].length)&&(enough==1)&&(numbers_list[2][j]>0)){
                if (numbers_list[2][j]==check_int) {
                    enough ++;
                }
                j++;
            }
            if (enough == 2) {
                result++;
            }
            i++;
        }
        out.println(result);
        out.flush();
    }
}

