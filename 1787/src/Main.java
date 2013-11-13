import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int k = in.nextInt();
        int n = in.nextInt();
        String[] number_string_array = new String[n];
        for  (int i = 0 ; i < n ; i++){
            number_string_array[i] = in.next();
        }
        int result = 0;
        int[] number_integer_array = new int[n];
        for (int i = 0 ; i < n ; i++){
            number_integer_array[i] = Integer.parseInt(number_string_array[i]);
        }
        int previous_cars = 0;
        for (int i = 0 ; i < n ; i++){
            previous_cars = number_integer_array[i] + previous_cars - k;
            previous_cars = (previous_cars<0)?0:previous_cars;

        }
        result = previous_cars;
        out.println(result);
        out.flush();
    }
}