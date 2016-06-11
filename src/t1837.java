import java.io.*;
import java.util.*;

public class t1837 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0 ; i < n ; i ++){
            String q=in.next(), w = in.next(), e=in.next();
            a.add(q);a.add(q);a.add(w);a.add(w);a.add(e);a.add(e);
            b.add(w);b.add(e);b.add(q);b.add(e);b.add(q);b.add(w);
        }        
        ArrayList<String> r = new ArrayList<>();
        ArrayList<Integer> v = new ArrayList<>();
        int max = 0;
        if (a.indexOf("Isenbaev")>=0){
            r.add("Isenbaev");
            v.add(0);
            int checkIndex = 0;
            while (checkIndex<r.size()){
                String checkName = r.get(checkIndex);
                while(a.indexOf(checkName)>=0){
                    int indexA = a.indexOf(checkName);
                    int indexR = r.indexOf(checkName);
                    int currentWeight = v.get(indexR);
                      //добавить условиеменьшего веса
                    int iter = 2;
                    while (iter>0){
                        String inA = b.get(indexA);
                        if (r.contains(inA)){
                               int position = r.indexOf(inA);
                               int inbaseWeight = v.get(position);
                               v.set(position,(currentWeight+1>inbaseWeight)?inbaseWeight:currentWeight+1);

                        }else{
                            r.add(b.get(indexA)); v.add(currentWeight+1);
                        }
                        a.remove(indexA);b.remove(indexA);
                        iter--;
                    }
                }
                checkIndex++;
            }
        }
            /*
            for(String s : a){
                if (!r.contains(s)){
                    r.add(s);
                    v.add(-1);
                }
            }
            */
        a.stream().filter((s) -> (!r.contains(s))).map((s) -> {
            r.add(s);
                return s;
        }).forEach((_item) -> {
            v.add(-1);
        });
        TreeMap <String, Integer> resultMap = new TreeMap<>();
        for(int l = 0 ; l < r.size(); l++){
            resultMap.put(r.get(l),v.get(l));
        }
        resultMap.keySet().stream().forEach((key) -> {
            out.println(key+" "+(resultMap.get(key)!=-1?resultMap.get(key):"undefined"));
        });
        out.flush();
    }
}