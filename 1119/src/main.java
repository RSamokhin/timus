import java.util.Scanner;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
public class main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        int c = in.nextInt();
        TreeMap<Integer,TreeSet<Integer>> h = new TreeMap<>();
        for (int i = 1 ; i <= c ;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            h.putIfAbsent(y, new TreeSet<>());
            TreeSet<Integer>t=h.get(y);
            t.add(x);
            h.put(y, t);
        }
        List<TreeMap<Integer,Integer>> l = new ArrayList<>();  // blank list of all possible paths
        h.keySet().stream().forEach((i) -> {
            // y coordinate of existed diagonals
            TreeSet<Integer> t = h.get(i);                     // set of x coordinates of existed diagonals
            t.stream().forEach((u) -> {
                // every x of existed diagonals
                boolean used = false;                          // if existed entry was used in list of paths 
                int k = 0;
                while (k<l.size()){
                    //for (TreeMap<Integer,Integer> o:l){            // look through every path of possible maps 
                    TreeMap<Integer,Integer> o = l.get(k);
                    if ((o.lastKey()<u)&&(o.get(o.lastKey())<i)){                        //
                        TreeMap<Integer,Integer> p = new TreeMap<>();
                        p.putAll(o);
                        p.put(u, i);
                        l.add(p);
                        used=true;
                    }
                    k++;
                }
                if (!used) {
                    TreeMap<Integer,Integer> s = new TreeMap<>();
                    s.put(u, i);
                    l.add(s);
                }
            });
        });
        int maxD = 0;
        for  (TreeMap<Integer,Integer> j:l){
            maxD = (j.size()>maxD)?j.size():maxD;
        }
        out.println(Math.round(100*(n-maxD)+100*(m-maxD)+Math.sqrt(maxD*maxD*20000)));
        out.flush();
    }
}