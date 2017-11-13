import java.io.PrintWriter;
import java.util.*;

public class t1022 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), input;
        HashMap<Integer, ArrayList<Integer>> tree = new HashMap<>();
        for (int i = 1; i <= n; i ++) {
            ArrayList <Integer> item = new ArrayList<>();
            input = in.nextInt();
            while (input > 0) {
                item.add(input);
                input = in.nextInt();
            }
            tree.put(i, item);
        }

        ArrayDeque<Integer> que = new ArrayDeque<>();
        while (!tree.isEmpty()) {
            for (HashMap.Entry <Integer, ArrayList<Integer>> entry: tree.entrySet()) {
                if (entry.getValue().isEmpty()) {
                    int i = entry.getKey();
                    que.add(i);
                    for (HashMap.Entry <Integer, ArrayList<Integer>> e: tree.entrySet()) {
                        int k = e.getKey();
                        ArrayList<Integer> v = e.getValue();
                        if (v.contains(i)) {
                            v.remove(v.indexOf(i));
                            tree.put(k, v);
                        }
                    }
                    tree.remove(i);
                    break;
                }
            }
        }

        while (!que.isEmpty()) {
            out.print(que.pollLast());
            out.print(" ");
        }

        out.flush();
    }
}
