import java.io.*;
import java.util.*;

public class t1777 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        ArrayList<Long> stones = new ArrayList<>();
        while (in.hasNextLong()) {
            stones.add(in.nextLong());
        }

        int steps = 1;

        long minDiff = getMinDiff(stones);

        while (minDiff != 0) {
            stones.add(minDiff);
            steps++;
            minDiff = getMinDiff(stones);
        }

        out.println(steps);

        out.flush();
    }

    private static long getMinDiff (ArrayList<Long> stones) {
        long minDiff = Math.abs(stones.get(1) - stones.get(0));
        for (int i = 0; i < stones.size() - 1; i++) {
            for (int j = i+1; j < stones.size(); j++) {
                long diff = Math.abs(stones.get(i) - stones.get(j));
                minDiff = minDiff > diff ? diff : minDiff;
            }
        }

        return minDiff;
    }
}
