import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class t1226 {
    public static void main (String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        LinkedList<Character> charArray = new LinkedList<>();
        LinkedList<Character> wordArray = new LinkedList<>();
        try {
            int next = System.in.read();
            while (next != -1) {
                charArray.add((char) next);
                next = System.in.read();
            }
        } catch (IOException e) {
           out.println(e);
        }
        while (!charArray.isEmpty()) {
            char next = charArray.pollFirst();
            if (Character.toString(next).matches("[a-zA-z]{1}")) {
                wordArray.add(next);
            } else {
                while (!wordArray.isEmpty()) {
                    out.print(wordArray.pollLast());
                }
                out.print(next);
            }
        }
        if (wordArray.isEmpty()) {
//            out.println();
        }
        while (!wordArray.isEmpty()) {
            out.print(wordArray.pollLast());
        }
        out.flush();
    }
}
