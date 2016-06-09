import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Long> a=new ArrayList<Long>();
        try(Scanner in = new Scanner(System.in)) {
            while(in.hasNext()){
                a.add(in.nextLong());
            }
        } catch(Exception e){}

        for(int i = a.size()-1;i>=0;i=i-1){
            long mylong = a.get(i);
            double mydouble = Math.sqrt(mylong);
            mydouble = mydouble *10000;
            mydouble = Math.round(mydouble);
            mydouble = mydouble/10000;
            System.out.println(String.format("%8.4f", mydouble).replaceAll(" ", ""));
        }
    }
}
