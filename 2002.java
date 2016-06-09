import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        HashMap <String,Integer> l = new HashMap<>();
        HashMap<String,String> h = new HashMap<>();
        for (int i = 0 ; i <= n ; i++){
            String[] s = in.nextLine().split(" ");
            switch(s[0]){
                case  "register":
                    if (h.containsKey(s[1]))
                        out.println("fail: user already exists");
                    else{
                        h.put(s[1],s[2]);
                        l.put(s[1],0);
                        out.println("success: new user added");
                    }
                    break;
                case "login":
                    if (h.containsKey(s[1]))
                        if (h.get(s[1]).equals(s[2]))  
                            if(l.get(s[1])==1){
                                out.println("fail: already logged in");
                            }else{
                                l.put(s[1], 1);
                                out.println("success: user logged in");
                            }
                        else
                            out.println("fail: incorrect password");
                    else
                        out.println("fail: no such user");
                    break;
                case "logout":
                    if (h.containsKey(s[1]))
                        if(l.get(s[1])==1){
                            l.put(s[1],0);
                            out.println("success: user logged out");
                        }else
                            out.println("fail: already logged out");
                    else
                        out.println("fail: no such user");
                    break;
            }
                
        }
        out.flush();
    }
}