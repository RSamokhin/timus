import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int [] a = new  int[3];
        ArrayList<Integer[]> numbers_list = new ArrayList<Integer[]>();
        for (int i = 0 ; i < 3 ; i ++){
             a[i] = in.nextInt();
             for (int j = 0 ; j < a[i] ; j++){
                  int number = in.nextInt();
                  boolean added = false;
                  for(Integer[] tmp :numbers_list){
                      if (tmp[0] == number){
                          tmp[1] ++;
                          added = true;
                      }
                  }
                  if (!added){
                      Integer [] new_number = {number,1};
                      numbers_list.add(new_number);
                  }
             }
        }
        int result = 0;
        while (!numbers_list.isEmpty()){
            if (numbers_list.get(0)[1] == 3){
                result ++;
                numbers_list.remove(0);
            }else{
                numbers_list.remove(0);
            }
        }
        out.println(result);
        out.flush();
    }
}