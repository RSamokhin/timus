import java.io.*;

public class main {
    public static void main(String[] args) throws IOException
    {
        BufferedInputStream bis = new BufferedInputStream(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        out.flush();
    }
    private static int readInt(InputStream in) throws IOException {
            int ret = 0;
            boolean dig = false;

            for (int c = 0; (c = in.read()) != -1; ) {
                if (c >= '0' && c <= '9') {
                    dig = true;
                    ret = ret * 10 + c - '0';
                } else if (dig) break;
        }
        return ret;
    }
}