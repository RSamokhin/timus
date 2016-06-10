import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;
public class t1297{
    public static void main(String[]args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s = in.readLine();
        char[] c = s.toCharArray();
        int b = 0;
        int l  = 1;
        for (int i = 0 ; i < c.length ; i++){
            int j = 0 ;
            while((i-j>=0)&&((i+j)<c.length)){
                if (c[i-j]==c[i+j]){
                    if(j*2+1>l){
                        b=i-j;
                        l=j*2+1;
                    }
                }else
                    break;
                j++;
            }
            j=0;
            while((i-j>=0)&&((i+j+1)<c.length)){
                if(c[i-j]==c[i+j+1]){
                    if((j+1)*2>l){
                        b=i-j;
                        l=(j+1)*2;
                    }
                }else
                    break;
                j++;
            }
        }
        out.println(s.substring(b, b+l));
        out.flush();
    }
}