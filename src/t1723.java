import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class t1723 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        TreeMap <String,Integer> a = new TreeMap<>();
        String input = in.next();
        String[] s;
        s = input.split("");
        for(String t:s){
            a.putIfAbsent(t, 0);
            a.put(t, a.get(t)+1);
        }
        ArrayList<Entry<String,Integer>> c = new ArrayList<>();
        c.addAll(a.entrySet());
        c.sort(new EntryComparator());
        out.println(c.get(0).getKey());
        out.flush();
    }
}
class EntryComparator implements Comparator<Entry<String,Integer>>{
    @Override
    public int compare(Entry<String,Integer> a,Entry<String,Integer> b){
        return a.getValue().compareTo(b.getValue())*(-1);
    }
}